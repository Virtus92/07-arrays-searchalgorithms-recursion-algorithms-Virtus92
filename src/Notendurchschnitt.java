import java.util.Scanner;

public class Notendurchschnitt {

    private static void fillGrades(int[] grades, Scanner sc) {
        for (int i = 0; i< grades.length; i++) {
            System.out.println("Welche Note soll die " + (1+i) + ". Note haben?");
            grades[i] = sc.nextInt();
        }
    }

    static double gradeAverage(int n, int[] grades) {
        if (n ==0) {
            return 0;
        }
        return n + gradeAverage(n-1, grades);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wieviele Noten soll es geben?");
        int n = sc.nextInt();

        int[] grades = new int[n];

        fillGrades(grades, sc);

        double result = gradeAverage(n, grades)/grades.length;

        System.out.printf("Notendurchschnitt: %.2f", result);

    }
}
