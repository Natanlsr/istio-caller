FROM openjdk:8-jre-alpine3.9

ENV APP_TARGET target
ENV APP demo-1.0.jar

RUN mkdir -p /opt
COPY ${APP_TARGET}/${APP} /opt

ENTRYPOINT exec java ${JAVA_OPTS} ${JAVA_AGENT} ${MEM_PARAMS} -jar /opt/${APP}
