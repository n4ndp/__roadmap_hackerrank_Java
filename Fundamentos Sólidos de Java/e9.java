public class e9 {
    public static void main(String[] args) {
        int filas = 5;
        for (int i = 1; i <= filas; i++) {

            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
__________________________ NOTAS ____________________________

  • https://www.geeksforgeeks.org/loops-in-java/
_____________________________________________________________
*/
