#!/bin/bash

cat testdata |
	awk 'BEGIN {}
		{split($0,a," ~")} {printf("%s\n",a[1]); }
		END{ }' 
 

