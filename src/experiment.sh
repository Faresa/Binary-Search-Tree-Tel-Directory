#!/bin/bash


for count in {1..10000..500}
do
#echo datasubset = $count > searchExperiment
printf "Data Subset ~ %d" "\n" "Searchit = " , $count

time java Searchit $count                       #Append the time result of n$
printf "Searchit Linear = "
time java SearchitLinear $count #| tail -l > searchExperiment           #App$

done

