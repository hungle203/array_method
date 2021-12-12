package baitap;

import java.util.Scanner;

public class XoaMang {
    public static void main(String[] args) {
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử mảng: ");
        array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length ; i++) {
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Nhập vào phần tử muốn xóa");
        int clear = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == clear) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length -1] = 0;
            }
        }
        for (int k:array ) {
            System.out.println(k);
        }

    }

}
