DOC = doc
JAVAC=javac
JFLAGS=-g

CLASSES=Barrier.java \
	BarrierTest.java \
	BThread.java \
	

.SUFFIXES:.java .class .html

.java.class:
	$(JAVAC) $(JFLAG) $*.java

default:	classes
classes:	$(CLASSES:.java=.class)

doc:
	javadoc -d $(DOC) *.java

clean:
	$(RM) *.class

run1:
	java BarrierTest 5 5
	
run2:
	java BarrierTest 10 10
	
run3:
	java BarrierTest 20 20	

run4:
	java BarrierTest 30 30
	
run5:
	java BarrierTest 50 50
	
