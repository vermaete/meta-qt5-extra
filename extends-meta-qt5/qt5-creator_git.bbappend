inherit cmake_extra_sanity

# yeah I know yocto does not want us to change this
PACKAGECONFIG_append = " ${@bb.utils.contains('BBFILE_COLLECTIONS', 'clang-layer', ' clang', '', d)}"

