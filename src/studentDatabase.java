import Students.Student;

import java.util.Scanner;

public class studentDatabase{
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入要加入多少位學生");
        int studentNum = scanner.nextInt();
        scanner.nextLine();
        Student[] students = new Student[studentNum];
        for(int i = 0; i < studentNum; i++) {
            Student student = new Student();
            students[i] = student;
        }
    }
}
