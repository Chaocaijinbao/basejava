package cn.how2j.operatorexercise;

import java.util.Scanner;

public class AddExercise1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("第一个整数："+a);
        int b=s.nextInt();
        System.out.println("第二个整数："+b);
        int sum=a+b;
        System.out.println("两个数的和是："+sum);
    }
}
