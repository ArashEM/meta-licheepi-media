# Introduction
This is BPS layer for [LicheePi Zero Dock](https://licheepizero.us/) which enables most of it's media capabilities. Including:
1. video engine (`h.264` decoder)
1. display engine (with `800x480p` LCD)
1. mipi-csi2 (with `ov5640` camera)


Before using LicheePi-Zero-Dock mipi-csi2 interface, please check [v3s-mipi-csi2 repository](https://github.com/ArashEM/v3s-mipi-csi2). You need to do some hardware things!  


# Getting started
1. Clone required layers:
```bash
git clone git://git.yoctoproject.org/poky -b kirkstone
cd poky/
git clone https://github.com/linux-sunxi/meta-sunxi.git -b kirkstone
git clone https://github.com/openembedded/meta-openembedded.git -b kirkstone
git clone git@github.com:ArashEM/meta-licheepi-media.git -b kirkstone
cd ../
```
2. Export template configuration path and initialize build environment
```bash
export TEMPLATECONF=${TEMPLATECONF:-meta-licheepi-media/conf}
source poky/oe-init-build-env licheepi-zero-dock
```
3. Start build process
```bash
bitbake media-image
```
4. Flash `wic` image into your SD card
```bash
sudo dd if=tmp/deploy/images/licheepi-zero-dock/media-image-licheepi-zero-dock.sunxi-sdimg of=/dev/sdX
```
5. Enjoy :-)