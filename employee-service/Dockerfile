FROM eclipse-temurin:17
LABEL mentainer = "Employee Service"
WORKDIR /app
COPY target/employee-service-0.0.1-SNAPSHOT.jar /app/employee-service.jar
EXPOSE 8080
ENTRYPOINT  ["java","-jar","employee-service.jar"]