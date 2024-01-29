import java.util.Scanner;
public class Bai3Slide93_Ngay24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap ten: ");
        String ten = scanner.nextLine();
        System.out.print(" Nhap nam sinh : ");
        int namsinh = scanner.nextInt();

        int tuoi = 2024 - namsinh;

        if (tuoi >= 20 ) {
            System.out.println(" Ban " + ten + " O do tuoi  truong thanh !");
        } else if (tuoi >= 16 && tuoi < 16) {
            System.out.println("Ban " + ten + " o do tuoi vi thanh nien !");
        } else {
            System.out.println("Ban " + ten + "o duoi do tuoi vi thanh nien !");
        }

        scanner.close();
    }
}