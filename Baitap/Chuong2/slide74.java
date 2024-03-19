public static void main (String[] args) {
    //Tinh tong cac so chan co trong mang
    int n;
    Scanner Scanner = new Scanner(System.in);
    do {
        System.out.println("Nhap vao so phan tu cua mang: ");
        n = Scanner.nextInt();
    } while (n < 0);
    int A[] = new Int[n];
    System.out.println("Nhap cac phan tu cho mang: ");
    for (int i=0; i < n; i++) {
        System.out.println("Nhap cac phan tu thu "+i +": ");
        A[i] = Scanner.nextInt();
    }
double Tong=0;
for (int i = 0; i < n; i++) {
    if (A[i] % 2 == 0) {
        Tong += A[i];
    }
}
System.out.println("Tong: " + Tong);
}