package com.dangvandat.bai1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            System.out.println("nhap vao phan tu thu "+i+": ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0 ; i < n ; i++){
            for (int j = i + 1 ; j < n ; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i =0 ; i < n ; i++){
            System.out.println(arr[i]);
        }

        for (int i = 0 ; i < n ; i++){
            for (int j = i + 1 ; j < n ; j++){
                if (arr[i] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i =0 ; i < n ; i++){
            System.out.println(arr[i]);
        }
    }
}
