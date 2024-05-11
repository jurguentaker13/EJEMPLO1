
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM alpine:latest
FROM amazoncorretto:21-alpine-jdk

COPY /target/demo-0.0.1-SNAPSHOT.jar app.jar

entrypoint ["java", "-jar", "/app.jar"]

CMD ["/bin/sh"]
