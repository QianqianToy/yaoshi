package practice;

import java.util.Scanner;

/**
 * TODO()
 * Created by zqq on 2017/7/3 0003.
 */
public class Single {

    static Scanner scanner = new Scanner(System.in);
    String word = scanner.next();
    int i = word.length();
    int j = 0;

    public void huiWen(){
        while (j<=(i/2)-1&&word.charAt(j)==word.charAt(i-j-1)) j++;
        if (j==(i/2)) System.out.println("yes");
        else System.out.println("no");
        scanner.close();
    }

    public static void main(String[] args) {
        Single single = new Single();
        single.huiWen();
    }
}
