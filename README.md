## Table of contents
* [General info](#general-info)
* [How to use](#how-to-use)
* [How to run](#how-to-run)

## General info
This is a simple calculator that uses instructions stored in a text file to perform operations.
The instructions will ignore mathematical precedence.
	
## How to use
The calculator works with the instructions given in the text file.
The basic instructions that can be used in the calculator:

* ADD (addition e.g. ADD 4)
* MULTIPLY (multiplication e.g. MULTIPLY 4)
* SUBTRACT (subtraction e.g. SUBTRACT 4)
* DIVIDE (division e.g. DIVIDE 4)
* APPLY (approval e.g. APPLY 4)
	
Sample result:
2 * 5 + 5 / 3 + 10 + (-10) = 5

```
ADD: 2.0
MULTIPLY: 5.0
ADD: 5.0
DIVIDE: 3.0
ADD: 10.0
APPLY: -10.0

Output: 5.0
```
  
## How to run
After compiling and building the artifact copy the jar file and the input.txt file to the same folder

1. Run the command line
2. Go to the folder with the Calculator.jar file (e.g. Calculator
3. Run the program with the command 'java -jar Calculator.jar'

```
$ cd ../Calculator
$ java -jar Calculator.jar
```
