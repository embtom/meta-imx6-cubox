SUMMARY = "Linux kernel"
SECTION = "kernel"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM ?= "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

DEPENDS += "bc-native bison-native openssl-native util-linux-native xz-native"

inherit kernel

#KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"