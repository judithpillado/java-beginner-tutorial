# This document is work in progress!

# Before we start
Before we start here are some things you might want to know. These sections should tell you if this tutorial is for you. If you have any additional questions just [open an issue](https://github.com/mvieghofer/java-hello-world/issues).

## What do you need to know?
This tutorial is for beginners so you don't have to know programming yet. Actually it is good if you don't know programming yet. It is beneficial if you know how to use a terminal, although we only need it to execute our programs. The only real preconditions are that you know how to use a computer and are motivated to learn something new ;). At the end of this tutorial there is a [FAQ section](#faq) with some answers to questions you might have. If you cannot solve a problem, you can open an issue again.

## What you will learn in this tutorial
At the end of this tutorial you will know the very basics of the Java programming language. You will have written a few basic applications to learn the basics. And hopefully you will have discovered how awesome programming is.

## What you will not learn in this tutorial
As I said before this tutorial does only cover the very basics. We will not cover more advanced concepts such as Object Oriented Programming (OOP).

# Setup
If you want to write java programs you only need two things, a text editor and the JDK (Java Development Toolkit). 

If you are not sure whether you have the JDK already installed open a Terminal and type `javac -version`. This should display you something like this: 

```
javac 1.8.0_101
```

If don't get such a response you have to install the JDK. To do that go to [this website](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and download and install the appropriate version for your computer. After you have done that the command from above should bring up the desired output.

When you don't know which text editor to use I can recommend the [Sublime Text](https://www.sublimetext.com/) editor but you can choose any other editor, too.

For more advanced java programming there are special text editors (so called IDEs or Integrated Development Environments) with a lot of additioanl features. But I don't think that these editors are helpful if you are just learning java. They would probably be more distracting than helpful.

The last step of this setup is to clone this repository using `git clone https://github.com/mvieghofer/java-hello-world.git`. If you don't have `git` installed or you don't know what cloning means, check out [this short tutorial](https://help.github.com/articles/cloning-a-repository/). 

After you have cloned this repository open it in your text editor. The `app` folder is your working directory. There you should create all the subfolders for the small example projects we will create. In the solution folder you can find the complete solution for this tutorial. You can always check there how my solution looks like.


# Hello World
Typically if you learn a new programming language the first program you write will be a so called 'Hello World' Program. This program will run without any errors and print 'Hello World' to the terminal. 

First you need to create a `helloWorld` folder in the app directory and create a file called `HelloWorld.java` inside the `helloWorld` folder. Open this file, copy the following code to the file and you have your first fully functional Hello World Program created.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
``` 

Before we run it I will explain what every part does. The file starts with `public class` which creates a new Type. The class keyword is important for OOP but I wont explain it here in detail. After that the name of that comes the name of that type which is HelloWorld. It is important that the name of the class is the same as the name of the file. Otherwise you will get an error while compiling it.

The HelloWorld class has one method called `main`. The `public` keyword at the start of this line indicates that this method can be called from everywhere in your program. The `static` keyword tells Java that you don't have to create an Instance of this class. This is again OOP specific and you can ignore it for now. The third keyword, `void`, tells you what this method is returning after it finishes. Since this method returns `void` we know that we get no result of this method. After `void` comes the name of this method. Inside the brackets one parameter is defined. In this case this parameter is an array of strings called `args`. 

This `main` method is a special method that defines the main entrypoint of your program. Every program has to have one of these methods no matter how big or small it is.

Inside this method we print the string `Hello World!` to the terminal. More complex programs will do more complex things here of course.

To run this program we first have to compile it in order to convert it into a format java can execute it. To do this open a terminal and navigate to the app folder of this repository and execute the following command `javac HelloWorld.java`. This produces a `HelloWorld.class` file which then can be executed by java with the command `java -cp . HelloWorld`. This command tells java to execute the `HelloWorld` program in the current folder. Now you should see the `Hello World!` in your terminal.

# Static Calculator
Now that you know how to create a simple Java application you can go a step further and create an application that does a little more. Lets create a calculator application that can operate with two numbers.

In the app folder create a new directory called `staticCalculator` and add a new file `Calculator.java` in there. Open the `Calculator.java` file and add the following base structure of our calculator.

```java
public class Calculator {
	public static void main(String[] args) {
		// add calculator code here
	}
}
```

As you can see the main method only contains a single line comment. This code is not executed and just adds additional information for the developers. Besides the single line comments (which start with `//`) there are also mutli line comments. These comments start with `/*` and end with `*/` and can contain line breaks.

Now we need two digits our calculator can work with. To do this replace the comment with the two variable declarations `int a = 1;` and `int b = 2;`. The result should be something like this:

```java
public class Calculator {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
	}
}
```
We have just created two integer variables that hold the digits 1 and 2. There are [other datatypes](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html) but if you need a number, integer is very often what you need.

To keep things simple we will only supports adding two numbers at first. Subtractions, mutliplications and divisions are added later. To do this we create a third variable called `result` which hold the sum of `a` and `b`. After we have calculated the sum we also want to print in out.

Here is my solution to this problem:

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

When you compile the app with `javac Calculator.java` and then run `java -cp . Calculator` you should see `Result: 3` in your terminal.

Now you've finished your first calculator app. Even though this app is rather limited in its functionality we are making great progress. Next we want to make the variables `a` and `b` configurable from the outside. As we've already learned above there is the `args` parameter that contains parameters passed from the outside. Now we are going to use this parameter to make our two variables configurable.

When we set `a` to the first value of the `args` array and `b` to the second value our result will be dynamically calculated every time the application runs. Before we can do this you have to know that arrays in java are zero based. This means that the first value of every array can be read on the index 0, the second one on the index 1 and so on. Therefore the new variable declarations should look like `int a = args[0];` and `int b = args[1];`.

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

When we compile the calculator again using `javac Calculator.java` we can run the application and pass two parameters to it using `java -cp . Calculator 4 5`. However you will soon notice that this doesn't work as expected. We get an error that tells us that there are incopatible types in our assignment.

```
Calculator.java:3: error: incompatible types: String cannot be converted to int
		int a = args[0];
		            ^
Calculator.java:4: error: incompatible types: String cannot be converted to int
		int b = args[1];
		            ^
2 errors
```

The reason for this error is that we want to assign values from a string array to integer values. Since the string array could contain any string values, the compiler cannot guarantee that the assignment to an integer variable will always pass and therefore throws an error. To fix this we have to wrap the array reads with an `Integer.valueOf()` method call like this:

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


# FAQ
## How do I open a terminal?
On Windows: http://www.howtogeek.com/235101/10-ways-to-open-the-command-prompt-in-windows-10/ <br>
On Mac: http://www.wikihow.com/Open-a-Terminal-Window-in-Mac <br>
On Linux: http://askubuntu.com/a/38220

## How do I navigate in a terminal?
On Mac & Linux: Use the `cd <path>` [(change directory) command](http://linuxcommand.org/lc3_man_pages/cdh.html), e.g. `cd /Users/<username>/Desktop` on a mac.<br>
On Windows: Use the `dir <path>` [command](http://www.computerhope.com/dirhlp.htm), e.g. `dir C:\`
