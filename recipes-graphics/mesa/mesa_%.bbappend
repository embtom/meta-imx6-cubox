# Enable freedreno driver
PACKAGECONFIG_append = "gbm gallium"
GALLIUMDRIVERS_append = ",etnaviv,kmsro,vc4"

INSANE_SKIP_mesa-megadriver += "dev-so"

do_install_append () {
    install -d ${D}${libdir}/dri
    ln -s -r ${D}${libdir}/dri/pl111_dri.so ${D}${libdir}/dri/imx-drm_dri.so
}