import java.util.Scanner;

public class e16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        System.out.println("Longitud de la frase: " + frase.length());

        System.out.println("Frase en mayúsculas: " + frase.toUpperCase());
        System.out.println("Frase en minúsculas: " + frase.toLowerCase());

        if (frase.length() >= 5) {
            System.out.println("Primeros 5 caracteres: " + frase.substring(0, 5));
        } else {
            System.out.println("Frase completa (menos de 5 caracteres): " + frase);
        }

        if (frase.length() > 2) {
            System.out.println("Carácter en posición 3: " + frase.charAt(2));
        } else {
            System.out.println("La frase no tiene un carácter en la posición 3.");
        }

        scanner.close();
    }
}

/*
__________________________ NOTAS ____________________________

  • https://www.geeksforgeeks.org/strings-in-java/
  • https://www.geeksforgeeks.org/java-string-is-immutable-what-exactly-is-the-meaning/
  • https://www.geeksforgeeks.org/java-string-concat-examples/
_____________________________________________________________
*/
