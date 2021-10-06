package com.Arun;

import java.util.Scanner;

class calc {
    int a;
    int b;
    int add;
    int sub;
    int mul;
    float div;
    public void opera()
    {
        add = a+b;
        sub = a-b;
        mul = a*b;
        div = (float) a/b;

    }

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calc obj = new calc();
        System.out.println("enter your choice");
        System.out.println(" 1.add\n 2.sub\n 3.mul \n 4.div");
        int operation = scanner.nextInt();
        System.out.println("enter a");
        obj.a = scanner.nextInt();
        System.out.println("enter b");
        obj.b = scanner.nextInt();
        if (operation == 1 ) {
            System.out.println(obj.add);
        }
        else{
            System.out.println("invalid option");
        }


    }

}
