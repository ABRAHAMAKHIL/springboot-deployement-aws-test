from openjdk:17

WORKDIR /app

COPY ./target/spring-boot-aws-exe.jar /app

EXPOSE 8080

CMD["java","-jar","spring-boot-aws-exe.jar"]