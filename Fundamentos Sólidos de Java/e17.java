import java.util.Arrays;
import java.util.Scanner;

public class e17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa comentarios separados por comas:");
        String entrada = scanner.nextLine();

        String[] comentarios = entrada.split(",");

        for (int i = 0; i < comentarios.length; i++) {
            comentarios[i] = comentarios[i].trim();
            comentarios[i] = comentarios[i].replace("feo", "***");
            comentarios[i] = comentarios[i].replaceAll("[^a-zA-Z0-9 ]", "");
        }

        boolean haySpam = false;
        for (String c : comentarios) {
            if (c.toLowerCase().contains("spam")) {
                haySpam = true;
                break;
            }
        }

        if (comentarios.length >= 2) {
            System.out.println("\n¿Primer y segundo comentario son IGUALES?: " + comentarios[0].equals(comentarios[1]));
            System.out.println("¿Ignorando mayúsculas?: " + comentarios[0].equalsIgnoreCase(comentarios[1]));
        }

        Arrays.sort(comentarios, (a, b) -> a.compareTo(b));

        System.out.println("\nComentarios procesados:");
        for (String c : comentarios) {
            System.out.println("- " + c);
        }

        if (haySpam) {
            System.out.println("\nAtención: Se detectó posible SPAM.");
        }

        scanner.close();
    }
}

/*
__________________________ NOTAS ____________________________

  • https://jenkov.com/tutorials/java/strings.html
  • https://www.geeksforgeeks.org/string-class-in-java/
_____________________________________________________________
*/
