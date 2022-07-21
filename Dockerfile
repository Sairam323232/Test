FROM openjdk:11 as base
WORKDIR /app
ADD . .
RUN chmod +x gradlew
RUN ./gradlew build

FROM tomcat:9
WORKDIR webapps
ADD --from=base /app/build/libs/sample/0.0.1-SNAPSHOT.war .
RUN rm -rf ROOT && mv sample/0.0.1-SNAPSHOT.war ROOT.war