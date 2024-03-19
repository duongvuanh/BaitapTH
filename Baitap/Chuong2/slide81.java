public static void main (String[] args) {
    //Khai báo số dòng va số cột của ma trận
    int m, n;
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Nhap vao so cot cua ma tran: ");
    n = Scanner.nextInt();
    //Khai bao ma tran co m dong, n cot
    int A[][] = new int[m][n];
    System.out.println("Nhap cac phan tu cho ma tran: ");
    for (int i = 0; i < m: i++) {
        for (int j = 0; j < n; j++){
A[i][j] = Scanner.nextInt();
        }
    }
    //tìm phần tử có giá trị lớn nhất trong ma trận
    //giả sử phần tử tại vị trí (0,0) là phần tử lớn nhất
    int max = A[0][0]
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (max < A[i][j]) {
                max = A[i][j];
            }
        }    }
        System.out.println("Phan tu lon nhat trong ma tran = " + max);
}