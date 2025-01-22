import java.util.Scanner;
public class StudentManagementSystem {
    public static void main(String[] args) {

        int option = 0;
        Student student = new Student();
        Scanner keyboard = new Scanner(System.in);

        while (option != 4) {
            System.out.println("\nStudent Management System");
            System.out.println("-------------------------");
            System.out.println("\n1. Add a new student");
            System.out.println("2. View the student");
            System.out.println("3. Update the student's grade");
            System.out.println("4. Exit");
            System.out.print("\nChose and option: ");
            option = keyboard.nextInt();


            if (option == 1) {
                System.out.print("name: ");
                student.setName(keyboard.next());
                System.out.print("id: ");
                student.setId(keyboard.nextInt());
                System.out.print("grade: ");
                student.setGrade(keyboard.nextDouble());
            } else if (option == 2) {
                System.out.print("\nname: " + student.getName() + ", id: " + student.getId() + ", grade: " + student.getGrade() + ", grade category: " + student.getGradeCategory());
            } else if (option == 3) {
                System.out.println("Enter new grade: ");
                student.setGrade(keyboard.nextDouble());
                System.out.println("Grade updated successfully.");
            }

            if (option == 4) {
                System.out.println("Exiting...");
                System.exit(0);
            }

            if (option > 4) {
            System.out.println("\nInvalid option. Please choose again.");
            }

            }
        }
    }



