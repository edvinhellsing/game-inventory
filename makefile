#
# @author Edvin Hellsing
# @version 1.0
#

all: 
	javac -d classes *.java

run: 
	make all
	java -cp classes foo.RetroGames

clean:
	rm -rf classes

clean_classes:
	rm -rf *.class