build:
	../../bin/shutdown.sh
	javac -cp .:/usr/local/apache-tomcat-8.0.21/lib/servlet-api.jar WEB-INF/classes/*.java
	../../bin/startup.sh

