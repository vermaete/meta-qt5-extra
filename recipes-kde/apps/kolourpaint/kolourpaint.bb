SUMMARY = "KolourPaint - Paint Program"
LICENSE = "GPL-2.0-only & GFDL-1.2 & LGPL-2.0-only & MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7549f6da638b0246572ed9cf4275b860 \
    file://COPYING.DOC;md5=28d73eafa40ebd0ccdc6b37df8de10a3 \
    file://COPYING.LIB;md5=3214f080875748938ba060314b4f727d \
"

inherit kde-apps gtk-icon-cache mime-xdg

DEPENDS += "\
    kauth-native \
    kconfig-native \
    sonnet-native \
    kdoctools-native \
    kdelibs4support-native \
    kdesignerplugin-native \
    kdelibs4support \
    kconfigwidgets \
    kcoreaddons-native \
    kdoctools \
    ki18n \
    kiconthemes \
    kio \
    kcmutils \
    knotifications \
    kwidgetsaddons \
    kxmlgui \
    libkexiv2 \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "7bffb89612f51279b93c727e153f0dc5c7e0c22e95d1fef93341c57dc22f4a8e"

FILES:${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"
