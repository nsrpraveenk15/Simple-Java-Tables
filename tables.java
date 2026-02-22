import java.util.Scanner;
public class tables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the Table You Want: ");
            int table = scan.nextInt();
            scan.nextLine();
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + "x2=" + i * table);
            }
            System.out.println("You want to Continue (y/n): ");
            String choice = scan.nextLine();
            if (choice.equals("y")) {
                continue;
            } else if (choice.equals("n")) {
                break;
            } else {
                System.out.println("Invalid Input ");
            }
        }
    }
}
