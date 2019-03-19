
JAVAC=/usr/bin/javac

.SUFFIXES: .java .class

.java.class:
	$(JAVAC) $<

classes: BinaryTreeNode.class BinaryTree.class \
        BTQueueNode.class BTQueue.class  \
        BinarySearchTree.class Record.class Printit.class \
        Searchit.class  SearchitLinear.class \
	SearchitExperiment.class SearchitLinearExperiment.class

default: $(CLASSES)

clean:
	rm *.class


