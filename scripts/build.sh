#!/bin/sh
#URL=$(pwd)
branch=${1:-master}
#unset GIT_WORK_TREE
#git clone $URL
#echo $branch
#cd JavaTest
echo "BRANCH"
echo $branch
git checkout $branch
mvn clean install -DskipTests=True
#cd ..
#rm -rf JavaTest