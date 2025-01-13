import java.util.ArrayList;
import java.util.Scanner;

public class toDoList {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner t = new Scanner(System.in);

        System.out.println("\n--- TO-DO-LIST MENU ---");
        System.out.println("1.ADD TASK");
        System.out.println("2.VIEW TASKS");
        System.out.println("3.MARK TASK AS COMPLETED");
        System.out.println("4.REMOVE TASK");
        System.out.println("5.EXIT");

        boolean running = true;
        while (running) {

            System.out.println("ENTER YOUR CHOICE : ");

            // get user choice
            int choice = t.nextInt();
            t.nextLine();

            // handle user choice
            switch (choice) {
                case 1:
                    // ADD TASK
                    System.out.println("enter the task :");
                    String task = t.nextLine();
                    tasks.add(task);
                    System.out.println("task added successfully!");
                    break;

                case 2:
                    // display
                    System.out.println("your tasks:");
                    if (tasks.isEmpty()) {
                        System.out.println("no tasks");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + "." + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    // mark
                    System.out.println("enter the number of task to mark completed :");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + "." + tasks.get(i));
                    }
                    int taskNumber = t.nextInt();
                    t.nextLine();
                    if (taskNumber > 0 && taskNumber <= tasks.size()) {
                        String completed = tasks.get(taskNumber - 1) + " (completed)";
                        tasks.set(taskNumber - 1, completed);
                        System.out.println("task marked as completed");
                    } else {
                        System.out.println("invalid task number!!");
                    }
                    break;

                case 4:
                    System.out.println("enter the number of task to remove :");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + "." + tasks.get(i));
                    }
                    int taskToRemove = t.nextInt();
                    t.nextLine();

                    if (taskToRemove > 0 && taskToRemove <= tasks.size()) {
                        tasks.remove(taskToRemove - 1);
                        System.out.println("task removed successfully!!");
                    } else {
                        System.out.println("invalid task number!!");
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice please try again : ");
            }

        }
        t.close();
    }
}