package command;

//@@author shanicetanhui

import typing.TypingTimer;
import storage.AutoAdjust;
import storage.Milestones;
import storage.State;
import storage.TypingTargets;
import storage.ProgressReport;
import typing.TypingAccuracy;
import typing.TypingTargetList;
import ui.Ui;

import java.io.IOException;
import java.util.Scanner;

public class ProgressReportCommand extends Command {

    @Override
    public void execute(
            Ui ui,
            Scanner sc,
            Milestones milestones,
            TypingTimer typingTimer,
            TypingAccuracy typingAccuracy,
            TypingTargetList typingTargetList,
            TypingTargets typingTargets,
            State state,
            AutoAdjust autoAdjust,
            String command
    ) throws IOException {
        ProgressReport progressReport = new ProgressReport("data/progress.txt", ui);
        progressReport.show();
    }
}
