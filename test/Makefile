C=$$C
CLASSES = SearchitTest
default:
	export CLASSPATH=.:junit-4.12.jar:hamcrest-core-1.3.jar:$CLASSPATH

classes:
	javac -cp .:junit-4.12.jar SearchitTest.java

test:
	java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore SearchitTest

