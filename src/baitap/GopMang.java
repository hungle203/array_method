package baitap;


import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tạo mảng 1: ");
        int[] array1 = createArray(scanner);
        System.out.println("Tạo mảng 2: ");
        int[] array2 = createArray(scanner);
        int[] array3 = new int[(array1.length + array2.length)];
        for (int i = 0; i < array3.length; i++) {
            if (i < array1.length) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i - array1.length];
            }
        }
        System.out.println("Các phần tử của mảng là: ");
        for (int e : array3) {
            System.out.println(e);
        }
    }

    public static int[] createArray(Scanner scanner) {
        System.out.println("Nhập vào độ dài mảng: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        return array;
    }
}