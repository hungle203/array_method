package baitap;

import java.util.Scanner;

public class MaxMin2chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hàng");
        int height = scanner.nextInt();
        System.out.println("nhập cột");
        int width = scanner.nextInt();
        int arr[][] = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.println("Nhập phần tử thứ");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.println(arr[i][j]);
            }
        }

        int max =maxArray(arr);
        System.out.println(max);

    }
    public static int maxArray(int[][] arr) {
        int max = arr[0][0];
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (max > arr[i][j]) {
                    max = arr[i][j];
                }
                if (min < arr[i][j]) {
                    min = arr[i][j];
                }
                return min;

            }
        }
        return max;
    }
}
