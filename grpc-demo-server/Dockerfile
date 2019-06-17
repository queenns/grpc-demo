#基础镜像jdk8
FROM 10.32.40.44:8080/xcar_base/oraclejdk8:8.192.12-cleaned

#创建项目空间
WORKDIR /grpc-demo-server

#添加jar包
ADD target/grpc-demo-server.jar /grpc-demo-server/grpc-demo-server.jar

CMD java -jar -Duser.timezone=GMT+08 /grpc-demo-server/grpc-demo-server.jar