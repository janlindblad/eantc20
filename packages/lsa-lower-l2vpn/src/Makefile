all: fxs
.PHONY: all

# Include standard NCS examples build definitions and rules
include $(NCS_DIR)/src/ncs/build/include.ncs.mk

SRC = $(wildcard yang/*.yang)
DIRS = ../load-dir java/src/$(JDIR)/$(NS)
FXS = lsa $(SRC:yang/%.yang=../load-dir/%.fxs)
LSA = $(SRC:yang/%.yang=lsa-out/%.yang)
DIRS += lsa-out

## Uncomment and patch the line below if you have a dependency to a NED
## or to other YANG files
# YANGPATH += ../../<ned-name>/src/ncsc-out/modules/yang \
# 	../../<pkt-name>/src/yang

NCSCPATH   = $(YANGPATH:%=--yangpath %)
YANGERPATH = $(YANGPATH:%=--path %)

fxs: $(DIRS) $(FXS)

lsa: $(LSA)
.PHONY: lsa

$(DIRS):
	mkdir -p $@

lsa-out/%.yang: yang/%.yang
	yanger -t lsa --lsa-lower -f yang $(YANGERPATH) -o $@ $<

../load-dir/%.fxs: lsa-out/%.yang
	$(NCSC)  `ls $*-ann.yang  > /dev/null 2>&1 && echo "-a $*-ann.yang"` \
             $(NCSCPATH) -c -o $@ $<

clean:
	rm -rf $(DIRS)
.PHONY: clean
