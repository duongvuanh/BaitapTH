package chuong3.person;

public class nguoi {
    public String HoTen;
    public int tuoi;
    public String ngheNghiep;
    public String gioitinh;
    public nguoi(){
        HoTen = "DuongVuAnh";
        tuoi = 20;
        ngheNghiep = "Sinh vien";
        gioiTinh = "Nam";
    }
        public void in(){
            System.out.println(HoTen + "-" + Tuoi + "-" + ngheNghiep + "-" + gioitinh);
        }
        public void in(String name, int age, String work, String gender){
            System.out.println(name + "-" + age + "-" + work + "-" + gender );
        }
        public static void main(String[] args) {
            nguoi dva = new nguoi();
            dva.in();
            dva.in("Duong Vu Anh", 20, "Sinh vien", "Nam");
        }
    }