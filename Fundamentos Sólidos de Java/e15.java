import java.util.Arrays;
import java.util.Scanner;

public class e15 {
    static String[] frutas = {"Manzana", "Banana", "Naranja", "Pera", "Uva"};
    static int[] cantidades = {50, 30, 20, 40, 15};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarInventario();
                    break;
                case 2:
                    ordenarInventario();
                    break;
                case 3:
                    buscarCantidad(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo... ¡Gracias!");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
            System.out.println();

        } while (opcion != 4);

        scanner.close();
    }

    static void mostrarMenu() {
        System.out.println("=== Gestión de Inventario de Frutas ===");
        System.out.println("1. Mostrar inventario");
        System.out.println("2. Ordenar inventario por cantidad");
        System.out.println("3. Buscar cantidad de fruta");
        System.out.println("4. Generar reporte (primeras 3 frutas)");
        System.out.println("5. Salir");
    }

    static void mostrarInventario() {
        System.out.println("Inventario actual:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.printf("%s: %d unidades%n", frutas[i], cantidades[i]);
        }
    }

    static void ordenarInventario() {
        String[] frutasCopia = Arrays.copyOf(frutas, frutas.length);
        int[] cantidadesCopia = Arrays.copyOf(cantidades, cantidades.length);

        for (int i = 0; i < cantidadesCopia.length - 1; i++) {
            for (int j = 0; j < cantidadesCopia.length - 1 - i; j++) {
                if (cantidadesCopia[j] > cantidadesCopia[j + 1]) {
                    int tempCant = cantidadesCopia[j];
                    cantidadesCopia[j] = cantidadesCopia[j + 1];
                    cantidadesCopia[j + 1] = tempCant;

                    String tempFruta = frutasCopia[j];
                    frutasCopia[j] = frutasCopia[j + 1];
                    frutasCopia[j + 1] = tempFruta;
                }
            }
        }

        System.out.println("Inventario ordenado por cantidad (menor a mayor):");
        for (int i = 0; i < frutasCopia.length; i++) {
            System.out.printf("%s: %d unidades%n", frutasCopia[i], cantidadesCopia[i]);
        }
    }

    static void buscarCantidad(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Ingresa el nombre de la fruta a buscar: ");
        String frutaBuscada = scanner.nextLine().trim();

        boolean encontrado = false;
        for (int i = 0; i < frutas.length; i++) {
            if (frutas[i].equalsIgnoreCase(frutaBuscada)) {
                System.out.printf("La cantidad de %s es: %d unidades%n", frutas[i], cantidades[i]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Fruta no encontrada en el inventario.");
        }
    }
}

/*
__________________________ NOTAS ____________________________

  • https://www.geeksforgeeks.org/final-arrays-in-java/
  • https://jenkov.com/tutorials/java/arrays.html
_____________________________________________________________
*/
