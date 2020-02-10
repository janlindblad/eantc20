all:	fxs
	$(MAKE) -C ../netsim  all
.PHONY: all

# Include standard NCS examples build definitions and rules
include $(NCS_DIR)/src/ncs/build/include.ncs.mk

#SRC = $(wildcard yang/*.yang)
SRC = yang/Cisco-IOS-XR-ifmgr-cfg.yang

FXS = $(SRC:yang/%.yang=ncsc-out/modules/fxs/%.fxs)
DIRS =  ncsc-out ../load-dir
NED_ID_ARG = $(shell [ -x ${NCS_DIR}/support/ned-ncs-ned-id-arg ] && \
               ${NCS_DIR}/support/ned-ncs-ned-id-arg package-meta-data.xml.in)

## Uncomment and patch the line below if you have a dependency to
## other YANG files
# YANGPATH += ../../<pkg-name>/src/yang

YANGPATH += $(NCS_DIR)/src/ncs/yang
NCSCPATH   = $(YANGPATH:%=--yangpath %)

fxs: $(DIRS) ../package-meta-data.xml ncsc-out/.done
.PHONY: fxs

$(DIRS):
	mkdir -p $@

../package-meta-data.xml: package-meta-data.xml.in
	rm -rf $@
	if [ -x ${NCS_DIR}/support/ned-make-package-meta-data ]; then \
	    ${NCS_DIR}/support/ned-make-package-meta-data $<;         \
	else                                                          \
	    cp $< $@;                                                 \
	fi
	chmod -w $@

#ncsc-out/.done:	$(SRC)
#	for YANGFILE in $?; do 																				\
#	  head -1 $$YANGFILE|grep submodule && continue;							\
#		echo "===== $$YANGFILE =====";															\
#		$(NCSC) --verbose --ncs-compile-module $$YANGFILE 					\
#			--prefix $$YANGFILE																				\
#			--ncs-device-dir ncsc-out 					                      \
#			--ncs-device-type netconf                       					\
#                $(NCSCPATH)                                     \
#                $(NED_ID_ARG)                                   \
#                $(NCSC_EXTRA_FLAGS) &&                          \
#	  cp ncsc-out/modules/fxs/$(YANGFILE:%.yang:%.fxs) ../load-dir;\
#  done
#	touch ncsc-out/.done

ncsc-out/.done:	$(SRC)
	$(NCSC) --ncs-compile-bundle yang                       \
                --ncs-device-dir ncsc-out                       \
                --ncs-device-type netconf                       \
                $(NCSCPATH)                                     \
                $(NED_ID_ARG)                                   \
                $(NCSC_EXTRA_FLAGS) &&                          \
        cp ncsc-out/modules/fxs/*.fxs ../load-dir;
	for f in `echo ../load-dir/*.fxs`; do \
	   true; \
	done
	touch ncsc-out/.done

clean:
	rm -rf $(DIRS)
	rm -rf ../package-meta-data.xml
	$(MAKE) -C ../netsim clean
.PHONY: clean
