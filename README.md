# Details

This project was built using SpringBoot & java17 and has a main package with a main module and two sub-modules named module-calc, module-rest. Both of them follow
Springboot structure and rules.
# How to build

1. Open the project directory in the terminal
2. Use the command `./gradlew clean build` to create a clean build for the project
3. Use the command `./gradlew bootrun` to build the previous build
4. To create the jar file, use the following command, `./gradlew bootjar`
5. The build is located at `/build/libs` and should have the following name, _**calculatorAppChallenge-0.0.1-SNAPSHOT**_
6. To run the jar file, use the following command `java -jar <jar file>`
7. The web app can be tested using the browser or other tools like postman or cURL

TODO - build the docker file (Dockerfile & compose.yaml)  **require docker**
Build the testing package for root package 

