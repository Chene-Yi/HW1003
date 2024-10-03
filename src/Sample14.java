/*public class Sample1 {
    public static void main(String[] args) {
        System.out.print("歡迎使用Java!");
        System.out.print("開始使用Java吧!");
    }
}

public class Sample2 {
    public static void main(String[] args) {
        System.out.println("歡迎使用Java!");
        System.out.println("開始使用Java吧!");
    }
}

public class Sample3 {
    public static void main(String[] args) {
        System.out.println('A');
        System.out.println("歡迎使用Java!");
        System.out.println(123);
    }
}

public class Sample4 {
    public static void main(String[] args) {
        System.out.println("顯示出反斜線:\\");
        System.out.println("顯示出單引號\'");
    }
}

public class Sample5 {
    public static void main(String[] args) {
        System.out.println("八進位數101的字元是\101");
        System.out.println("十六進位數0061的字元是\u0061");
    }
}

public class Sample6 {
    public static void main(String[] args) {
        System.out.println("十進位的10是" + 10);
        System.out.println("八進位的10是" + 010);
        System.out.println("十六進位的10是" + 0x10);
        System.out.println("十六進位的10是" + 0xF);
    }
}

public class Sample7 {
    public static void main(String[] args) {
        int num;

        num = 3;

        System.out.println("變數num的值是" + num);
    }
}

public class Sample8 {
    public static void main(String[] args) {
        int num = 3;

        System.out.println("變數num的值是" + num);

        num = 5;
        System.out.println("更新變數num的值");
        System.out.println("變數num更新後的值是" + num);
    }
}

public class Sample9 {
    public static void main(String[] args) {
        int num1, num2;

        num1 = 3;

        System.out.println("變數num1的值是" + num1);

        num2 = num1;

        System.out.println("將變數num1指定到變數num2之中");
        System.out.println("變數num2的值是" + num2);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Gatherer.Integrator;

public class Sample10 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入一個整數");

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br1.readLine();

        int num = Integer.parseInt(str1);

        System.out.println("您輸入的數字是:" + num);
        System.out.println("請輸入字串");

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String str2 = br2.readLine();

        System.out.println("剛剛輸入的字串是:" + str2);
    }

}

public class Sample11 {
    public static void main(String[] args) {
        System.out.println("1 + 2等於" + (1 + 2));
        System.out.println("3 * 4等於" + (3 * 4));

        int num1 = 2;
        int num2 = 3;
        int sum = num1 + num2;

        System.out.println("變數num1的值是" + num1);
        System.out.println("變數num2的值是" + num2);
        System.out.println("num1 + num2 的值是" + sum);

        num1 = num1 + 1;
        System.out.println("變數num1的值加一之後是" + num1);
    }

}

public class Sample12 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println("num1 和 num2 的各種運算:");
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));

        int a = 0;
        int b = 0;
        int c = 0;

        b = a++;
        c = ++a;

        System.out.println("因為是在指定值之後才遞增,所以b的值為" + b);
        System.out.println("因為是在遞增之後才指定值,所以c的值為" + c);
    }

}

public class Sample13 {
    public static void main(String[] args) {
        double dnum = 160.5;

        System.out.println("身高是" + dnum + "公分");
        System.out.println("指定給int型態的變數");

        int inum = (int) dnum;
        System.out.println("身高是" + inum + "公分");
    }

}*/

public class Sample14 {
    public static void main(String[] args) {
        int d = 2;
        double pi = 3.14;

        System.out.println("直徑是" + d + "公分的圓");
        System.out.println("其圓周為" + (d * pi) + "公分");

        int num1 = 5;
        int num2 = 4;

        double div1 = num1 / num2;
        double div2 = (double) num1 / (double) num2;

        System.out.println("5 / 4等於" + div1);
        System.out.println("5 / 4等於" + div2);
    }

}