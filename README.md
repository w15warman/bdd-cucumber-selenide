[![LinkedIn](https://img.shields.io/badge/-LinkedIn-black.svg?style=flat-square&logo=linkedin&colorB=555)](https://www.linkedin.com/in/artem-gonchar)

# Functional Testing using Behavior-Driven Development (BDD) approach

### Table of Contents
* [About the Project](#about-the-project)
    * [Project structure](#project-structure)
* [Running the tests](#running-the-tests)
* [Generating Allure report](#generating-allure-report)
* [Built With](#built-with)

### About The Project
This simple project was created to demonstrate how to use Cucumber and Selenide frameworks.

### Project structure
The Standart Maven Directory Structure is using on this project.
Some directories was added for future usage.
```bash
.
├── main
│   ├── java
│   │   ├── com
│   │   │   └── si
│   │   │       ├── model
│   │   │       └── pages
│   │   │           ├── menus
│   │   │           └── web
│   │   │               └── drink_details
│   │   └── framework
│   │       ├── config
│   │       └── utils
│   └── resources
│       └── env
└── test
    ├── java
    │   └── com
    │       └── si
    │           └── definitions
    └── resources
```

## Running the tests

To run tests from the terminal, go to the project root directory in the command line and enter the next command:
```
mvn clean test -P {environmentName}
```
## Generating Allure report

For generate report, use the next command in terminal after test execution:

```
mvn allure:serve
```

## Built With

* [JAVA 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk12-downloads-5295953.html) - The Java Runtime Environment.
* [Maven](https://maven.apache.org/) - Build tool
* [Cucumber](https://cucumber.io/) - The testing tool that supports Behavior Driven Development (BDD) framework.
* [Selenide](https://selenide.org/) - The framework for test automation powered by Selenium WebDriver.
* [JUnit 4](https://junit.org/junit4/) - The unit testing framework for the Java programming language.
* [Allure 2](http://allure.qatools.ru/) - Test report and framework for writing self-documented tests.