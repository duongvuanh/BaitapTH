import java.util.Scanner;

public class Bai5ThucHanh {
    public static void main(String[] args) {
        int a;
        int sum = 0;
        while (true) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap vao so nguyen a: ");
        a = scanner.nextInt();
        if (a==0) {
            break;
        }
        sum += a;
        if (sum > 100) {
            System.out.println("Tong cac so da nhap vuot qua 100 !");
            break;
        }
    }
    System.out.println(" Tong = " + sum);
    }
}