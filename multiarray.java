import java.util.Scanner;

public class Murphy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numStudents = 3;

        String[] names = new String[numStudents];
        int[][] marks = new int[numStudents][3];
        int[] totals = new int[numStudents];
        String[] results = new String[numStudents];
        char[] grades = new char[numStudents];
        int[] rollNumbers = new int[numStudents];


        for (int j = 0; j < numStudents; j++) {
            System.out.println("Enter details for Student " + (j + 1) + ":");
            int rollno;
            String name;
            int sum = 0;

            System.out.println("Enter the student roll number:");
            rollno = in.nextInt();
            rollNumbers[j] = rollno;

            System.out.print("Enter the student name:");
            name = in.next();
            names[j] = name;

            System.out.println("Enter the three marks:");

            for (int i = 0; i < 3; i++) {
                marks[j][i] = in.nextInt();
                sum += marks[j][i];
            }

            totals[j] = sum / 3;

            if (totals[j] > 70) {
                grades[j] = 'A';
            } else if (totals[j] > 50) {
                grades[j] = 'B';
            } else if (totals[j] > 0) {
                grades[j] = 'C';
            }

            if (totals[j] > 50)
                results[j] = "P";
            else
                results[j] = "F";


            float average = (float) totals[j];

            System.out.println("Total marks: " + totals[j]);

            System.out.println();
        }

        System.out.println("**************************************************************************");
        System.out.println("\t\t\t\t\t\t\t STUDENT'S MARKLIST\t\t\t\t\t\t");
        System.out.println("**************************************************************************");
        System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAVERAGE\tGRADE");

        for (int i = 0; i < numStudents; i++) {
            System.out.println(rollNumbers[i] + "\t\t" + names[i] + "\t\t" + marks[i][0] + "\t" + marks[i][1] + "\t\t" + marks[i][2] + "\t\t" + totals[i] + "\t\t" + results[i] + "\t\t" + (float) totals[i] + "\t\t" + grades[i]);
        }
    }
}
