package ru.koptev.taskmanager;

import static ru.koptev.taskmanager.constant.TerminalConstant.*;

public class Main {

    public static void main(String[] args) {
        displayWelcome();
        run(args);
    }

    public static void run(String[] args) {
        if (args == null) return;
        if (args.length < 1) return;
        String param = args[0];
        switch (param) {
            case (HELP): displayHelp();
            case (ABOUT): displayAbout();
            case (VERSION): displayVersion();
            default: displayError();
        }
    }

    public static void displayHelp() {
        System.out.println("about - Display developer information.");
        System.out.println("version - Display program version.");
        System.out.println("help - Display list of terminal commands.");
        System.exit(0);
    }

    public static void displayAbout() {
        System.out.println("Name: Koptev Anton");
        System.out.println("Email: koptev_av@nlmk.com");
        System.exit(0);
    }

    public static void displayVersion() {
        System.out.println("Version: 1.0.0");
        System.exit(0);
    }

    public static void displayError(){
        System.out.println("Error! Invalid parameter...");
        System.exit(-1);
    }

    public static void displayWelcome(){
        System.out.println("** WELCOME TO TASK MANAGER **");
    }

}
