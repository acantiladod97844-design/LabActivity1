import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static final int MAX = 10;

    static int[] id = new int[MAX];
    static String[] name = new String[MAX];
    static double[] grade = new double[MAX];
    static int count = 0;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Statistics");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: searchStudent(); break;
                case 4: statistics(); break;
                case 5: System.out.println("Goodbye!");
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    static void addStudent() {
        if (count == MAX) {
            System.out.println("List is full.");
            return;
        }

        System.out.print("ID: ");
        id[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        name[count] = sc.nextLine();

        System.out.print("Grade: ");
        grade[count] = sc.nextDouble();

        count++;
        System.out.println("Student added.");
    }

    static void viewStudents() {
        if (count == 0) {
            System.out.println("No records.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(id[i] + " | " + name[i] + " | " + grade[i]);
        }
    }

    static void searchStudent() {
        System.out.print("Enter ID: ");
        int search = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (id[i] == search) {
                System.out.println("Name: " + name[i]);
                System.out.println("Grade: " + grade[i]);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    static void statistics() {
        if (count == 0) {
            System.out.println("No records.");
            return;
        }

        double sum = 0, highest = grade[0];

        for (int i = 0; i < count; i++) {
            sum += grade[i];
            if (grade[i] > highest)
                highest = grade[i];
        }

        System.out.println("Average: " + (sum / count));
        System.out.println("Highest Grade: " + highest);
    }
}
