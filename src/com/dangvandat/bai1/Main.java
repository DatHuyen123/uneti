package com.dangvandat.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so a: ");
        int a = scanner.nextInt();
        System.out.println("nhap vao so b: ");
        int b = scanner.nextInt();
        System.out.println("nhap vao so c: ");
        int c = scanner.nextInt();

        int max = a;
        if (b > max) {
            System.out.println("so lon nhat la " + b);
            return;
        }
        if (c > max) {
            System.out.println("so lon nhat la " + c);
            return;
        }
        System.out.println("so lon nhat la " + max);
    }
}
