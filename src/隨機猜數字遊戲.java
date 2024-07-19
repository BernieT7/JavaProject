import java.util.Random;
import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int ans = random.nextInt(100) + 1;
    boolean run = true;
    while(run) {
        System.out.println("請輸入1~100的數字:");
        int res = scanner.nextInt();
        if(res == ans){
            System.out.println("恭喜你答對了！！");
            break;
        }else if(res > ans) {
            System.out.println("小一點");
        }else{
            System.out.println("大一點");
        }
    }
}
