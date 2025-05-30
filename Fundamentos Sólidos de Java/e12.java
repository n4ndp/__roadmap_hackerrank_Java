public class e12 {
    public static void mostrarPromedio(String mensaje, double... numeros) {
        if (mensaje == null || mensaje.isEmpty()) {
            mensaje = "El promedio es";
        }
        if (numeros.length == 0) {
            System.out.println(mensaje + ": No hay números para calcular.");
            return;
        }
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        double promedio = suma / numeros.length;
        System.out.printf("%s: %.2f%n", mensaje, promedio);
    }

    public static void mostrarPromedio(double... numeros) {
        mostrarPromedio("El promedio es", numeros);
    }

    public static void main(String[] args) {
        mostrarPromedio("Promedio personalizado", 5.0, 7.5, 8.0);
        mostrarPromedio(10.0, 20.0, 30.0);
        mostrarPromedio();
    }
}

/*
__________________________ NOTAS ____________________________

  • https://www.geeksforgeeks.org/variable-arguments-varargs-in-java/
_____________________________________________________________
*/
