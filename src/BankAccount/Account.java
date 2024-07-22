package BankAccount;

import java.util.Random;

public abstract class Account implements BasicRate {
    // 存款&線上 共同有的屬性
    private String name;
    private String id;
    private int balance;
    protected String accountNum;
    protected Double rate;
    private static int index = 10000;

    // 建構方法設定屬性
    public Account(String name, String id, int balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.accountNum = generateAccountNumber();
        Account.index++;
    }

    // 存款&線上 共同有的方法
    public void withdraw(int amount){
        if(this.balance>amount) {
            this.balance -= amount;
            System.out.println("領出:" + amount);
            this.showBalance();
        }else {
            System.out.println("餘額不足，取款失敗");
            this.showBalance();
        }
    }
    public void deposit(int amount){
        this.balance += amount;
        System.out.println("存入:" + amount);
        this.showBalance();
    }
    public void transfer(String toWhere, int amount){
        if(this.balance>amount) {
            this.balance -= amount;
            System.out.println("轉出:" + amount + "給" + toWhere);
            this.showBalance();
        }else {
            System.out.println("餘額不足，轉帳失敗");
            this.showBalance();
        }
    }

    public void showBalance(){
        System.out.println("餘額:"+this.balance);
    }

    public void showInfo() {
        System.out.println("姓名:" + this.name + " 身分證字號:" + this.id + " 餘額" + this.balance);
        System.out.println("帳戶號碼:" + this.accountNum);
    }

    private String generateAccountNumber() {
        String idLastTwo = this.id.substring(this.id.length() - 2, this.id.length());
        int uniqueNum = Account.index;
        return idLastTwo + uniqueNum + this.generateRandomNum(3);
    }

    protected String generateRandomNum(int digit) {
        String num = "1234567890";
        String result = "";
        Random random = new Random();
        for (int i = 0; i < digit; i++) {
            result += num.charAt(random.nextInt(10));
        }
        return result;
    }

    public abstract void setRate();
}
