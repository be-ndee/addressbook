build:
	../../bin/shutdown.sh
	javac -cp .:../../lib/servlet-api.jar WEB-INF/classes/*.java
	javac -cp .:../../lib/servlet-api.jar WEB-INF/classes/models/*.java
	../../bin/startup.sh

bower:
	bower install
	bower update
