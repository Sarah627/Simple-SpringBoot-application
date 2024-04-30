FROM openjdk:21-jdk-slim
VOLUME /tmp

# Define your custom variables
ARG APP_NAME=FinancialAidForm

# Set the JAR file location based on the application name
ARG JAR_FILE=target/${APP_NAME}*.jar

# Copy the application JAR file into the container
COPY ${JAR_FILE} app.jar

# Specify the entrypoint to run the application
ENTRYPOINT ["java","-jar","/app.jar"]
