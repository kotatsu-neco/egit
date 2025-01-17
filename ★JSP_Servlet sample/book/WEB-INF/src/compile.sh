#!/bin/sh
DIR=$(cd $(dirname "$0") && pwd)
CLASSPATH="$DIR/../../../../lib/servlet-api.jar:$CLASSPATH"
export CLASSPATH
javac -encoding utf-8 -d ../classes -sourcepath . $@
