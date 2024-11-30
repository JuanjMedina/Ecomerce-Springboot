FROM openjdk:21-jdk

WORKDIR /app

COPY build/libs/Ecomerce-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "Ecomerce-0.0.1-SNAPSHOT.jar"]