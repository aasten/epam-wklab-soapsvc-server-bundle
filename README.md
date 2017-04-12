# Task

Web Service

Create class Person with fields:

*Name
*Birthday
*Friends

Implement SOAP Web service with one method that has 2 arguments (Person and year) and returns Friends of the given person that were born on particular year. 

In case Person doesn’t have any Friends that were born on specified year SOAP response must have Fault section.
WSDL must have meaningful parameters’ names (not like arg0).

Client

Implement a client application for the Web Service above.
Demonstrate work of the Web Service in it.

# Solution

Run server first with:
```
cd server/
mvn package tomcat7:run-war
```
The run client with:
```
cd client/
mvn exec:java
```
