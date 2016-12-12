# This document is work in progress!

# What you will learn in this tutorial
When you have completed this tutoral you will know the very basics of the Java programming language. You will have written a simple calculator which can add, subtract, multiply and divide two interger digits. 

# What do you need to know?
// TODO

# What you will not learn in this tutorial
We will not cover Object Oriented Programming (OOP) or any other more advanced feature of Java since this would go beyond the scope of this tutorial.

# Setup
If you want to write java programs you only need two things, a text editor and the JDK (Java Development Toolkit). 

If you are not sure whether you have the JDK already installed open a Terminal and type `javac -version`. This should display you something like this: 

```
javac 1.8.0_101
```

If don't get such a response you have to install the JDK. To do that go to [this website](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and download and install the appropriate version for your computer. After you have done that the command from above should bring up the desired output.

When you don't know which text editor to use I can recommend the [Sublime Text](https://www.sublimetext.com/) editor but you can choose any other editor, too.


For more advanced java programming there are special text editors (so called IDEs or Integrated Development Environments) with a lot of additioanl features.

The last step of this setup is to clone this repository using `git clone https://github.com/mvieghofer/java-hello-world.git` and open the project your text editor. The `app` folder is your working directory. There all your files should be placed. In the solution folder you can find the complete solution of this tutorial. You can always check there how my solution to the problem of this tutoral looks like.


# Hello World
Typically if you learn a new programming language the first program you write will be a so called 'Hello World' Program. This program will run without any errors and print 'Hello World' to the terminal. Create a file called `HelloWorld.java` inside the app folder and open it in your text editor. If you copy the following code to the file you will have a fully functional Hello World Program.

```
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
``` 

Before we run it I will explain what every part does. The file starts with `public class` which creates a new Type. The class keyword is important for OOP but I wont explain it here in detail. After that the name of that comes the name of that type which is HelloWorld. It is important that the name of the class is the same as the name of the file. Otherwise you will get an error while compiling it.

The HelloWorld class has one method called `main`. The `public` keyword at the start of this line indicates that this method can be called from everywhere in your program. The `static` keyword tells Java that you don't have to create an Instance of this class. This is again OOP specific and you can ignore it for now. The third keyword, `void`, tells you what this method is returning after it finishes. Since this method returns `void` we know that we get no result of this method. After `void` comes the name of this method. Inside the brackets one parameter is defined. In this case this parameter is an array of strings called `args`. 

This `main` method is a special method that defines the main entrypoint of your program. Every program has to have one of these methods no matter how big or small it is.

Inside this method we print the string "Hello World!" to the terminal. More complex programs will do more complex things here of course.

To run this program we first have to compile it in order to convert it into a format java can execute it. To do this navigate to the app folder of this repository and execute the following command `javac HelloWorld.java`. This produces a `HelloWorld.class` file which then can be executed by java with the command `java -cp . HelloWorld`. This command tells java to execute the `HelloWorld` program in the current folder. Now you should see the `Hello World!` in your terminal.
