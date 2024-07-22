package BankAccount;

public interface BasicRate {
    // 回傳基本利率的方法
    default double getBasicRate(){
        return 2.5;
    }
}
