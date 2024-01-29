import java.until.Scanner;

public class ngay24_1_bthtrang40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap so ngay : ");
            n = sc.nextInt();
        } while(n < 0);
        if(n == 0)
            System.out.println("Chu nhat");
        else if(n == 1)
            System.out.println("Thu Hai");
        else if(n == 2)
            System.out.println("Thu Ba");
        else if(n == 3)
            System.out.println("Thu Tu");
        else if(n == 4)
            System.out.println("Thu Nam");
        else if(n == 5)
            System.out.println("Thu Sau");
        else if(n == 6)
            System.out.println("Thu Bay");
        else
            System.out.println("Nhap ngay khong co trong tuan !");
        sc.close();

    }
}