all:	fxs
.PHONY: all

# Include standard NCS examples build definitions and rules
include $(NCS_DIR)/src/ncs/build/include.ncs.mk

SRC = $(wildcard yang/*.yang)
DIRS = ncsc-out lsa-out ../load-dir
LSA = $(SRC:yang/%.yang=lsa-out/%.yang)
FXS = $(SRC:yang/%.yang=ncsc-out/modules/fxs/%.fxs)

## Uncomment and patch the line below if you have a dependency to
## other YANG files
# YANGPATH += ../../<pkg-name>/src/yang

NCSCPATH   = $(YANGPATH:%=--yangpath %)
YANGERPATH = $(YANGPATH:%=--path %)

fxs:	$(DIRS) ../package-meta-data.xml lsa ncsc-out/.done
.PHONY: fxs

lsa:	$(LSA)
.PHONY: lsa

$(DIRS):
	mkdir -p $@

../package-meta-data.xml: package-meta-data.xml.in
	rm -rf $@
	cp $< $@
	chmod -w $@

lsa-out/%.yang:	yang/%.yang
	yanger -t lsa --lsa-upper -f yang $(YANGERPATH) -o $@ $<

ncsc-out/.done:	$(LSA)
	$(NCSC) --ncs-compile-bundle lsa-out                     \
                 --ncs-device-dir ncsc-out   \
                 --ncs-device-type netconf $(NCSCPATH)           \
                 --ncs-ned-id tailf-ncs-ned:lsa-netconf           \
                 $(NCSC_EXTRA_FLAGS) &&                          \
        cp ncsc-out/modules/fxs/*.fxs ../load-dir;
	for f in `echo ../load-dir/*.fxs`; do \
           n=`basename $$f | sed 's/\.fxs//'` || exit 1; \
        done
	touch ncsc-out/.done

clean:
	rm -rf $(DIRS)
	rm -rf ../package-meta-data.xml
.PHONY: clean
