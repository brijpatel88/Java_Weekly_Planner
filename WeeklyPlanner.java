

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeeklyPlanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();

        System.out.println("===== Weekly Planner =====");
        System.out.print("How many tasks do you want to add? (3–7): ");

        int numTasks;
        while (true) {
            if (sc.hasNextInt()) {
                numTasks = sc.nextInt();
                sc.nextLine(); // consume newline
                if (numTasks >= 3 && numTasks <= 7) {
                    break;
                } else {
                    System.out.print("Please enter a number between 3 and 7: ");
                }
            } else {
                System.out.print("Invalid input. Enter a number: ");
                sc.next(); // discard invalid input
            }
        }

        // Collect tasks
        for (int i = 1; i <= numTasks; i++) {
            System.out.print("Enter task " + i + ": ");
            String task = sc.nextLine().trim();
            tasks.add(task);
        }

        // Display tasks
        System.out.println("\nYour Weekly Planner:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        // Save tasks to a Markdown file
        saveToMarkdown(tasks);

        System.out.println("\nPlanner saved to 'weekly_planner.md'.");
        sc.close();
    }

    private static void saveToMarkdown(List<String> tasks) {
        try (FileWriter writer = new FileWriter("weekly_planner.md")) {
            writer.write("# Weekly Planner\n\n");
            for (int i = 0; i < tasks.size(); i++) {
                writer.write((i + 1) + ". " + tasks.get(i) + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error saving planner: " + e.getMessage());
        }
    }
}
