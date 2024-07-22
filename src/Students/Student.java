package Students;

import java.util.Scanner;

public class Student {
    private final String name;
    private int studentID;
    private String lessons = "";
    private final int grade;
    private int unPaid;
    private int fee = 0;
    private static int studentNum1 = 0;
    private static int studentNum2 = 0;
    private static int studentNum3 = 0;
    private static int studentNum4 = 0;

    public Student(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入學生姓名");
        this.name = scanner.nextLine();
        System.out.println("請輸入學生年級(1~4):\n(1)一年級\n(2)二年級\n(3)三年級\n(4)四年級");
        while(true) {
            int year = scanner.nextInt();
            if(year<=4 && year>=1){
                this.grade = year;
                break;
            }else{
                System.out.println("請輸入1~4");
            }
        }
        System.out.println("你的學費:"+computeFee());
        this.unPaid = this.computeUnPaid();
        System.out.println("你的未繳學費:"+this.unPaid);
        this.showInfo();
    }

    private int generateStudentID(){
        if(this.grade == 1) {
            Student.studentNum1 += 1;
            this.studentID = this.grade * 10000 + Student.studentNum1;
            return this.studentID;
        }else if(this.grade == 2){
            Student.studentNum2 += 1;
            this.studentID = this.grade * 10000 + Student.studentNum2;
            return this.studentID;
        }else if(this.grade == 3) {
            Student.studentNum3 += 1;
            this.studentID = this.grade * 10000 + Student.studentNum3;
            return this.studentID;
        }else {
            Student.studentNum4 += 1;
            this.studentID = this.grade * 10000 + Student.studentNum4;
            return this.studentID;
        }
    }

    private int computeFee(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("請輸入要註冊的課程 - 國文、英文、數學、物理、化學 (輸入Q退出)");
            String choice = scanner.nextLine();
            if(choice.equals("Q")){
                break;
            }else{
                this.lessons = this.lessons + choice + "\n";
                this.fee += 600;
            }
        }
        return this.fee;
    }

    private int computeUnPaid(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入你要繳款的金額:");
        int pay = scanner.nextInt();
        System.out.println("感謝你的繳費:"+pay);
        return this.fee - pay;
    }

    private void showInfo(){
        System.out.println("你的名字:"+this.name+"\n你的學號:"+this.generateStudentID());
        System.out.println("註冊課程:");
        System.out.print(this.lessons);
        System.out.println("未繳學費:"+this.unPaid);
    }

}
