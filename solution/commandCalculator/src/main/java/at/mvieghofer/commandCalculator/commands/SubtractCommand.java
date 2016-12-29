package at.mvieghofer.commandCalculator.commands;

public class SubtractCommand implements ICommand {
    private static final String KEY = "S";
    private static final String LONG_KEY = "SUBTRACT";

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
        return a - b;
    }
}
