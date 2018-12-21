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