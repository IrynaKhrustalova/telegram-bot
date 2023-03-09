FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=test_Iryna_Khrustalova_bot
ENV BOT_TOKEN=6125682734:AAFBHv6CZJ-onvUHXU7xSnYGEymw9BsR95Y
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-jar", "/app.jar"]