# GraphQL Testing with Rest Assured

This repository contains sample code and information for testing GraphQL APIs using Rest Assured. GraphQL is a powerful query language for APIs, and Rest Assured is a popular Java library for testing REST and GraphQL APIs.

## Table of Contents

- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Examples](#examples)
- [Contributing](#contributing)

## Getting Started

### Prerequisites

- Java JDK (version X.X or higher)
- Maven (version X.X or higher)
- An IDE of your choice (e.g., IntelliJ IDEA, Eclipse)

### Installation

1. Clone this repository to your local machine:

```bash
git clone https://github.com/Anshul-Sonpure/TestGraphQL.git
```
2. Open the project in your preferred IDE.
3. Install Maven dependencies by running:
```
mvn clean install
```
### Usage
In this project, I have showcase how to use Rest Assured to test GraphQL APIs. The project structure includes test classes that demonstrate various test scenarios.
- src/test/java: Contains test classes.
To run the tests, execute:
```
mvn test
```
or you can run individual classes.
#### Examples
I've included example test classes to illustrate how to test GraphQL APIs using Rest Assured. You can find these test classes in the src/test/java directory.

TestGetCall: Demonstrates testing GraphQL queries(Get).
TestPostCall: Demonstrates testing GraphQL mutations(Post).
TestPatchCall: Demonstrates testing GraphQL mutations(Patch).
TestDeleteCall: Demonstrates testing GraphQL mutations(Delete).
You can modify these examples or create new test classes based on your API requirements.

### Contributing
Contributions are welcome! If you find a bug or want to enhance the project, feel free to create a pull request. Please ensure your code follows best practices and includes appropriate tests.

Fork the repository.
- Create a new branch: git checkout -b feature/your-feature-name.
- Make changes and commit them: git commit -am 'Add new feature'.
- Push to the branch: git push origin feature/your-feature-name.
- Create a pull request.


Thank You,\
Happy Coding and Learning. 
:)

