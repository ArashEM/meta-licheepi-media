FILESEXTRAPATHS:prepend:sunxi := "${THISDIR}/files:"

SRC_URI:remove = "file://boot.cmd"
SRC_URI:append = "file://licheepi-boot.cmd"

do_compile:prepend() {
    cp ${WORKDIR}/licheepi-boot.cmd ${WORKDIR}/boot.cmd
}
