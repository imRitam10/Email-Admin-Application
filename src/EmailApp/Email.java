package EmailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String companyNameSuffix = "xyzcomp.com";
    private String email;
    Scanner sc = new Scanner(System.in);

    /**
     * Constructor to receive the first and last name
     * @param firstName
     * @param lastName
     */
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        /**
         * call a method asking for the department
         * return the department
         */
        this.department = setDepartment();
        System.out.println("\nName: " + firstName + " " + lastName);
        System.out.println("Department: " + this.department);

        /**
         * combine elements to create email
         * firstname.lastName@department.companyName
         */
        email = firstName.toLowerCase() + "-" + lastName.toLowerCase() + "." + department.toLowerCase() + "@"  + companyNameSuffix;
        System.out.println("Your email id is: " + email);

        /**
         * Call a method that return a random password
         */
        this.password = randomPassword(10);
        System.out.println("Your Password is: " + this.password +"\n");
        System.out.println("Email Created for:" + this.firstName + " " + this.lastName);
        System.out.println("Have a good day "+ firstName + "\n\n");


    }

    /**
     * Ask for the department
     */
    private String setDepartment(){
        System.out.println("\nDepartment Code -> \n 1 for Sales\n 2 for Development\n 3 for Accounting\n 4 for exit\nEnter your department code-->");
        int departmentChoice = sc.nextInt();
        if(departmentChoice == 1) return "Sales";
        if(departmentChoice == 2) return "Developer";
        if(departmentChoice == 3) return "Accounting";
        else return "";
    }

    /**
     * Generate a random password
     */
    private String randomPassword(int length){
        String passwordSet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz!@#$%123456789";
        char[] password = new char[length];
        for(int i = 0 ; i < length; i++){
            int random = (int) (Math.random() * passwordSet.length());
            password[i] =passwordSet.charAt(random);
        }
        return new String(password);
    }
}
