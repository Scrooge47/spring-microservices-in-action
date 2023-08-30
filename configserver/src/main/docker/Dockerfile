FROM amazoncorretto:17-alpine-jdk as build

WORKDIR application

COPY maven/configserver-0.0.1-SNAPSHOT.jar application.jar

RUN java -Djarmode=layertools -jar application.jar extract

FROM amazoncorretto:17-alpine-jdk

WORKDIR application

COPY --from=build application/dependencies/ ./
COPY --from=build application/spring-boot-loader/ ./
COPY --from=build application/snapshot-dependencies/ ./
COPY --from=build application/application/ ./

ENTRYPOINT ["java","org.springframework.boot.loader.JarLauncher"]

