import java.util.Scanner;

public class e7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingrese operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);
        
        System.out.print("Ingrese segundo número: ");
        double num2 = scanner.nextDouble();

        scanner.close();
        
        double resultado = 0;
        switch (operacion) {
            case '+' -> resultado = num1 + num2;
            case '-' -> resultado = num1 - num2;
            case '*' -> resultado = num1 * num2;
            case '/' -> {
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero.");
                    return; // Salir del programa
                }
            }
            default -> System.out.println("Operación no válida.");
        }
        
        System.out.println("Resultado: " + resultado);
    }
}

/*
__________________________ NOTAS ____________________________

  • • https://dev.java/learn/language-basics/switch-expression/
_____________________________________________________________
*/
