package baitap;

import java.util.Scanner;

public class SumRow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row,column;

      do {
          System.out.println("Nhập số hàng ");
          row = scanner.nextInt();
          System.out.println("Nhập số cột");
          column = scanner.nextInt();
          if (row!= column) {
              System.out.println("Hàng và cột không giống nhau, nhập cmm lại");
          }
      }while (row!=column);
      double[][] array = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column ; j++) {
                System.out.println(array[i][j]);
            }
            sumRow(array);
        }

    }
    public static void sumRow(double[][] array) {
        double sum = 0;
        for (int j = 0; j < array.length ; j++) {
            sum += array[j][j];
        }
        System.out.println(sum);
    }
}

