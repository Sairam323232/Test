FROM openjdk:11 as base 
WORKDIR /app
ADD . . 
RUN chmod +x gradlew
RUN ./gradlew build 
COPY /base /app
RUN rm -rf ROOT && mv sampleWeb-0.0.1-SNAPSHOT.war ROOT.war

# FROM tomcat:9
# WORKDIR /webapps
# COPY base /app
# RUN rm -rf ROOT && mv sampleWeb-0.0.1-SNAPSHOT.war ROOT.war