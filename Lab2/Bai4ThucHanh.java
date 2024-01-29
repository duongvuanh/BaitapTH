import java.until.Scanner;

public class Bai4ThucHanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap so nguyen tu 1-12 : ");
            n = sc.nextInt();
        }
        if(n > 0)
        else if(n == 1)
            System.out.println("Thang 1");
        else if(n == 2)
            System.out.println("Thang 2");
        else if(n == 3)
            System.out.println("Thang 3");
        else if(n == 4)
            System.out.println("Thang 4");
        else if(n == 5)
            System.out.println("Thang 5");
        else if(n == 6)
            System.out.println("Thang 6");
        else
            System.out.println("Nhap sai so !");
        sc.close();

    }
}