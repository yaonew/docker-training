## centos7-jdk8-tomcat8 镜像制作 ##

### Apache 官网下载tomcat8
	https://tomcat.apache.org/download-80.cgi
	这里以下载的 apache-tomcat-8.5.24.tar.gz 为例
	
### 编写Dockerfile
```
# Version 0.0.1.snapshots
# 基于centos7-jdk8 构建
FROM marspie/centos7-jdk8:0.0.1
MAINTAINER MARSPIE "marspie@126.com"

# 将tomcat8添加到容器中   
ADD apache-tomcat-8.5.24.tar.gz /usr/local/

# 配置环境变量
ENV TOMCAT_HOME /usr/local/apache-tomcat-8.5.24  
ENV PATH $PATH:$TOMCAT_HOME/lib:$TOMCAT_HOME/bin  
  
# 容器运行暴露端口  
EXPOSE 8080  

ENTRYPOINT ["/usr/local/apache-tomcat-8.5.24/bin/catalina.sh", "run"]
```

### build
```
root@ubuntu:/home/alex/docker2/centos7-jdk8-tomcat8# docker build -t marspie/centos7-jdk8-tomcat8:0.0.1 .
Sending build context to Docker daemon   9.49MB
Step 1/7 : FROM marspie/centos7-jdk8:0.0.1
 ---> 875393d2fff2
Step 2/7 : MAINTAINER MARSPIE "marspie@126.com"
 ---> Using cache
 ---> 619a6387d6c4
Step 3/7 : ADD apache-tomcat-8.5.24.tar.gz /usr/local/
 ---> 91f98f00ab89
Removing intermediate container 2a3b8f07edcd
Step 4/7 : ENV TOMCAT_HOME /usr/local/apache-tomcat-8.5.24
 ---> Running in c4c3318ac543
 ---> 1088d93bfdca
Removing intermediate container c4c3318ac543
Step 5/7 : ENV PATH $PATH:$TOMCAT_HOME/lib:$TOMCAT_HOME/bin
 ---> Running in 870959014fe1
 ---> 97e39215dd54
Removing intermediate container 870959014fe1
Step 6/7 : EXPOSE 8080
 ---> Running in f9446775ffa1
 ---> 3c38233d3893
Removing intermediate container f9446775ffa1
Step 7/7 : ENTRYPOINT /usr/local/apache-tomcat-8.5.24/bin/catalina.sh run
 ---> Running in 54f50458a010
 ---> 96048901443e
Removing intermediate container 54f50458a010
Successfully built 96048901443e
Successfully tagged marspie/centos7-jdk8-tomcat8:0.0.1
```

### docker images
查看制作好的 docker镜像
```
# docker images
REPOSITORY                         TAG                 IMAGE ID            CREATED              SIZE
marspie/centos7-jdk8-tomcat8       0.0.1               96048901443e        About a minute ago   601MB

```
