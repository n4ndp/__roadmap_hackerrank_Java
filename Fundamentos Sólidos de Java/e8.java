public class e8 {
    public static void main(String[] args) {
        int numero = 3456;
        int contador = 0;
        int temp = numero;
        
        if (temp == 0) {
            contador = 1;
        } else {
            while (temp != 0) {
                temp /= 10;
                contador++;
            }
        }
        
        System.out.println(numero + " tiene " + contador + " dígitos.");
    }
}

/*
__________________________ NOTAS ____________________________

  • https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/
_____________________________________________________________
*/
