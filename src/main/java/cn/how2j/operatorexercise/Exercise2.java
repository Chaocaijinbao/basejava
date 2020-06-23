package cn.how2j.operatorexercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入身高（m）：");
        double height=s.nextDouble();
        System.out.println("请输入体重（kg）：");
        double weight=s.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("当前的BMI是："+bmi);
    }
}
