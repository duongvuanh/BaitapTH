package hinhhoc;
import java.until.scanner;
public class HinhChuNhat {
    float dai;
    float rong;
    float cv;
    float dt;

    public void nhapChieuDai() {
        System.out.println("Hay nhap vao Chieu Dai Hinh Chu Nhat: ");
        scanner scanner = new scanner(System.in);
        dai = scanner.nextFloat();
    }
    public void tinhChuVi() {
        cv = 2 * (dai + rong);
    }
    public void tinhDienTich() {
        dt = dai * rong;
    }
    public void inChuVi() {
        System.out.println("Chu Vi Hinh Chu Nhat: " + cv);
    }
    public void inDienTich() {
        System.out.println("Dien Tich Hinh Chu NHat: " + dt);
    }
    }
