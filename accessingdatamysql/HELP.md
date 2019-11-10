# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.1.RELEASE/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.1.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.2.1.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

## Used guide by Gio to do this was:

### Spring guide

The example was follow from this guide:
* [CRUD MYSQL with Spring boot](https://spring.io/guides/gs/accessing-data-mysql/) 

### MYSQL and Docker 

Docker image:

* Reference: [Docker Hub](https://hub.docker.com/_/mysql?tab=description)

The executed commands for docker were

```
docker pull mysql:8 
docker run --name mysql -e MYSQL_ROOT_PASSWORD=javeriana123 -p=3306:3306 -d mysql:8 
```
### Spring Annotations and error handling

* [Spring annotations](New Spring MVC Request Annotations)
* [Error Handling](https://www.baeldung.com/exception-handling-for-rest-with-spring)

