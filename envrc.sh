#!/bin/bash

# Top env
export TOPDIR="$( cd "$(dirname "$0")" >/dev/null 2>&1 ; pwd -P )"
export PATH=`find $TOPDIR/vendor/ -name "apache-tomcat-*" -type d | sort | head -n 1`/bin:$PATH
export PATH=`find $TOPDIR/vendor/ -maxdepth 2 -name "eclipse" -type d`:$PATH
export PATH=`find $TOPDIR/vendor/ -maxdepth 2 -name "jdk*" -type d`/bin:$PATH
