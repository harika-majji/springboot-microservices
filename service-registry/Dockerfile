FROM eclipse-temurin:17
LABEL mentainer = "Service Registry"
WORKDIR /app
COPY target/service-registry-0.0.1-SNAPSHOT.jar /app/service-registry.jar
EXPOSE 8761
ENTRYPOINT  ["java","-jar","service-registry.jar"]