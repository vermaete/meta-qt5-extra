SUMMARY = "KSE sysguard library"
LICENSE = "GPL-2.0 & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma gettext

DEPENDS += " \
    kauth-native \
    ki18n \
    kwindowsystem \
    kconfig-native \
    kservice \
    kcompletion \
    kwidgetsaddons \
    kio \
    kcoreaddons \
    kcoreaddons-native \
    kpackage-native \
    kwallet \
    kitemviews \
    kitemmodels \
    kxmlgui \
    kconfigwidgets \
    kiconthemes \
    solid \
    kdbusaddons \
    knotifications \
    plasma-framework \
    kdeclarative \
    kinit \
    modemmanager-qt \
    networkmanager-qt \
    sonnet-native \
    qca \
    \
    networkmanager \
"

# REVISIT optionals
# KF5ModemManagerQt
# ModemManager PROPERTIES
# MobileBroadbandProviderInfo

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "ab3fdcf10d6d1db431c64101d3eee7481d213cd98f048a1e9445f2aec083ee38"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

RDEPENDS:${PN} = "networkmanager"

FILES:${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/plasma \
    ${datadir}/kcm_networkmanagement/qml \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
    ${libdir}/*.so \
"
