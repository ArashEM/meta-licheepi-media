FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://90-v3s-media.rules \
    file://ir-ntp.conf \
"

FILES:${PN}-udev-rules:append = " \
    ${sysconfdir}/udev/rules.d/90-v3s-media.rules \
"

FILES:${PN}:append = " \
    ${sysconfdir}/systemd/timesyncd.conf.d/ir-ntp.conf \
"

do_install:append() {
    install -d ${D}${sysconfdir}/udev/rules.d/
    install -m 0644 ${WORKDIR}/90-v3s-media.rules ${D}${sysconfdir}/udev/rules.d/

    install -d ${D}${sysconfdir}/systemd/timesyncd.conf.d/
    install -m 0644 ${WORKDIR}/ir-ntp.conf ${D}${sysconfdir}/systemd/timesyncd.conf.d/
}
