#!/bin/bash

# Pull new changes
git pull

# Prepare Jar
mvn clean
mvn package

# Start new deployment
docker-compose up --build -d