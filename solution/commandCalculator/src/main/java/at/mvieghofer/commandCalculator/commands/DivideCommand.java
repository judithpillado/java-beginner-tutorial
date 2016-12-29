package at.mvieghofer.commandCalculator.commands;

public class DivideCommand implements ICommand {
    private static final String KEY = "D";
    private static final String LONG_KEY = "DIVIDE";

    @Override
    public String getFullKey() {
        return LONG_KEY;
    }

    @Override
    public String getKey() {
        return KEY;
    }

    @Override
    public double getResult(double a, double b) {
        return a / b;
    }
}
