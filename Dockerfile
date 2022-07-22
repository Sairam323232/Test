FROM openjdk:11 as base
WORKDIR /app
ADD . .
RUN chmod +x gradlew
RUN ./gradlew build