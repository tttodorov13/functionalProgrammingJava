#!/usr/bin/env bash
rm -fR ./gameOfLife gameOfLife.jar && mkdir ./gameOfLife && javac -d ./ ./src/gameOfLife/* && jar -cvf gameOfLife.jar ./gameOfLife/* && java -classpath gameOfLife.jar gameOfLife.Main
