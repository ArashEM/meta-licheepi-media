setenv bootargs console=ttyS0,115200 root=/dev/mmcblk0p2 rootwait panic=10 cma=20M
load mmc 0:1 0x41000000 sun8i-v3s-licheepi-zero-dock.dtb
load mmc 0:1 0x41800000 uImage
bootm 0x41800000 - 0x41000000
