import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String email;
    private String companySuffix = "aeycompany.com";

    // Construction to get the first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call a method asking for department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // Call a method that returns a random password
        int defaultPasswordLength = 10;
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is " + this.email);

    }

    public String getPassword() {
        return password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    // Ask for the department
    private String setDepartment() {
        System.out.println("DEPARTMENT CODES");
        System.out.println("1. for Sales");
        System.out.println("2. for Development");
        System.out.println("3. for Accounting");
        System.out.println("0. for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // change the password
    public void changePassword(String password) {
       this.password = password;
    }

    public String showInfo() {
        String fullName = "DISPLAY NAME: " + this.firstName + " " + this.lastName;
        String companyName = "COMPANY NAME: " + this.companySuffix;
        return fullName + "\n" + companyName;

    }
}
