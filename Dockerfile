# Build stage
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 8080
COPY --from=build /app/build/libs/*.jar app.jar
WORKDIR /app
FROM eclipse-temurin:21-jre-alpine
# Runtime stage

RUN ./gradlew bootJar --no-daemon
RUN chmod +x ./gradlew
COPY src src
COPY gradlew build.gradle settings.gradle ./
COPY gradle gradle
WORKDIR /app
FROM eclipse-temurin:21-jdk-alpine AS build

