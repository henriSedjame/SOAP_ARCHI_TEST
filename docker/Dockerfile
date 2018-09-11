FROM shinyay/docker-glassfish5:latest

MAINTAINER hsedjame "sedhjo@gmail.com"

COPY /target/soa.war $GLASSFISH_HOME/glassfish/domains/domain1/autodeploy/
COPY /docker/start.sh /

EXPOSE 8080 4848

