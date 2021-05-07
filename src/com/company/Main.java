package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 20;
        int array[] = new int[size];
        array[0]=5;
        array[1]=8;
        array[2]=9;
        array[3]=4;
        array[4]=3;
        array[5]=7;
        int n = 6;
        System.out.print("Mảng trước khi xóa :");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.print("\n");
        System.out.print("Nhập x cần thêm :");
        int x = sc.nextInt();
        System.out.print("\n");
        System.out.print("Nhập vị trí index cần thêm : ");
        int index = sc.nextInt();
        if (index<=1||index>=array.length-1){
            System.out.println("Mảng không thêm được");
        }else {
            for (int i = index; i < n+1; i++) {
                int temp = array[index];
                array[index] = array[i+1];
                array[i+1]=temp;
            }
            array[index]=x;
        }
        System.out.print("Mảng sau khi thêm :");
        for (int i = 0; i < n+1; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
