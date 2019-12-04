class Probni {
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite n [1, 20]: ");
    } while (n <= 0 && n > 20);
    
    int[][] A = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        A[i][j] = Svetovid.in.readInt("Unesite [" + i + "][" + j + "]: ");
      }
    }
    
    int a = A[0][0], b = A[0][n - 1];
    for (int i = 1; i < n; i++) {
      if (A[i][i] > a) {
        a = A[i][i];
      }
      if (A[i][n - i - 1] < b) {
        b = A[i][n - i - 1];
      }
    }
    
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    
    int[][] B = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        B[i][j] = (A[i][j] > b && A[i][j] < a) ? (a + b) / 2 : A[i][j];
        System.out.print("\t" + B[i][j]);
      }
      System.out.println();
    }
  }
}
