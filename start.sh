#!/bin/bash

# Pull new changes
git pull

# Prepare Jar
mvn clean
mvn package

# Ensure, that docker-compose stopped
docker-compose stop

# Add environment variables
export BOT_DB_USERNAME='root'
export BOT_DB_PASSWORD='220491Ira!'

# Start new deployment
docker-compose up --build -d