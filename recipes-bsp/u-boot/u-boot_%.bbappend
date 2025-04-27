FILESEXTRAPATHS:prepend:sunxi := "${THISDIR}/files:"

SRC_URI:append:sunxi = " \
    file://uEnv.txt \
"

UENV_FILE = "uEnv.txt"

do_deploy:append:sunxi() {
    install -m 644 ${WORKDIR}/${UENV_FILE} ${DEPLOYDIR}/${UENV_FILE}
}
