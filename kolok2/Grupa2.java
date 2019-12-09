/*
 *   Napisati program koji ucitava n (1 <= n <= 10) i m (1 <= m <= 20) i matricu A[n][m];
 *   Formirati matricu B[m][n] = A[n][m] + c gde je c, maksimalna suma kolona matrice A;
 *   Program ispisuje vrednost c i matricu B;
 * 
 */

class Kolokvijum1 {

  public static void main(String[] args) {
  
    int n, m;
    do 
      n = Svetovid.in.readInt("Unesite prirodan broj n: ");
    while (n < 1 || n > 10);
    
    do
      m = Svetovid.in.readInt("Unesite prirodan broj m: ");
    while (m < 1 || m > 20);
    
    double[][] A = new double[n][m];
    double[][] B = new double[m][n];
    
    // Unos elemenata matrice A
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        A[i][j] = Svetovid.in.readInt("[" + i + "][" + j + "] --> ");
      }
    }    
    
    // Nalazi koja kolona ima najveci zbir elemenata
    double c = Integer.MIN_VALUE;
    double sum;
    for (int i = 0; i < m; i++) {
      sum = 0;
      for (int j = 0; j < n; j++) {
        sum = sum + A[j][i];
      } 
      if (sum > c)
        c = sum;      
    }    
    
    // Bji = Aij + c, gde je c maksimalna suma kolona matrice A.
    for (int j = 0; j < m; j++) {
      for (int i = 0; i < n; i++) {
        B[j][i] = A[i][j] + c;
      } 
    }   
    
    System.out.println("Vrednost broja c je: " + c + "\n");
    
    // Printa matricu B
    for (int i = 0; i < B.length; i++) {
      for (int j = 0; j < B[i].length; j++) {
        System.out.print(B[i][j] + "\t");
      }
      System.out.println();
    }
    
  }

}