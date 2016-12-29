package at.mvieghofer.commandCalculator.commands;

public class MultiplyCommand implements ICommand {
    private static final String KEY = "M";
    private static final String LONG_KEY = "MULTIPLY";

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
        return a * b;
    }
}
