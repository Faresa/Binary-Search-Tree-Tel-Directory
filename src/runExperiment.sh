#!/bin/bash

make
cd bin
#TIMEFORMAT=%R

touch searchExperiment
for count in {1000..10001..500}
do
echo
echo
echo Data Subset is $count
echo
sleep 4s
#java SearchitExperiment $count
time java Searchit $count
echo
sleep 6s
echo
echo
time java SearchitLinear $count 
echo
sleep 6s
done
cd ..
