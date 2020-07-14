package ru.koptev.taskmanager;

import java.util.Scanner;
import static ru.koptev.taskmanager.constant.TerminalConstant.*;

public class Application {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String inputString = "";
        displayWelcome();
        while (!EXIT.equals(inputString)) {
            inputString = scanner.nextLine();
            run(inputString);
        }
    }

    public static int run(String param) {
        if (param == null) return -1;
        switch (param) {
            case (HELP): return displayHelp();
            case (ABOUT): return displayAbout();
            case (VERSION): return displayVersion();
            case (EXIT): return displayExit();
            default: return displayError();
        }
    }

    public static int displayHelp() {
        System.out.println("about - Display developer information.");
        System.out.println("version - Display program version.");
        System.out.println("help - Display list of terminal commands.");
        System.out.println("exit - Terminate console application.");
        return 0;
    }

    public static int displayExit() {
        System.out.println("Terminate program...");
        return -1;
    }

    public static int displayAbout() {
        System.out.println("Name: Koptev Anton");
        System.out.println("Email: koptev_av@nlmk.com");
        return 0;
    }

    public static int displayVersion() {
        System.out.println("Version: 1.0.0");
        return 0;
    }

    public static int displayError() {
        System.out.println("Error! Invalid parameter...");
        return 0;
    }

    public static void displayWelcome() {
        System.out.println("** WELCOME TO TASK MANAGER **");
    }

}
