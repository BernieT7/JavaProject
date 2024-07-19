import java.util.Scanner;

void main() {
    Scanner scan = new Scanner(System.in);
    System.out.println("歡迎使用BMI計算機");
    System.out.println("請輸入您的身高(公分)");
    double height = scan.nextDouble();
    System.out.println("您的身高:" + height);
    height /= 100;
    System.out.println("請輸入您的體重(公斤)");
    double weight = scan.nextDouble();
    System.out.println("您的體重"+ weight);

    double bmi = weight/Math.pow(height, 2);
    bmi = Math.round(bmi*10)/10;
    System.out.println("您的BMI:" + bmi);

    if(bmi < 18.5) {
        System.out.println("體重過輕");
    }else if(bmi < 24) {
        System.out.println("體重正常");
    }else if(bmi < 27) {
        System.out.println("體重過重");
    }else if(bmi < 30) {
        System.out.println("輕度肥胖");
    }else if(bmi < 35) {
        System.out.println("中度肥胖");
    }else {
        System.out.println("重度肥胖");
    };
}
