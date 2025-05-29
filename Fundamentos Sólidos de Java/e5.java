public class e5 {
    public static void main(String[] args) {
        for (int numero = 2; numero <= 50; numero++) {
            boolean esPrimo = true;
            
            for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
                if (numero % divisor == 0) {
                    esPrimo = false;
                    break;
                }
            }
            
            if (esPrimo) {
                System.out.print(numero + " ");
            }
        }
    }
}

/*
__________________________ NOTAS ____________________________

  • https://dev.java/learn/language-basics/expressions-statements-blocks/
  • https://dev.java/learn/language-basics/controlling-flow/
_____________________________________________________________
*/
