# Template Monolithic Java(back-end) + Vuejs(front-end)

This is a template project that combines a Spring Boot back-end with a Vue.js front-end.

## Development

### Back-end
- The back-end is a Spring Boot application that runs on port 8080

### Front-end
- The front-end is a Vue.js application that runs on port 3000

## Packaging 

- The Maven `frontend-maven-plugin` is used to build the Vue.js application.
- Run `mvn clean package` to build the application.
- Run `java -jar .\target\fullstackjava-0.0.1-SNAPSHOT.jar` to run the application.