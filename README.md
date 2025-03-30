# Java Best Subsequence

[![Java](https://img.shields.io/badge/Java-21-blue.svg)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.0-blue.svg)](https://maven.apache.org/)
[![JUnit](https://img.shields.io/badge/JUnit-5-blue.svg)](https://junit.org/junit5/)

A Java implementation for finding the best subsequence in a given sequence.

## Problem Description

Given an array A of n integers and a positive integer k, find a subsequence of length k where the "special value" is minimized.

The special value of a subsequence is defined as the sum of absolute differences between consecutive elements in the subsequence.

For example, if we have a subsequence [1, 4, 2]:
- |4 - 1| = 3 (first pair)
- |2 - 4| = 2 (second pair)
- Special value = 3 + 2 = 5

### Examples

1. Basic Example:
```
Input:
n = 5, k = 3
A = [1, 2, 3, 4, 5]

Output: 2

Explanation:
Best subsequence is [1, 2, 3]
Special value = |2-1| + |3-2| = 1 + 1 = 2
```

2. Example with Negative Numbers:
```
Input:
n = 5, k = 3
A = [-1, 2, -3, 4, -5]

Output: 4

Explanation:
Best subsequence is [-1, 2, -3]
Special value = |2-(-1)| + |(-3)-2| = 3 + 5 = 8
```

3. Example with Equal Numbers:
```
Input:
n = 5, k = 3
A = [1, 1, 1, 1, 1]

Output: 0

Explanation:
Any subsequence of length 3 will give special value = 0
Because |1-1| + |1-1| = 0 + 0 = 0
```

## Project Structure

```
java-best-subsequence/
├── LICENSE.md
├── README.md
├── .gitignore
├── pom.xml
└── src/
    ├── main/
    │   └── java/
    │       └── Main.java
    └── test/
        └── java/
            └── MainTest.java
```

## Prerequisites

- Java 21 or higher
- Maven 3.0 or higher
- Git

## Installation

1. Clone the repository:
```bash
git clone git@github.com:luismr/java-best-subsequence.git
```

2. Navigate to the project directory:
```bash
cd java-best-subsequence
```

3. Build the project:
```bash
mvn clean install
```

## Usage

The program reads input from standard input (stdin) in the following format:
1. First line: integer n (array length)
2. Second line: n integers (array elements)
3. Third line: integer k (subsequence length)

Example input:
```
5
1 2 3 4 5
3
```

To run the program:
```bash
java -cp target/java-best-subsequence-1.0-SNAPSHOT.jar Main
```

## Running the Tests

To run the test suite:
```bash
mvn test
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

### Pull Request Process

1. Update the README.md with details of changes to the interface, if applicable
2. Update the documentation with any new environment variables, exposed ports, etc.
3. The PR will be merged once you have the sign-off of at least one other developer

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details. 