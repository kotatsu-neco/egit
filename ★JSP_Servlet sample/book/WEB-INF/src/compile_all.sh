#!/bin/sh
cd $(dirname "$0")
set -x
./compile.sh bean/*.java
./compile.sh dao/*.java
./compile.sh tool/*.java
./compile.sh chapter3/*.java
./compile.sh chapter4/*.java
./compile.sh chapter5/*.java
./compile.sh chapter6/*.java
./compile.sh chapter9/*.java
./compile.sh chapter10/*.java
./compile.sh chapter11/*.java
./compile.sh chapter12/*.java
./compile.sh chapter14/*.java
./compile.sh chapter15/*.java
./compile.sh chapter16/*.java
./compile.sh chapter17/*.java
./compile.sh chapter18/*.java
./compile.sh chapter19/*.java
./compile.sh chapter20/*.java
./compile.sh chapter21/*.java
./compile.sh chapter22/*.java
./compile.sh chapter23/*.java
./compile.sh chapter24/*.java
./compile.sh chapter25/*.java
