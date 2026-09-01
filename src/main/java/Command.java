import java.util.ArrayList;

public class Command {
    public String commandType;

    public Command(String input) {
        this.commandType = input;
    }

    public void execute(ArrayList<Task> tasks) {
        System.out.println("Executed!");
    }

    public String getString() {
        return "output";
    }
}
