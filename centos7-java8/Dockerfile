# Version 0.0.1.snapshots
FROM centos
MAINTAINER MARSPIE "marspie@126.com"

# 将jdk8添加到容器中   
ADD jdk-8u152-linux-x64.tar.gz /usr/local/

# 配置java环境变量 
ENV JAVA_HOME /usr/local/jdk1.8.0_152
ENV CLASSPATH $JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
ENV PATH $PATH:$JAVA_HOME/bin 
