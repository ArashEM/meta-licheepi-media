FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://usb0.network \
    file://wlan0.network \
"

FILES:${PN}:append = " \
    ${sysconfdir}/systemd/network/usb0.network \
    ${sysconfdir}/systemd/network/wlan0.network \
"

do_install:append() {
    install -d ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/usb0.network ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/wlan0.network ${D}${sysconfdir}/systemd/network
}
