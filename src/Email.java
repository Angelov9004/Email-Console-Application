import java.util.Scanner;
import java.util.SplittableRandom;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private int defaultPasswordLenght = 10;
    private String email;
    private String companySuffix = "Angelov.com";


    //Constructor
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);


        //Calling method for department return
        this.department = setDepartment();

        //Call method , return password
        this.password = randomPassword(defaultPasswordLenght);
        System.out.println("Your password is:"+ this.password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;

    }

    //Asking for department
    private String setDepartment() {
        System.out.println("New employee:"+ firstName + " " + "|" + "Department codes: \n1 For sales \n2 For devs \n3 For Accounting \n0 For none\nEnter department code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {return "Sales"; }
        else if (depChoice == 2) {return "Devs"; }
        else if (depChoice == 3) {return "Acct"; }
        else {return ""; }


    }
    //Random password Generate
    private String randomPassword(int lenght) {
        String passwordSet = "ABCDEFGIJKLMNOPQRSTUWXYZ0123456789!@#%^";
        char[] password  = new char[lenght];
        for (int i = 0; i < lenght; i++) {
           int rand = (int ) (Math.random() * passwordSet.length());
          password[i] = passwordSet.charAt(rand);

        }
        return new String(password);
    }
   //Seting mailBox capacity
    public void setMailboxCapacity (int capacity) {
        this.mailboxCapacity = capacity;
    }

    //Set alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //Change password
    public void changePassword (String password){
        this.password = password;
    }
    public int getMailboxCapacity() { return  mailboxCapacity; }
    public String getAlternateEmail() {return alternateEmail; }
    public String getPassword() { return  password; }

    public String showInfo() {
        return "DISPLAY NAME:" + firstName + " " + lastName + "\nCompany email:" + email +
                "\nMailbox Capacity:" + mailboxCapacity + "MB";
    }

}

