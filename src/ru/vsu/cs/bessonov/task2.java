package ru.vsu.cs.bessonov;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Счет 1 матча ");

        System.out.print("N1:");
        double n1=sc.nextDouble();

        System.out.print("M1:");
        double m1=sc.nextDouble();

        System.out.println("Счет 2 матча ");
        System.out.print("N2:");
        double n2=sc.nextDouble();

        System.out.print("M2:");
        double m2=sc.nextDouble();

        double z1=n1+n2;
        double z2=m1+m2;

        if (z1-z2>0) {
            System.out.println("Первая команда выходит в следующий круг соревнований");
        } else if(z1-z2<0) {
            System.out.println("Вторая команда выходит в следующий круг соревнований");
        } else if (z1 -z2==0) {
            if (z1>z2) {
                System.out.println("Первая команда выходит в следующий круг соревнований");
            } else {
                System.out.println("Вторая команда выходит в следующий круг соревнований");
            }
        }


    }
}
