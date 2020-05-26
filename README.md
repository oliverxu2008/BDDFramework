# BDDFramework
BDD Framework for Web Test Automation Java + Cucumber + Selenium + Maven

## Setup Details
### Java
Need install the latest JDK first

Then set environment variable

JAVA_HOME=C:\Java\jdk1.8.0_221

path : %JAVA_HOME%\bin

### eclipse IDE
### git bash for cmd line
### Maven
Set environment variable

MAVEN_HOME=C:\DevTools\apache-maven-3.6.2

path : %MAVEN_HOME%\bin

### browsers (Chrome, Edge, Firefox)
### Webdriver
download webdriver for above 3 browsers

## How to run it in CMD line
mvn test -Dcucumber.options="--tags @SmokeTest"
