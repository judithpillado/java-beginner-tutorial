public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
// public class HelloWorld: Creates a new publicy visible Type called HelloWorld.
  // You have to name the class the same as you would the file with a .java appendix

// Inside HelloWorld class is a public static method called main.
  // public keyword indicates that this method can be called from everywhere in your program
  // static keyword tells Java that you don't have to create an Instance of this class
  // OOP specific!
  // void keyword tells you that this method returns nothing.
  // ( If the method would return int or String instead of void we would know that it returns an int or a String after it finishes)

// After the public static method main, one parameter is defined.
  // The parameter is an array of string called args
  // Generally speaking, the parameter can contain values that are passed from the user of your app from the outside.

// Main method is a special method that defines the main entrypoint of your program.
  // Every program has to have a main method

// Body inside the method only contains one line of code.
  // In this case Hello World! is being printed.

// However the JRE cannot understand this code as we wrote it above, we have to translate it into a special format. The process of doing that is called compiling and the format we need to compile the source code to is called the Bytecode. This is the secret sauce of Java! Since programs are converted in Bytecode every Java program can be executed on every Computer that has the JRE installed, no matter where you've compiled it. For other programming languages such as C++ or C this is not possible.

// 1. Open terminal and navigate to the app folder of this repo
// 2. $ javac HelloWorld.java
//   this tells Java compiler (javac) to compile the file
// 3. HelloWorld.class is produced by the above command
// 4. $ java -cp . HelloWorld
//   executes the HelloWorld program in the current folder (-cp .)
//   you should see Hello World! in terminal

// Questions:
// Does this mean that I'd have to execute step 2 every time I make changes to the HelloWorld.java file?
// If yes, would I have to delete the HelloWorld.class file each time a change is made to HelloWorld.java?
