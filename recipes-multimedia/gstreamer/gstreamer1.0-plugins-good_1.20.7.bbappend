FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://001-disable-colorimetry-by-default.patch \
"
