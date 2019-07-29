require linux-stable.inc

KERNEL_CONFIG_COMMAND = "oe_runmake_call -C ${S} CC="${KERNEL_CC}" O=${B} olddefconfig"
COMPATIBLE_MACHINE = "imx6-cubox"


LINUX_VERSION = "5.0"
LINUX_VERSION_EXTENSION = "-embtom"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-stable-${LINUX_VERSION}:"

S = "${WORKDIR}/git"

PV = "5.0.7"

SRCREV = "3ccbce669825529e19645dcfc0de5a6defc17d1f"

SRC_URI = " \ 
    git://github.com/embtom/linux.git;branch=feature/dwav-usb-mt  \
    file://defconfig \
"
