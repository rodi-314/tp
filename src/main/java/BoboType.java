import command.Command;
import exceptions.InvalidInputException;
import storage.AutoAdjust;
import storage.Milestones;
import modes.TypingTimer;
import typing.TypingAccuracy;
import typing.TypingTargetList;
import ui.Ui;
import parser.Parser;
import storage.State;
import storage.Storage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BoboType {
    private static final int NUM_OF_TEXTS = 3;

    private final Ui ui;
    private final Scanner sc;
    private final TypingAccuracy typingAccuracy;
    private final TypingTimer typingTimer;
    private final State state;
    private final Milestones milestones;
    private final AutoAdjust autoAdjust;
    private final TypingTargetList typingTargetList;


    public BoboType(String filepath) {
        Storage storage = new Storage(filepath);
        state = new State(storage);
        ui = new Ui(state);
        sc = new Scanner(System.in);
        typingAccuracy = new TypingAccuracy(new ArrayList<>());
        typingTimer = new TypingTimer();
        milestones = new Milestones("data/milestones.txt");
        autoAdjust = new AutoAdjust(milestones, ui, state);
        typingTargetList = new TypingTargetList();
    }



    public void run() throws IOException {
        ui.showWelcome();
        boolean isExit = false;
        while (!isExit) {
            try {
                String input = sc.nextLine();
                Parser userInput =  new Parser(input);
                Command c = userInput.parseToCommand();
                c.execute(ui, sc, milestones, typingTimer, typingAccuracy, typingTargetList, state, autoAdjust);
                isExit = c.isExit();
            } catch (InvalidInputException e) {
                ui.showInvalidInputMessage();
            }
        }
    }

    // Main method to start the program
    public static void main(String[] args) throws IOException {
        BoboType app = new BoboType("data/BoboType.txt");
        app.run();  // Run the program
    }
}
