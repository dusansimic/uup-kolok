/* Napisati program u koji se unosi velicina matrice karaktera n (5, 20) i trazi namanji karakter ispod glavne
 * dijagonale i ispisuje ga. Takodje treba ispisati novu matricu koja je ista kao prva ali su sva velika slova lower
 * case.
 */

class Grupa1 {
  public static void main(String[] args) {
    int n;
    do {
      n = Svetovid.in.readInt("Unesite velicinu matrice karaktera (n): ");
    } while (n <= 5 && n >= 20);
    
    char[][] matrica = new char[n][n];
    char min = (char) 127;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrica[i][j] = Svetovid.in.readChar("Unesite element matrice: ");
        if (j < i && matrica[i][j] < min) {
          min = matrica[i][j];
        }
      }
    }
    System.out.println("Minimalni element je: " +  min);
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("\t" + (char) ((matrica[i][j] >= 'A' && matrica[i][j] <= 'Z') ? Character.toLowerCase(matrica[i][j]) : matrica[i][j]));
      }
      System.out.println();
    }
  }
}