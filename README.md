# Details

This project was built using SpringBoot & java17 and has a main package with a main module and two sub-modules named module-calc, module-rest. Both of them follow
Springboot structure and rules

# How to build

1. Open the project directory in the terminal
2. Use the command `./gradlew clean build` to create a clean build for the project
3. Use the command `./gradlew bootrun` to build the previous build
4. To create the jar file, use the following command, `./gradlew bootjar`
5. The build is located at `/build/libs` and should have the following name, _**calculatorAppChallenge-1.0.0**_
6. To run the jar file, use the following command `java -jar <jar file>`
7. The app can be tested using the following command `./gradlew test`
8. By using browser or other tools like postman or cURL its possible to make use of the service

# Docker

To build the docker image it is necessary to run the following command `docker compose up` and the application should now be running
