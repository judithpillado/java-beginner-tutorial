package at.mvieghofer.commandCalculator;

import at.mvieghofer.commandCalculator.commands.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        initCommands();

        Scanner scanner = new Scanner(System.in);

        String operation = getOperation(scanner);
        while (!operation.equals("E") && !operation.equals("EXIT")) {
            System.out.print("Input a value for a: ");
            double a = scanner.nextDouble();

            System.out.print("Input a value for b: ");
            double b = scanner.nextDouble();

            ICommand command = CommandFactory.getInstance().getCommand(operation);
            double result = command.getResult(a, b);
            System.out.println("Result: " + result);

            operation = getOperation(scanner);
        }
    }

    private static String getOperation(Scanner scanner) {
        String operation;
        System.out.print("Input an operation: ");
        operation = scanner.next();
        return operation;
    }

    private static void initCommands() {
        CommandFactory.getInstance().registerCommand(new AddCommand());
        CommandFactory.getInstance().registerCommand(new SubtractCommand());
        CommandFactory.getInstance().registerCommand(new MultiplyCommand());
        CommandFactory.getInstance().registerCommand(new DivideCommand());
    }
}
