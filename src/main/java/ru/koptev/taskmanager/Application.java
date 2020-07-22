package ru.koptev.taskmanager;

import ru.koptev.taskmanager.dao.ProjectDAO;
import ru.koptev.taskmanager.dao.TaskDAO;

import java.util.Scanner;

import static ru.koptev.taskmanager.constant.TerminalConstant.*;

public class Application {

    private static final Scanner scanner = new Scanner(System.in);

    private static final ProjectDAO projectDAO = new ProjectDAO();

    private static final TaskDAO taskDAO = new TaskDAO();

    public static void main(String[] args) {
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

            case (PROJECT_CREATE): return createProject();
            case (PROJECT_CLEAR): return clearProject();
            case (PROJECT_LIST): return listProject();

            case (TASK_CREATE): return createTask();
            case (TASK_CLEAR): return clearTask();
            case (TASK_LIST): return listTask();

            default:
                return displayError();
        }
    }

    public static int createProject() {
        System.out.println("Creating project...");
        System.out.println("Please, enter project name:");
        projectDAO.create(scanner.nextLine());
        System.out.println("Ok");
        return 0;
    }

    public static int clearProject() {
        projectDAO.clear();
        System.out.println("Project clear!");
        return 0;
    }

    public static int listProject() {
        System.out.println("Project list:");
        System.out.println(projectDAO.findAll());
        return 0;
    }

    public static int createTask() {
        System.out.println("Creating task...");
        System.out.println("Please, enter task name:");
        taskDAO.create(scanner.nextLine());
        System.out.println("Ok");

        return 0;
    }

    public static int clearTask() {
        taskDAO.clear();
        System.out.println("Task clear!");
        return 0;
    }

    public static int listTask() {
        System.out.println("Task list:");
        System.out.println(taskDAO.findAll());
        return 0;
    }

    public static int displayHelp() {
        System.out.println("System commands:");
        System.out.println("about - Display developer information.");
        System.out.println("version - Display program version.");
        System.out.println("help - Display list of terminal commands.");
        System.out.println("exit - Terminate console application.");
        System.out.println();
        System.out.println("Project commands:");
        System.out.println("project-create - Create new project.");
        System.out.println("project-clear - Clear all projects.");
        System.out.println("project-list - Display all projects.");
        System.out.println();
        System.out.println("Task commands:");
        System.out.println("task-create - Create new task.");
        System.out.println("task-clear - Clear all tasks.");
        System.out.println("task-list - Display all tasks.");
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
        System.out.println("Welcome to Task Manager");
    }

}
