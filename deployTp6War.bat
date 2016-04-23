call mvn clean package
rmdir /s /q D:\tomcat\apache-tomcat-9.0.0.M4\webapps\tp6-0.0.1-SNAPSHOT
rm D:\tomcat\apache-tomcat-9.0.0.M4\webapps\tp6-0.0.1-SNAPSHOT.war
copy target\tp6-0.0.1-SNAPSHOT.war D:\tomcat\apache-tomcat-9.0.0.M4\webapps\
set /p DUMMY=Hit Enter to coninue...