FROM openjdk:8
EXPOSE 8081
ADD target/demo-gitaction.jar demo-gitaction.jar
ENTRYPOINT ["java","-jar","/demo-gitaction.jar"]