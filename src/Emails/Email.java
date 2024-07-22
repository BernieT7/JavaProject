package Emails;

import java.util.Random;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String alternateEmail;
    private String department;
    private static final int defaultPasswordLength = 10;
    private int capacity = 500;

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("請問您的部門是?(1~3)");
        System.out.println("(1)行銷");
        System.out.println("(2)IT");
        System.out.println("(3)會計");
        this.department = this.setDepartment();
        this.password = this.generatePassword(Email.defaultPasswordLength);
        generateEmail();
    }

    private String setDepartment(){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int dep = scanner.nextInt();
            switch(dep) {
                case 1:
                    return "sales";
                case 2:
                    return "IT";
                case 3:
                    return "accounting";
                default:
                    System.out.println("請輸入1~3");
            }
        }
    }

    private String generatePassword(int length) {
        Random random = new Random();
        String passwordSet = "abcdefghijklmnopqrstuvwxyz1234567890!@#$%";
        String randomPassword = "";
        for (int i = 0; i < length; i++) {
            int randChar = random.nextInt(passwordSet.length());
            char addChar = passwordSet.charAt(randChar);
            randomPassword += addChar;
        }
        return randomPassword;
    }

    private void generateEmail() {
        this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + ".company.com";
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }

    public String getName(){
        return this.firstName + " " + this.lastName;
    }

    public String getEmail(){
        return this.email;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getPassword(){
        return this.password;
    }

    public String getAlternateEmail(){
        return this.alternateEmail;
    }

    public String showInfo(){
        return "你的密碼:" + this.getPassword() +
                "\n你的名字:" + this.getName() +
                "\n你的email:" + this.getEmail() +
                "\n你的email容量:" + this.getCapacity() + " mb";
    }
}
