package EmailApp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        while (true){
            System.out.println("Choose 1 for creating a email or anything for exit!-> ");
            int n = sc.nextInt();

            if(n == 1){
                System.out.println("Please Enter Your First Name: ");
                String firstName = sc.next();
                System.out.println("Please Enter Your First Name: ");
                String lastName = sc.next();
                Email em1 = new Email(firstName, lastName);
            }
            else
                break;

        }
    }
}