#!/bin/bash

cat datafile | sort | 
	awk 'BEGIN {}
		{split($0,a,"|")} {printf("%s\n",a[3]); }
		END{ }' 
 

