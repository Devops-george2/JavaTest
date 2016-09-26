#!/bin/sh
URL="https://github.com/Devops-george2/JavaTest"
mkdir -p build
cd build
branch=${1:-master}
git clone $URL
cd JavaTest
git checkout $branch
mvn clean install -DskipTests=True
cd ..
rm -rf JavaTest