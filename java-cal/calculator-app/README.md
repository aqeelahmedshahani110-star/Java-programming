# Calculator Application

This is a simple calculator application developed in Java. It provides basic arithmetic operations such as addition, subtraction, multiplication, and division.

## Project Structure

```
calculator-app
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── calculator
│   │               ├── Main.java
│   │               ├── Calculator.java
│   │               └── utils
│   │                   └── MathOperations.java
│   └── test
│       └── java
│           └── com
│               └── calculator
│                   └── CalculatorTest.java
├── pom.xml
└── README.md
```

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven

## Building the Project

To build the project, navigate to the project directory and run the following command:

```
mvn clean install
```

## Running the Application

After building the project, you can run the application using the following command:

```
mvn exec:java -Dexec.mainClass="com.calculator.Main"
```

## Running Tests

To run the unit tests, use the following command:

```
mvn test
```

## Usage

Once the application is running, follow the prompts to perform arithmetic operations. You can enter two numbers and select the desired operation.

## License

This project is licensed under the MIT License.