# Version 0.0.1.snapshots
FROM centos
MAINTAINER MARSPIE "marspie@126.com"

# 安装 wget
RUN yum -y install wget 
RUN rm -rf /etc/yum.repos.d/* 
RUN wget -O /etc/yum.repos.d/CentOS-Base.repo http://mirrors.aliyun.com/repo/Centos-7.repo 
RUN yum clean all

# 安装网络工具
RUN yum -y install net-tools
RUN yum install -y openssh-server sudo
RUN sed -i 's/UsePAM yes/UsePAM no/g' /etc/ssh/sshd_config
#RUN useradd root  
RUN echo "root:root" | chpasswd  
RUN echo "root   ALL=(ALL)       ALL" >> /etc/sudoers  
RUN ssh-keygen -t dsa -f /etc/ssh/ssh_host_dsa_key  
RUN ssh-keygen -t rsa -f /etc/ssh/ssh_host_rsa_key  
# 启动sshd服务并且暴露22端口  
RUN mkdir /var/run/sshd  
EXPOSE 22  

CMD ["/usr/sbin/sshd", "-D"]