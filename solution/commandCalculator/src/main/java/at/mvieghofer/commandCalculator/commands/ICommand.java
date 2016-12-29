package at.mvieghofer.commandCalculator.commands;

public interface ICommand {
    String getFullKey();

    String getKey();

    double getResult(double a, double b);
}
