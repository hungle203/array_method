package thuchanh;

import java.util.Scanner;

public class TimGiaTriMang {
    public static void main(String[] args) {
        String[] student = {"Dio", " jojo", "Doraemon", "Fubuki", "Mio" ,"Emilia", "Subaru", "Nobita", "SakuraMiko"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên học sinh");
        String input_name = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < student.length ; i++) {
            if (student[i].equals(input_name)) {
                System.out.println("Vị trí của học sinh " + input_name + "là : " + i);
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Không có " + input_name + " Trong danh sách");
        }
    }
}
