build:
	../../bin/shutdown.sh
	javac -cp .:../../lib/servlet-api.jar WEB-INF/classes/*.java
	../../bin/startup.sh

