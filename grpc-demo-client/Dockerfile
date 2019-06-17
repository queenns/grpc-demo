#基础镜像jdk8
FROM 10.32.40.44:8080/xcar_base/oraclejdk8:8.192.12-cleaned

WORKDIR /grpc-demo-client

ADD target/grpc-demo-client.jar /grpc-demo-client/grpc-demo-client.jar

CMD java -jar -Duser.timezone=GMT+08 /grpc-demo-client/grpc-demo-client.jar