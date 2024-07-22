package BankAccount;

public class SavingsAccount extends Account {
    // 存款帳戶特有屬性
    private String cardNum;
    private String cardSecurityCode;
    private static int index = 10000;
    // 建構方法
    public SavingsAccount(String name, String id, int balance){
        super(name, id, balance);
        super.accountNum = "1" + super.accountNum;
        SavingsAccount.index++;
        this.cardNum = this.generateCardNum();
        this.cardSecurityCode = super.generateRandomNum(3);
        this.setRate();
    }
    // 存款帳戶特有方法
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("帳戶類型:存款帳戶");
        System.out.println("卡號:"+this.cardNum+" 安全碼:"+this.cardSecurityCode+"\n");
        System.out.println("存款利率:"+super.rate+"%");
    }

    private String generateCardNum(){
        String randNum = super.generateRandomNum(5);
        String randNum2 = super.generateRandomNum(5);
        return randNum + SavingsAccount.index + randNum2;
    }

    @Override
    public void setRate(){
        super.rate = getBasicRate() + 0.2;
    }
}
