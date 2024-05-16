
FILE=App

all:
	echo "Running ${FILE}" && javac ${FILE}.java && clear && java ${FILE}

run:
	clear && javac App.java && java App

clean:
	ls | grep -e ".class" | xargs -I {} rm {}
