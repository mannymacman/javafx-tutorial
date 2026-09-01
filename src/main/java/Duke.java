import java.util.ArrayList;

public class Duke {

    private String commandType;
    private ArrayList<Task> tasks;

    public String getResponse(String input) {
        try {
            Command c = Parser.parse(input);
            c.execute(tasks);
            commandType = c.commandType;
            return c.getString();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
    public String getCommandType() {
        return commandType;
    }

}
