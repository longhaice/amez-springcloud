#!/usr/bin/env bash
#jenkins应用名称
project=$1
#应用名称
app=config-server
#模块名称
module=common
#jenkisn代码目录
cd /root/.jenkins/workspace/${project}/${module}/${app}
#maven打包和推镜像
mvn clean package -Pimagek8s docker:build -DpushImage
#yml目录
cd src/main/resources/deploy/yml
#部署
kubectl apply -f image.yml

