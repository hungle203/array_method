package baitap;
import java.util.Scanner;

public class ThemMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = createArray(scanner);

        int index;
        do {
            System.out.println("Nhập vào vị trí muốn thêm: ");
            index = scanner.nextInt();
            if (index < 0 || index > array.length - 1) {
                System.out.println("Vị trí không nằm trong mảng, mời nhập lại!!!");
            }
        } while (index < 0 || index > array.length - 1);
        System.out.println("Nhập vào giá trị phần tử muốn thêm: ");
        int element = scanner.nextInt();

        array = addElement(array, index, element);
        System.out.println("Các phần tử của mảng là: ");
        for (int e : array) {
            System.out.println(e);
        }
    }

    public static int[] addElement(int[] array, int index, int element) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else {
                newArray[i] = array[i - 1];
            }
        }
        newArray[index] = element;
        return newArray;
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