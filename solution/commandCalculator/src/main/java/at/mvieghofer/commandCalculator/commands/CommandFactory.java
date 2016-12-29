package at.mvieghofer.commandCalculator.commands;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    private static final CommandFactory INSTANCE = new CommandFactory();

    private Map<String, ICommand> commands = new HashMap<>();

    private CommandFactory() {
    }

    public static final CommandFactory getInstance() {
        return INSTANCE;
    }

    public void registerCommand(ICommand command) {
        commands.put(command.getKey(), command);
        commands.put(command.getFullKey(), command);
    }

    public ICommand getCommand(String operation) {
        ICommand command = commands.get(operation);
        if (command == null) {
            throw new UnsupportedOperationException("The operation " + operation + " is not supported");
        }
        return command;
    }
}
