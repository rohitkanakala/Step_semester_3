package _02_JavaBasics.practice_problems;
import java.util.Scanner;

public class StudentRecord{

    public static void parseStudentRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String name = fields[0].trim();
        String rollNo = fields[1].trim();
        String dept = fields[2].trim();

        System.out.println("Name: " + name + " | Roll No: " + rollNo + " | Dept: " + dept);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter CSV line: ");
        String userInput = scanner.nextLine();

        parseStudentRecord(userInput);

        scanner.close();
    }
}
