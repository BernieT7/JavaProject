package BankAccount;

public class OnlineAccount  extends Account {
    // 網路帳戶特有屬性
    private String userAccount;
    private String password;
    // 建構方法
    public OnlineAccount(String name, String id, int balance, String userAccount, String password) {
        super(name, id, balance);
        this.userAccount = userAccount;
        this.password= password;
        super.accountNum = "2" + super.accountNum;
        this.setRate();
    }
    // 網路帳戶特有方法
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("帳戶類型:網路帳戶");
        System.out.println("網銀帳號:"+this.userAccount+" 網銀密碼:"+this.password+"\n");
        System.out.println("存款利率:"+super.rate+"%");
    }

    @Override
    public void setRate(){
        super.rate = getBasicRate() - 0.2;
    }
}
