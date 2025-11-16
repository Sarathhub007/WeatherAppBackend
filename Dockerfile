# STEP 1 — Build the app using Maven
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app

# Copy only pom.xml first (better caching)
COPY pom.xml .

RUN mvn -q -e -DskipTests dependency:go-offline

# Copy the rest of the source code
COPY src ./src

RUN mvn package -DskipTests

# STEP 2 — Run the JAR using JDK
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]
