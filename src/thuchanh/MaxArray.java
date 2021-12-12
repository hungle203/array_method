package thuchanh;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
            int size;
            int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng phần tử mảng: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Số lượng không được quá 200");
            }
        }while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Danh sách: ");
        for (int j = 0; j <array.length ; j++) {
            System.out.println(array[j] );
        }
        int max =0;
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max ) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là " + max + " tại vị trí " + index);

    }
}
