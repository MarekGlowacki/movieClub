Java application for categorizing and rating movies: I have created a movie database where anyone can register and vote for their favorite titles, but only editors and administrators have the right to add new content.

In the data access layer, I use JPA, Hibernate and Spring Data, and for database migration I use Liquibase. I created two profiles, which differ in the database engine used and where the uploded files are stored. I took care of the attractive layout of the application, using HTML, some JavaScript and CSS, and thanks to the use of Flexbox, the site is responsive and adapted to all screen sizes. Of course, the whole thing is connected by Spring MVC, the application is secured using Spring Security, and the configuration is based on Spring Boot. 

This application is on a server with its own domain using Docker, Ngix for port forwarding and https certificate security. 

https://movieclub.com.pl/
