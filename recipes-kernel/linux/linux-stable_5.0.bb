require linux-stable.inc

KERNEL_CONFIG_COMMAND = "oe_runmake_call -C ${S} CC="${KERNEL_CC}" O=${B} olddefconfig"
COMPATIBLE_MACHINE = "imx6-cubox"


LINUX_VERSION = "5.0"
LINUX_VERSION_EXTENSION = "-embtom"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-stable-${LINUX_VERSION}:"

S = "${WORKDIR}/git"

PV = "5.0.7"

SRCREV = "f8fa6fdf327f554a40f5fd2f75f98807eb254a22"

SRC_URI = " \ 
    git://github.com/embtom/linux.git;branch=embtom/v5.0-imx53  \
    file://defconfig \
"
