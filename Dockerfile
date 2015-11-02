FROM java:openjdk-7-jdk

ADD target/WordReverse-1.0-SNAPSHOT.jar  /data/WordReverse-1.0-SNAPSHOT.jar

CMD java -jar /data/WordReverse-1.0-SNAPSHOT.jar server

EXPOSE 8080