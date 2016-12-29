package at.mvieghofer.commandCalculator.commands;

public class AddCommand implements ICommand {
    private static final String KEY = "A";
    private static final String LONG_KEY = "ADD";

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
        return a + b;
    }
}
