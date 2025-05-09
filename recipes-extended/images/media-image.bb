DESCRIPTION = "Multimedia image for LicheePi Zero Dock"

IMAGE_FEATURES += "splash ssh-server-openssh"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    ${CORE_IMAGE_EXTRA_INSTALL} \
"

inherit core-image

FB_TOOLS = " \
    fb-test \
    fbset-modes \
    fbset \
    libdrm-tests \
"

WIFI_TOOLS = " \
    kernel-modules \
    rtl8723bs-wireless \
    wpa-supplicant \
"

MISC_TOOLS = " \
    strace \
    vim \
    htop \
    lsof \
    e2fsprogs-resize2fs \
    os-release \
    lsb-release \
    usbutils \
    libusbgx \
    tzdata \
    tmux \
"

MEDIA_TOOLS = " \
    v4l-utils \
    alsa-utils \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-bad \
    gstreamer1.0-plugins-ugly \
    gstreamer1.0-libav \
    opencv-apps \
    zbar \
    ffmpeg \
"

PERF_TOOLS = " \
    perf \
    gperf \
    gperftools \
    uftrace \
"

IMAGE_INSTALL:append = " \
    ${WIFI_TOOLS} \
    ${FB_TOOLS} \
    ${MISC_TOOLS} \
    ${MEDIA_TOOLS} \
"
