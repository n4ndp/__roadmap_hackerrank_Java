import java.util.Scanner;

public class e10 {
    public static void mostrarSaludo() {
        System.out.println("¡Bienvenido al mundo Java!");
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        mostrarSaludo();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        scanner.close();

        double area = calcularAreaRectangulo(base, altura);
        System.out.println("El área del rectángulo es: " + area);
    }
}

/*
__________________________ NOTAS ____________________________

  • https://www.geeksforgeeks.org/methods-in-java/
  • https://www.geeksforgeeks.org/how-to-call-a-method-in-java/
_____________________________________________________________
*/
