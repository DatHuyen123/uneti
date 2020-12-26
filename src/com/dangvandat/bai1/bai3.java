package com.dangvandat.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();
        System.out.println("nhap vao so luong phan tu cua list: ");
        int n = scanner.nextInt();
        for (int i = 0 ; i < n ; i++){
            System.out.println("nhap vao phan tu thu " + (i+1) + ": ");
            integers.add(scanner.nextInt());
        }
        for (int i = 0 ; i < n ; i ++){
            for (int j = i + 1 ; j < n ; j++){
                if (integers.get(i) > integers.get(j)){
                    int temp = integers.get(j);
                    integers.add(j , integers.get(i));
                    integers.add(i , temp);
                }
            }
        }
        for (Integer integer : integers) {
            System.out.println(integer.toString());
        }
    }
}
