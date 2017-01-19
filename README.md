# Java - A Beginners Tutorial
Are you motivated to learn how to program? Do you want to learn about the most popular programming language that currently exists? Then this tutorial is for you!

In the following lines you will learn how to create basic programs using the Java programming language. As I wrote before it is the [most popular programming language](http://www.tiobe.com/tiobe-index/) that currently exists. Therefore it makes perfect sense to know Java.

Before we start here are some things you might want to know about this tutorial. In the following two sections I hope to tell you whether this tutorial is for you or not. If you have any additional questions just [open an issue](https://github.com/mvieghofer/java-hello-world/issues).

## Do you need to know how to program?
This tutorial is for beginners so you don't have to know how to program yet. Actually this tutorial is for people who just start programming. If you already know how to code in another language you might be able to just skim the parts that describe some basic concepts. 

Although we need the terminal just a few times, it is beneficial if you know how to use a terminal. If you aren't familiar with a terminal yet, you find a short [FAQ section](#faq) at the end of this file with some answers to questions you might have. If you cannot solve a problem, you can open an issue again.

## What you will learn in this tutorial
At the end of this tutorial you will know the very basics of the Java programming language. You will have written a few basic applications and hopefully you will have discovered how awesome programming is.

However this tutorial does only cover the very basics. We will not cover more advanced concepts such as Object Oriented Programming (OOP).

# Setup
If you want to write java programs you only need two things, a text editor and the JDK (Java Development Toolkit). 

If you are not sure whether you have the JDK already installed open a Terminal and type `javac -version`. This should display you something like this: 

```
javac 1.8.0_101
```

If don't get such a response you have to install the JDK. To do that go to [this website](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and download and install the appropriate version for your computer. If you are on a Windows Computer you also have to [add the installation directory to your Path](http://www.howtogeek.com/118594/how-to-edit-your-system-path-for-easy-command-line-access/). After you have done that the command from above should bring up the desired output.

Now that we know that the JDK is installed we also need a good text editor. I can recommend the [Sublime Text](https://www.sublimetext.com/) editor but you can choose any other editor, too.

For more advanced java programming there are special text editors (so called IDEs or Integrated Development Environments) with a lot of additioanl features. But I think that these editors are more distracting than helpful if you are just learning java. Therefore you will not need them by now.

The last step of this setup is to clone this repository using `git clone https://github.com/mvieghofer/java-hello-world.git`. `git` is a tool used for software development that helps you store your code on a server. This is especially helpful if you work with multiple people on a project. For this tutorial you just need to know how to download this repository but if you continue programming you should definitely learn more about `git`, too. If you don't have `git` installed or you don't know what cloning means, check out [this short tutorial](https://help.github.com/articles/cloning-a-repository/). 

After you have cloned this repository open it in your text editor. The `app` folder is your working directory. There you should create all the subfolders for the small example projects we will create. In the solution folder you can find the complete solutions for this tutorial. You can always check there how my solutions look like.

# Hello World
Typically if you learn a new programming language the first program you write is a so called 'Hello World' Program. The only thing this program does is to print 'Hello World' to the terminal. 

Before we can write any code we need to create a `helloWorld` folder inside the app directory and put a file called `HelloWorld.java` inside the `helloWorld` folder. Open this file and copy the following code into the file to have your first fully functional Hello World Program.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
``` 

Before we run it I will briefly explain what every part does. The file starts with `public class HelloWorld` which creates a new publicly visible Type called `HelloWorld`. It is important that the name of the class is the same as the name of the file (the file name only has a `.java` appendix). 

After the name we start a code block with an open curly bracket `{`. At the very end of the file this code block is closed again with `}`. In Java everything inside these curly brackets belongs together.

The `HelloWorld` class has one `public static` method called `main`. The `public` keyword indicates that this method can be called from everywhere in your program. The `static` keyword tells Java that you don't have to create an Instance of this class. This is again OOP specific and you can ignore it for now. 

The third keyword, `void`, tells you that this method returns nothing. If the method would return `int` or `String` instead of `void` we would know that   it returns an `int` or a `String` after it finishes.

After `void` comes the name of this method and inside the brackets one parameter is defined. In this case this parameter is an array of strings called `args`. This parameter can contain values that are passed from the user of your app from the outside.

This `main` method is a special method that defines the main entrypoint of your program. Every program has to have one of these methods no matter how big or small it is that has the exact same signature as the one above.

The body (that's how the code inside the method is called) inside this method contains only one line of code. Here we print the string `Hello World!` to the terminal. If you create more complex programs you will do more complex things here, of course.

Now that we know what the parts of this program do we can run it. To do this we need the Java Runtime Environment (JRE). Most computers already have the JRE installed, you've also installed it together with the JDK.

However the JRE cannot understand this code as we wrote it above, we have to translate it into a special format. The process of doing that is called compiling and the format we need to compile the source code to is called the Bytecode. This is the secret sauce of Java! Since programs are converted in Bytecode every Java program can be executed on every Computer that has the JRE installed, no matter where you've compiled it. For other programming languages such as C++ or C this is not possible.

To compile our program we need to open a terminal and navigate to the app folder of this repository. There we execute the following command `javac HelloWorld.java` which tells the Java compiler (`javac`) to compile the file `HelloWorld.java`. 

This produces a `HelloWorld.class` file which then can be executed with the command `java -cp . HelloWorld`. 

This command tells Java to execute the `HelloWorld` program in the current folder (`-cp .`). Now you should see the `Hello World!` in your terminal.

# Static Calculator
Now that you know how to create a simple Java application you can go a step further and create an application that does a little more. Lets create a calculator that can operate with two numbers.

In the app folder create a new directory called `staticCalculator` and add a new file `Calculator.java` in there. Open the `Calculator.java` file and add the following base structure of our calculator.

```java
public class Calculator {
	public static void main(String[] args) {
		// add calculator code here
	}
}
```

As you can see the main method only contains a single line comment. This code is not executed and just adds additional information for the developers. Besides the single line comments (which start with `//`) there are also mutli line comments. These comments start with `/*` and end with `*/` and can contain line breaks.

To be able to operate with two numbers we need something that holds these two numbers. Therefore we need to replace the comment with the two variable declarations `int a = 1;` and `int b = 2;`. The result should look like this:

```java
public class Calculator {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
	}
}
```
Both variables can hold integers and are initialized with the digits 1 and 2 (these values can be changed later on). There are [other datatypes](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html) we could have used but for now we stay with `int`.

To keep things simple we will only supports adding two numbers at first. Subtractions, mutliplications and divisions will be added later. When we calculated the result we need to store it somewhere. We could use one of the variables we already created - remember when I told you before that the values of the variables can be changed over time; this could be such a moment - however this might be confusing why we will create a third variable called `result`. This variable should hold the sum of `a`and `b`.

```java
public class Calculator {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int result = a + b;
		System.out.println("Result: " + result);
	}
}
```

To be able to see the result we have to print it to the console. Similar to the first example we use the `System.out.println` method to do this. You can insert any string between the apostrophes, this will only affect the final string that will be printed to the terminal.

When you compile the app with `javac Calculator.java` and then run `java -cp . Calculator` you should see `Result: 3` in your terminal.

Congratulations! We just finished the first program that calculates a value. Even though this app is rather limited in its functionality we are making great progress. 

Next we want to make the variables `a` and `b` configurable from the outside. As we've already learned above there is the `args` parameter that contains parameters passed from the outside. We can use this to let the user configure which values should be added.

When the user starts our calculator two integers should be passed to our program. Both these integers are passed inside the `args` parameter to our main method. We can set `a` to the first value of the `args` array and `b` to the second value. Our result will be dynamically calculated every time the application runs. 

Java - actually a lot of programming languages - have the specialty that they are zero based. This means that typically when you want to set or retrieve the first value of an array or any other collection you have to start at the index `0`. Now as we know that we can change the variable declarations of `a`and `b` so that they look like `int a = args[0];` and `int b = args[1];`.

```java
public class Calculator {
	public static void main(String[] args) {
		int a = args[0];
		int b = args[1];
		int result = a + b;
		System.out.println("Result: " + result);
	}
}
```

When we compile the calculator again using `javac Calculator.java` you will soon notice that this doesn't work as expected. We get an error that tells us that there are incopatible types in our assignment.

```
Calculator.java:3: error: incompatible types: String cannot be converted to int
		int a = args[0];
		            ^
Calculator.java:4: error: incompatible types: String cannot be converted to int
		int b = args[1];
		            ^
2 errors
```

The good thing about the Java compiler is that if there is an error it tells you exactly where the error is. Most of the times you can tell exactly where the error is after reading these compiler errors. 

The reason why we get this error is that Java is statically and strongly typed. That means that every variable has to have a predefined type that cannot change over time. When you create a variable of the type `int` this variable can only hold integer values and can never hold for example a string value even when the string value might be `"2"`. Don't mix that up with what I've said before about the values of variables, they can change over time. However when you assign a new value to a variable its type cannot change.

The Java type system consists of primitive datatypes such as `int` for integer values, `char` for characters or `float` for floating point numbers and classes. For each of the primitive datatypes also a class exists. There is the `Integer` class that corresponds to the `int` type and so on. 

An instance of a class is called an object. This means a variable of the type `String` is an object of the class `String`. Our `int` values on the other hand aren't objects because their type is a primitive one. If we declare them as `Integer` they would be objects, too.

One big difference between the primitive datatypes and classes is that primitive datatypes can only hold data whereas the classes also provide methods to manipulate the data the variable holds. For example you could convert an `Integer` object to a string by calling its `toString()` method.

Another difference is that primitive datatypes must have a value assigned whereas objects can also be `null`. This means that there is no value for the object and we have to treat is specially because then we cannot use any methods of the object.

The reason for the error above is that we want to assign `String` values to `int` variables. As you now know this cannot work because of Javas type system. Nevertheless we can convert `String`s into `int`s by wrapping the variable assignments with an `Integer.valueOf()` method call like this:

```java
public class Calculator {
	public static void main(String[] args) {
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int result = a + b;
		System.out.println("Result: " + result);
	}
}
```

When you compile it now, everything should work fine. You now can run the application using `java -cp . Calculator 2 3`. Take some time to play with your Calculator and test which input values work and which don't.

As may have noticed, as long as we pass two integer values to our app everything works fine. When we only pass one parameter or parameters that aren't integers we get errors, so called exceptions. For now we will ignore these and assume that the user of our program knows what parameters we expect. Later we will also handle these exceptions.

We have already come pretty far. We can start the calculator with two parameters that are then added together and the result is printed to the terminal. To have a real calculator we need to support some additional operations, though. The best way to do this is by introducing a third parameter that should be passed to our program. The use should be able to start our program like this to add the numbers 2 and 3: `java -cp . Calculator 2 3 A`. The last parameter stands for the operation the user wants to select. This calculator will support A for add, S for subtract, M for multiply and D for divide. 

To decide which operation we have to apply we have to create a branch for each supported operation that is only executed when the appropriate charater is passed by the user. We can use an `if` statement to do this.

An `if` statement only executes a code block if a certain condition is fulfilled. To add the first option to our calculator we have to check if the third value of args is equal to `A` and when this is true we calculate the sum of `a` and `b`.

```java
public class Calculator {
	public static void main(String[] args) {
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		char operation = args[2].charAt(0);
		int result = 0;

		if (operation == 'A') {
			result = a + b;
		}
		System.out.println("Result: " + result);
	}
}
```

It is a good idea to store the operation in the `operation` variable because then the rest of the code gets more readable. Also we need to get the first charater of the string stored in `args[2]` because we want the charater the user passed to our calculator. The result variable has to be initialized because it is now only set if the operation is equal to `A`.

The if condition checks if the `operation` is equal to `'A'`. Since `=` is an assignment we need another way to check for equality. In Java we can do this using `==`.

When we need more than one branch (as we do here) we can add more branches to the if statement by adding `else if` and an `else` branch. Using these concepts we can also add the branches for the other operations.

```java
public class Calculator {
	public static void main(String[] args) {
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		char operation = args[2].charAt(0);
		int result = 0;

		if (operation == 'A') {
			result = a + b;
		} else if (operation == 'S') {
			result = a - b;
		} else if (operation == 'M') {
			result = a * b;
		} else if (operation == 'D') {
			result = a / b;
		} else {
			System.out.println("Only the operations 'A', 'S', 'M' and 'D' are allowed.");
			return;
		}
		System.out.println("Result: " + result);
	}
}
```

Now we support all operations and we also have some basic error handling if the user inputs a wrong operation. The `return;` tells the program to quit this method immediately. Besides an `if` statment you can also use a `switch` statement when you have to execute one of multiple branches in your code. The same code as above using a `switch` statement would look similar to this:

```java
public class Calculator {
	public static void main(String[] args) {
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		char operation = args[2].charAt(0);
		int result = 0;

		switch (operation) {
			case 'A':
				result = a + b;
				break;
			case 'S':	
				result = a - b;
				break;
			case 'M':
				result = a * b;
				break;
			case 'D':
				result = a / b;
				break;
			default:
				System.out.println("Only the operations 'A', 'S', 'M' and 'D' are allowed.");
				return;
		}
		System.out.println("Result: " + result);
	}
}
```

Each branch in the `if` from above gets covered by a `case` branch here. Inside this `case` branch there is the opertation as well as a `break` statement. This is important to exit the switch after something was executed. Otherwise multiple cases might get executed, for example the `case 'M'` and the `default` branch. Similar to the `else` branch there is the `default` case inside the `switch` statement which is executed when no other condition is met.

The last step to complete our static calulcator would be to add some more error handling. As we found out previously we need to check if the `args` array has enough entries (3 in this case) and if the first two entries are integers. We can do this using the things we just learned.

```java
public class Calculator {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("You need to pass three parameters to this Calculator. " +
				"The first two must be integers and the last one a character that " +
				"defines the operation (A, S, M or D)");
			return;
		}

		int a = 0;
		int b = 0;
		char operation = args[2].charAt(0);
		int result = 0;

		try {
			a = Integer.valueOf(args[0]);
		} catch (NumberFormatException e) {
			System.out.println("The first parameter is not an integer!");
			return;
		}

		try {
			b = Integer.valueOf(args[1]);
		} catch (NumberFormatException e) {
			System.out.println("The second parameter is not an integer!");
			return;
		}

		switch (operation) {
			case 'A':
				result = a + b;
				break;
			case 'S':	
				result = a - b;
				break;
			case 'M':
				result = a * b;
				break;
			case 'D':
				result = a / b;
				break;
			default:
				System.out.println("Only the operations 'A', 'S', 'M' and 'D' are allowed.");
				return;
		}
		System.out.println("Result: " + result);
	}
}
```

At the very beginning we check if the array does not contain exactly three elements. If this is true we print a message that tells the user how to use this application and quit. After that we now initialize our variables `a` and `b` with 0. Then we make the same assignments as in our previous version to `a` and `b` but wrap them in a try-catch block. Whenever an error occurs inside the try block that leads to an exeption we catch it in the catch block. For number conversion a `NumberFormatException` is thrown whenever the value to be converted is not a valid number. Inside the catch block we print an error message and quit the method again.

# Dynamic Calculator
In the last section we've built a static caluclator that takes two numbers and applies an arithmetic operation on these two numbers. After that the program finished and we had to start it again. Now we want to build a calculator that asks the user for an operation and two numbers, applies the operation on the two numbers and then repeats these steps. 

First create a new folder in the `app` directory called `dynamicCalculator` and add a `Calculator.java` file in there. The basic structure of this file will be very similar to the static calculator but instead of integer values we use double because this datatype is better suited for calculations (especially divisions).

```java
public class Calculator {
	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double result = 0;
	}
}
```

Next we want to add user interaction to set the values of `a` and `b`. For each variable we need to print a message to the user, so that he knows what to do, and then read the value the user inputs. Reading a user input can be done using the Scanner class. Therefore the code for reading in `a` and `b` should look like this:

```java
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double result = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a value for a: ");
		a = scanner.nextDouble();

		System.out.print("Input a value for b: ");
		b = scanner.nextDouble();

		result = a + b;
		System.out.println("Result: " + result);
	}
}
``` 

As you can see we created a `scanner` object that is used to read from `System.in`. With this object we can read the integers that should be assigned to `a` and `b`. At the end of the method we add the two numbers and print out the result.

Similar to the static calculator we now need the operation the user wants to use. To do this we ask the user which operation he want to use and read the next charater. Sadly the Scanner doesn't provide a `nextChar()` method so we have to use the `next()` method to get a String value. Now we can use the `charAt()` method to get the first character of this string.

```java
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		char operation = 'A';
		double result = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a value for a: ");
		a = scanner.nextDouble();

		System.out.print("Input a value for b: ");
		b = scanner.nextDouble();
		
		System.out.print("Input an operation: ");
		operation = scanner.next().charAt(0);
		
		if (operation == 'A') {
			result = a + b;
		} else if (operation == 'S') {
			result = a - b;
		} else if (operation == 'M') {
			result = a * b;
		} else if (operation == 'D') {
			result = a / b;
		} else {
			System.out.println("Only the operations 'A', 'S', 'M' and 'D' are allowed.");
			return;
		}

		System.out.println("Result: " + result);
	}
}
```

Until now the code looks very similar to the static calculator. In order to make our dynamic calculator even more dynamic lets add a loop around our code.

Java provides three kinds of loops: (1) a `for` loop, (2) a `while` loop and (3) a `do-while` loop. 

The general form of a `for` loop looks like this: 
```java
for (initialization; termination; increment) {
	statements
}
```
The `initialization` is typically a variable that starts at `0`. The `termination` is the condition that must be reached in order to exit to loop and the `increment` is the part that increments the counter variable initialized in the `initialization` part. An example of the `for` loop can look like this:

```java
for (int i = 0; i < 10; i++) {
	// this code is executed 10 times.
}
```

The first time the for loop is executed the variable `i` is initialized. After that every time the termination part is checked until it is reached. If the termination condition is not reached the code inside the `for` loop is executed. At the end the incrementation part is executed. The `i++` is a special notation that increments the variable `i` by one every time it is executed.

A while loop is a little bit different to a for loop because there is only a termination part in the `while` loop. The initialization part has to be done outside the loop and the increment part has to be done inside the loop. An example of a while loop is:

```java
int i = 0;
while (i < 10) {
	// some statements
	i++;
}
```

Similar to the while loop the `do-while` loop only contains a termination condition. The difference between the `while` loop and the `do-while` loop is that the code inside the `do-while` is always executed at least once. However the `do-while` loop is used the least often, at least by me. The following example shows you how such a loop can look like:

```java
do {
	// some code
} while (termination);
```

The best suited loop for our calculator is the `while` loop since we want the calculator to run until the user exits the program. In order to give the user the option to quit the program we add a fifth operation we read from the console which will be 'E' for exit. When the user inputs an 'E' we quit the loop exit the program. These changes will result in a code that looks similar to this:

```java
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		char operation = 'A';

		Scanner scanner = new Scanner(System.in);

		while (operation != 'E') {
			double result = 0;

			System.out.print("Input a value for a: ");
			double a = scanner.nextDouble();

			System.out.print("Input a value for b: ");
			double b = scanner.nextDouble();
			
			System.out.print("Input an operation: ");
			operation = scanner.next().charAt(0);
			
			if (operation == 'A') {
				result = a + b;
			} else if (operation == 'S') {
				result = a - b;
			} else if (operation == 'M') {
				result = a * b;
			} else if (operation == 'D') {
				result = a / b;
			} else if (operation == 'E') {
				return;
			} else {
				System.out.println("Only the operations 'A', 'S', 'M', 'D' and 'E' are allowed.");
				continue;
			}
			System.out.println("Result: " + result);
		}		
	}
}
```

As you can see I've change the code a little bit according to the previous version so that it works nicely with the loop. Also I've changed the `return` in the `else` brancht to a `continue` which means that the rest of the loop should be skipped. Therefore the loop will start at the beginning again.

The last feature we want to add to our calculator to let the user choose between the shortcut and the full name of the operation. Along with the shortcuts it should also be possible to input the full names of the operation, e.g. 'ADD' or 'MULTIPLY'. When we implement this we have to switch the type of our `operation` variable from `char` to `String`. Also we have to change all places where the `operation` is compare to another value. The reason for this is that if you use `==` to compare objects you always check if the object is exactly the same object. Most of the time we don't want to check if both objects are exactly the same instance but rather if the value they hold are the same. When I have two strings that hold the value "ADD" I don't want to check if the objects are the same but if the values the objects hold are the same.

The following code should exlpain this concept a little bit further:
```java
public class Main {
	public static void main(String[] args) {
		String s1 = "test";
		String s2 = "test";

		boolean b1 = s1 == s2; 
		boolean b2 = s1.equals(s2);
		System.out.println("b1: " + b1 + "; b2: " + b2); // outputs: b1: true; b2: true

		s1 = new String("test");
		s2 = new String("test");
		b1 = s1 == s2; 
		b2 = s1.equals(s2);
		System.out.println("b1: " + b1 + "; b2: " + b2); // outputs: b1: false; b2: true
	}
}
```

Another concept we need for the change we want to implement is to combine boolean conditions. Until now we only have one condition per if statement. When we've implemented the new feature we always have two conditions per if statement and the code inside the if statement should be executed if at least one of the conditions is satisfied. We can do this by using boolean operators such as `||` or `&&`. When you combine two conditions with `||` at least one of the conditions has to be true so that the whole statement becomes true. When you use `&&` to combine conditions every condition must be true so that the whole statement becomes true. In our case the `||` is the right choice. After we've learned these two things we can implement the final feature which will result in a code similar to this:

```java
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		String operation = "A";

		Scanner scanner = new Scanner(System.in);

		while (!operation.equals("E") && !operation.equals("EXIT")) {
			double result = 0;

			System.out.print("Input a value for a: ");
			double a = scanner.nextDouble();

			System.out.print("Input a value for b: ");
			double b = scanner.nextDouble();
			
			System.out.print("Input an operation: ");
			operation = scanner.next();
			
			if (operation.equals("A") || operation.equals("ADD")) {
				result = a + b;
			} else if (operation.equals("S") || operation.equals("SUBTRACT")) {
				result = a - b;
			} else if (operation.equals("M") || operation.equals("MULTIPLY")) {
				result = a * b;
			} else if (operation.equals("D") || operation.equals("DIVIDE")) {
				result = a / b;
			} else if (operation.equals("E") || operation.equals("EXIT")) {
				return;
			} else {
				System.out.println("Only the operations (A)DD, (S)UBTRACT, (M)ULTIPLY, (D)IVIDE and (E)XIT are allowed.");
				continue;
			}
			System.out.println("Result: " + result);
		}		
	}
}
```

Notice, that the condition of the while loop also changed. Instead of the `!=` we now use `!operation.equals()`.

# FAQ
## How do I open a terminal?
On Windows: http://www.howtogeek.com/235101/10-ways-to-open-the-command-prompt-in-windows-10/ <br>
On Mac: http://www.wikihow.com/Open-a-Terminal-Window-in-Mac <br>
On Linux: http://askubuntu.com/a/38220

## How do I navigate in a terminal?
On Mac & Linux: Use the `cd <path>` [(change directory) command](http://linuxcommand.org/lc3_man_pages/cdh.html), e.g. `cd /Users/<username>/Desktop` on a mac.<br>
On Windows: Use the `dir <path>` [command](http://www.computerhope.com/dirhlp.htm), e.g. `dir C:\`
