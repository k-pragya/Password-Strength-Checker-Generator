import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Check Password Strength");
            System.out.println("2. Generate Password");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter password: ");
                    String pwd = sc.nextLine();
                    System.out.println("Strength: " + PasswordChecker.checkStrength(pwd));
                    break;

                case 2:
                    System.out.print("Enter password length: ");
                    int len = sc.nextInt();
                    System.out.println("Generated Password: " +
                            PasswordGenerator.generate(len));
                    break;

                case 3:
                    System.out.println("Bye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
