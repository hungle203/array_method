package baitap;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, column;

        do {
            System.out.println("Nhập số hàng");
            row = scanner.nextInt();
            System.out.println("Nhập số cột");
            column = scanner.nextInt();
            if (row!=column)
                System.out.println("Số dòng khác số cột, nhập lại");
        }while (row!=column);
        double[][] array = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column ; j++) {
                System.out.println(array[i][j]);
            }
            System.out.println();
        }
        sumArray(array);
    }
    public static void sumArray(double[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum += array[i][i];
        }
        System.out.println("Tổng các số dòng ở dường chéo chính là =" + sum);
    }
}
