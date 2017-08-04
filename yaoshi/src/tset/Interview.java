package tset;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * TODO()
 * Created by zqq on 2017/8/4 0004.
 */
public class Interview {

    public void test1(){
        int sum = 0;
        for (int i = 10; i <=100; i++) {
            if (i%3==0||i%5==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }

    public void test2(){
        String str = "abcd";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length()-1; i >=0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {
        Interview interview = new Interview();
        interview.test2();


        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        reversal(stack);

        while (stack.size()>0) System.out.println(stack.pop());
    }

    private static void reversal(Stack stack) {
        Queue queue = new LinkedList();
        while (stack.size()>0) queue.offer(stack.pop());
        while (queue.size()>0) stack.push(queue.poll());
    }


}
