
JAVAC= javac -cp bin src/
JFLAGS= -cp 

.SUFFIXES: .java .class

compile:
	javac -d bin  src/*.java

#.java.class:
#	javac -d bin src/*.java



classes: BinaryTreeNode.class BinaryTree.class \
         BTQueueNode.class BTQueue.class  \
         BinarySearchTree.class Record.class Printit.class \
	 Searchit.class  SearchitLinear.class

default: $(CLASSES)

experiment:
	 cd bin ; bash runExperiment.sh ; cd ..


Printit:
	cd bin ; java Printit ; cd ..

Searchit:
	cd bin ; java Searchit 10000 ; cd ..
SearchitLinear:
	cd bin ;java SearchitLinear 10000 ; cd ..

clean:
	rm bin/*.class

