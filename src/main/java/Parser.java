public class Parser {
    public static Command parse(String input) {
        String[] inputParts = input.split("\\s+");
        if (inputParts[0].equals("todo") ||
                inputParts[0].equals("event") ||
                inputParts[0].equals("deadline")) {
            return new Command("AddCommand");
        } else if (inputParts[0].equals("mark")) {
            return new Command("ChangeMarkCommand");
        } else if (inputParts[0].equals("delete")) {
            return new Command("DeleteCommand");
        } else {
            return new Command(input);
        }
    }
}
