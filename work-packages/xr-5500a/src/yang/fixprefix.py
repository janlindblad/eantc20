#!/usr/bin/env python3
import os
import re
import sys

def fixprefix(yangfilename, targetdirname):
  prefix_srch = """(prefix +"*'*)([a-zA-Z0-9_-]*)("*'*;)"""
  with open(yangfilename, 'r') as yangfile:
    yangtext = yangfile.read()
    yangprefix = os.path.splitext(os.path.split(yangfilename)[1])[0]
    prefix_match = re.search(prefix_srch, yangtext)
    old_prefix = prefix_match.group(2)
    yangtext_new_prefix_stmt = re.sub(
      prefix_srch,
      f"""\\g<1>{yangprefix}\\g<3>""",yangtext,count=1)
    (yangtext_new_prefix_refs, count) = re.subn(
      """(\\W)({old_prefix}:)""",
      f"""\\g<1>{yangprefix}:""",yangtext_new_prefix_stmt)
    if(count!=0):
      print(f'{yangfilename}: replaced {count} prefix references')
    with open(targetdirname + '/' + yangfilename, "w") as targetyangfile:
      targetyangfile.write(yangtext_new_prefix_refs)

def main():
  for yangfile in sys.argv[1:]:
    fixprefix(yangfile, './fixed')

main()
