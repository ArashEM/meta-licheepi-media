DESCRIPTION = "Linux Kernel from Tarball"
SECTION = "kernel"
LICENSE = "GPLv2"

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

SRC_URI = "\
    https://cdn.kernel.org/pub/linux/kernel/v6.x/linux-${PV}.tar.xz \
    file://defconfig \
    file://001-add-mipi-csi2-ov5647-lcd.patch \
    "
SRC_URI[sha256sum] = "4a516e5ed748537a73cb42ec47fbbeb6df8b1298e8892c29c0e91de79095b297"

LINUX_VERSION ?= "${PV}"
LINUX_VERSION_EXTENSION:append = "-custom"
KERNEL_FEATURES:remove = "cfg/fs/vfat.scc"
KERNEL_EXTRA_ARGS:append = "LOADADDR=${UBOOT_ENTRYPOINT}"

S = "${WORKDIR}/linux-${PV}"
COMPATIBLE_MACHINE = "sun8i"

do_install:prepend() {
    mkdir -p "${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}"
    touch "${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/source"
}
