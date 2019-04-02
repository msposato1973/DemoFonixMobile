# DemoFonixMobile
Java Technical Interview Challenge   

Introduction 
 
This document outlines the technical challenge to be completed as part of the job application for Fonix. If it takes longer than three hours to complete it don’t worry, you can deliver your code and we’ll complete it in a pairing session during the face-to-face interview. 
 
Challenge requirements 
 Language  This challenge must be completed in java  
 
Libraries Using Spring or Spring Boot is considered a plus, but you can use anything              you want. To avoid the overhead of setting up a database, we suggest you to use H2               Memory Database. You can use anything equivalent or set up any other            standard DBMS. Feel free to use any other available resources to complete the challenge.  
 
If you are planning on using a library/technology that you have never used,             make sure to understand how it works before you start working on the             challenge - in this way you won’t lose time. 
 
Code repository Using git and pushing to github regularly throughout your project is considered            a plus.  
 
 
Challenge requirements 
 
Overview Imagine that you are building a web crawler to offer to your subscribers the possibility to receive the best deals for flights from and to a particular destination in the world. 
 
 You are not asked to build the web crawler itself, that would be madness, you are asked to create a simple web application that: 
 
1) allows a user to enter their email address, origin and destination of the flight they are interested in and the frequency at which the user wants to receive the offers. To simplify, flight’s origin and destination can be any string and doesn’t need to be validated. As an example you can have origin XXX and destination: YYY.  
 
Frequencies should be: 
 
- Maximum 1 offer daily; - Maximum 2 offers daily; - Maximum 1 offer weekly; - Maximum 1 offer monthly; - Uncapped (Always send the best available deal when available); 
 
2) confirm the email address by generating a token and sending the confirmation url to the email address (simulate this step by printing the body of the message to the STDOUT). 
 
3) create an API for the crawler which will get and save: origin airport code, destination airport code, flight number, date/time and price. 
 
4) send the emails (print to STDOUT) with the offers to the interested users taking into account the maximum frequency they set up when signing up (the crawler could potentially send you 10 different offers the same day for the same origin-destination pair). 
 
Suggestions 
 
Don’t waste too much time on the front end, something basic is fine as we are more interested in the back-end. 


to look on DB h2 go to url : http://localhost:8080/console/
user/psw are descripted in .properties file in  to resource folder.

This proget i've done using Spring STS end run from this.
- To Go on project with right clicp on mouse >Run As> Spring Boot App

there are also .sql files, one represents the schema, and the other are the db initialization scripts.

The email does not work for google policy reasons, in fact it does not allow access from the outside.
every  attributes is in the application. Properties File: 
