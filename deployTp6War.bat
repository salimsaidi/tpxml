call mvn clean package
rmdir /s /q C:\Tomcat\apache-tomcat-7.0.69\webapps\tp6-0.0.1-SNAPSHOT
del C:\Tomcat\apache-tomcat-7.0.69\webapps\tp6-0.0.1-SNAPSHOT.war
copy target\tp6-0.0.1-SNAPSHOT.war C:\Tomcat\apache-tomcat-7.0.69\webapps\
set /p DUMMY=Hit Enter to coninue...