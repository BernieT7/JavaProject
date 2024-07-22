// 這是一個管理一間公司email的app，會為員工自動生成email及密碼
// 可以利用setPassword, setCapacity, setAlternateEmail更改密碼、容量以及備用email
// 可以利用getName, getEmail, getPassword, getCapacity, getAlternateEmail取得員工名字、密碼、email、密碼、容量、備用email
import Emails.Email;

import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What's your first name?");
    String fName = scanner.nextLine();
    System.out.println("What's your last name");
    String lName = scanner.nextLine();
    Email e = new Email(fName, lName);
    System.out.println(e.showInfo());
}
