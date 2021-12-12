package baitap;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size ; i++) {
            System.out.println("Nhập vào phần tử thứ" + (i + 1));
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Số lớn nhất của mảng là" + max);
        System.out.println("số nhỏ nhất của mảng là" + min);
    }
}
