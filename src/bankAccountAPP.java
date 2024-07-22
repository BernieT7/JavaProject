// 銀行 App，可以幫助新用戶開設帳戶，讀取一份用戶檔案(包含用戶姓名、身分證字號、開設帳戶類型、初始存入金額...)
// 創建上述檔案的所有帳戶，帳戶分成2種(存款帳戶、網路帳戶)，2種帳戶都能 存錢、取錢、轉錢、也都能取得所有帳戶資訊
// 創建帳戶時會隨機生成帳戶號碼總共11碼，存款帳戶開頭為1，網路帳戶開頭為2 +身分證後2碼 + 5碼不重複數字 + 3碼隨機數字
// 存款帳戶另外有一張金融卡(有卡號、安全碼)，卡號為15碼(5碼隨機數字 + 5碼不重複數字 + 5碼隨機數字)以及安全碼3碼(3碼隨機數字)
// 網路帳戶另外有網路銀行帳號、密碼(創建時須設定)，兩種帳戶都使用接口決定基本利率，存款帳戶利率為 基本利率+0.2%
// 網路帳戶利率為 基本利率-0.2%
import BankAccount.Account;
import BankAccount.OnlineAccount;
import BankAccount.SavingsAccount;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class bankAccountAPP {
    public static void main(String[] args) throws IOException {
        ArrayList<Account> accounts = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(args[0]);
            BufferedReader reader = new BufferedReader(fileReader);
            String data = reader.readLine();
            while (data != null) {
                String[] splitData = data.split(",");
                if (splitData[2].equals("存款")) {
                    SavingsAccount savingsAccount = new SavingsAccount(splitData[0], splitData[1], Integer.parseInt(splitData[3]));
                    accounts.add(savingsAccount);
                } else {
                    OnlineAccount onlineAccount = new OnlineAccount(splitData[0], splitData[1], Integer.parseInt(splitData[3]), splitData[4], splitData[5]);
                    accounts.add(onlineAccount);
                }
                data = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("找不到檔案");
        } catch (IOException e) {
            System.out.println("IO錯誤");
        }
        for (Account account: accounts) {
            account.showInfo();
        }
    }
}
