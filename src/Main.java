import java.util.Scanner;                           // 引入掃描器，才能創建掃描器，才能取得使用者的輸入
import java.util.Random;                            // 引入隨機產生器

void main() {
    //System.out.print("哈囉");                       // 讓電腦印出文字
/* 資料型態
    // 字串: "哈囉"                                 一串字
    System.out.println("哈囉");
    // 字元: '嗨'                                   一個字
    System.out.println('嗨');
    // 整數: 7
    System.out.println(7);
    // 浮點數: 164.1
    System.out.println(164.1);
    // 布林值: true false
    System.out.println(true);
*/
/* 變數variable，創建變數要宣告他的資料型態
    // 字串(String)
    String name = "bernie";
    System.out.println(name);
    // 字元(char): '嗨'
    char hi = 'H';
    System.out.println(hi);
    // 整數(int): 7
    int num = 7;
    System.out.println(num);
    // 浮點數(double): 164.1
    double f = 164.1;
    System.out.println(f);
    // 布林值(boolean): true false
    boolean real = false;
    System.out.println(real);
*/
/* 整數的其他型態:不能超出範圍
     byte : -128 ~ 127
     short : -32768 ~ 32767
     *int : -2147483648 ~ 2147483647
     long : -9223372036854775808 ~ 9223372036854775807
     long num1 = nL       定義時後面要加一個L!!
*/
/* 浮點數的其他型態:
     float : 精準到小數點下7位左右
        float num1 = nf       定義時後面要加一個f!!
     *double : 精準到小數點下15位左右
*/
/* 取得使用者輸入
    Scanner scanner = new Scanner(System.in);               創建scanner
    System.out.println("請輸入你的名字");
    String name = scanner.nextLine();                       取得使用者輸入(字串)
    System.out.println("哈囉" + name);

    System.out.println("請輸入你的年紀");
    int age = scanner.nextInt();                            取得使用者輸入(整數)
    System.out.println(10 + age);

    System.out.println("請輸入你的身高");
    double height = scanner.nextDouble();                   取得使用者輸入(浮點數數)
    System.out.println("你的身高:" + height);                 字串跟整數相加，整數會變成字串
*/
/* 數學計算Math
     整數對整數運算只會取得整數(ex:10/3=3)
     %取餘數
     Math.max(x, y)      取(x, y)較大者
     Math.min(x, y)      取(x, y)較小者
     Math.pow(x, y)      x的y次方
     Math.round(x)       取x四捨五入
     Math.ceil(x)         取x無條件進位
     Math.floor(x)        取x無條件捨棄
     取小數點第n位: round(x*10)/10 小數點第一位
                  round(x*100)/100 小數點第二位
                      依此類推
*/
/*判斷語句if:
    如果...
        if(條件判斷) {

        };
    如果...否則
        if(條件判斷) {

        }else {

        };
    如果...或是如果...否則
        if(條件判斷) {

        }else if(條件判斷) {

        }else {

        };
*/
/*運算符號:
     &&且 ||或 !()否
     ==相等 !=不相等
     字串相等的比較要用.equals()
       String name = "123";
       System.out.println(name.equals("1"));
*/
/* switch語句
    switch(變數){
        case 變數值1:
            ...;
            break;
        case 變數值2:
            ...;
            break;
        .
        .
        .
        default:                            都不符合上面的case，不用break
            ...;
    }
*/
/* array陣列:可以一次儲存多個值
    String[] name = {name1, name2, ...}     字串陣列
    int[] scores = {1, 2, ...}              整數陣列
    double[] heights = {140.2, 150.4, ...}  浮點數陣列
    name[n]                                 取出陣列第n+1個值
    scores[n] = m                           把第n+1個值改成m
    datatype[] name = new datatype[n]       創建一個大小為n的陣列
    陣列.length                              可以取得陣列長度
*/
/* 2D陣列:陣列裡還有陣列
    datatype[][] name = {{name1, name2}, {name3,name4}, name5, ...}
    name[n][m]                              取出陣列中第n+1個陣列第m+1個值
    scores[n][m] = s                        把第n+1, m+1個值改成s
    datatype[][] name = new datatype[n][m]  創建一個大小為n*m的陣列
*/
/* while loop
    while(條件判斷) {                         先條件判斷再執行

    }
    do {                                    先執行再條件判斷

    }while(條件判斷);
*/
/* for loop
    for(初始化; 條件判斷; 改動){
        重複執行的程式碼
    }
    (ex: for(int i=0; i<scores.length; i++){})
    for(datatype i:array){                  依序取得陣列中的值，從第一個值到最後一個值
    }
*/
/* nested loop
    for(){
        for(){
        }
    }
*/
/* break, continue
    break:直接跳出整個迴圈
    continue:直接進入下一次迴圈
*/
/* random
    Random random = new Random();           創建隨機產生器
    int x = random.nextInt(n);              隨機產生一個0~n-1的整數
    double x = random.nextDouble();         隨機產生0~1的浮點數
    double x = random.nextDouble()*n;       隨機產生0~n的浮點數
    boolean x = random.nextBoolean()        隨機產生布林值
*/
// class類別: 現實生活中有很多事是無法用現有的資料型態表示，所以需要另外寫一個類別，創建自己的資料型態
    Person person1 = new Person();
    person1.name = "bernie";
    person1.age = 22;
    person1.height = 164.1;

    Person person2 = new Person();
    person2.name = "kelly";
    person2.age = 21;
    person2.height = 163;

    System.out.println(person2.name);
}
