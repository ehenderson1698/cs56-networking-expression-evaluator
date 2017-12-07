# cs56-networking-expression-evaluator

##F17 final remarks
This project is a networking expression evaluator that accepts expressions over a server connection.
It works with simple expressions with two operands and one operator, such as 3+3. The project contains
a parser class that accepts a string containing the expression and saves the operands and operator
as instance variables. The evaluator class takes a parser object and returns the resulting value.
The server then sends it back to the client. This project utilizes gradle as a build tool.

For future iterations, the code could be refactored to accept doubles.