FROM eclipse-temurin:17
LABEL mentainer = "Department Service"
WORKDIR /app
COPY target/department-service-0.0.1-SNAPSHOT.jar /app/department-service.jar
EXPOSE 8081
ENTRYPOINT  ["java","-jar","department-service.jar"]