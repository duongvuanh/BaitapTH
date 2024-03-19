import java.until.Scanner;

public class giaiptbac2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scannere(System.in);
        double a;
        do{
            System.out.println("Nhap he so A = ");
            A = sc.nextdouble();
        }while (A == o);
        System.out.println("Nhap he so B = ");
        double b = sc.nextDouble();
        System.out.println("Nhap he so C = ");
        double C = sc.nextDouble();
        double delta = Math.pow(b,2) - (4*a*c);
        if (delta < 0 ){
            System.out.println("Phuong trinh vo nghiem!");
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep :x1 = x2 = " + -b/2*a);
        } else
            System.out.println("Phuong trinh co 2 nghiem phan biet la: ");
            System.out.printf("x1 = %.2f \n",(-b + Math.sqrt(delta))/2 *a);
            System.out.printf("x2 = %.2f", (-b - Math.sqrt(delta))\2 *a);
    }
}             