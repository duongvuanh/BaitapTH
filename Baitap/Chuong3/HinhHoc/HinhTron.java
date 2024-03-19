package hinhhoc;

import java.until.Scanner;

public class HinhTron {
    final float PI = 3.14f;

    float r;
    float cv;
    float dt;

    public void NhapBankinh() {
        System.out.println("Hay Nhap Ban Kinh Hinh Tron: ");
        Scanner scanner = new Scanner(System.in);
        r = Scanner.nextFloat;
    }
    public void tinhChuVi() {
        cv = 2 * PI * r;
    }
    public void tinhDienTich() {
        dt = PI * r * r;
    }
    public void inChuvi() {
        System.out.println("Chu Vi Hinh Tron: " + cv);
    }
    public void inDienTich() {
        System.out.println("Dien Tich Hinh Tron: " + dt);
    }
}