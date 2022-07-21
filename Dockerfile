FROM openjdk:11 as base 
WORKDIR /app
ADD . /app 
RUN chmod +x gradlew
RUN ./gradlew build 
COPY --from=base /app/build/libs/ampleWeb-0.0.1-SNAPSHOT.war
RUN rm -rf ROOT && mv sampleWeb-0.0.1-SNAPSHOT.war ROOT.war

# FROM tomcat:9
# WORKDIR webapps
# COPY --from=base /app/sampleWeb-0.0.1-SNAPSHOT.war
# RUN rm -rf ROOT && mv sampleWeb-0.0.1-SNAPSHOT.war ROOT.war