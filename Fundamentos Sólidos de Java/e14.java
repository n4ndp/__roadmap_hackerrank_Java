import java.util.Arrays;

public class e14 {
    public static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public static double obtenerMinimo(double[] notas) {
        double min = notas[0];
        for (double nota : notas) {
            if (nota < min) min = nota;
        }
        return min;
    }

    public static double obtenerMaximo(double[] notas) {
        double max = notas[0];
        for (double nota : notas) {
            if (nota > max) max = nota;
        }
        return max;
    }

    public static void main(String[] args) {
        double[] calificaciones = {14.5, 18.0, 12.7, 15.3, 17.9, 13.6, 19.2, 16.8, 14.0, 18.5};


        System.out.println("Calificación mínima: " + obtenerMinimo(calificaciones));
        System.out.println("Calificación máxima: " + obtenerMaximo(calificaciones));
        
        Arrays.sort(calificaciones);
        System.out.println("Calificaciones ordenadas: " + Arrays.toString(calificaciones));

        System.out.printf("Promedio de la clase: %.2f%n", calcularPromedio(calificaciones));
    }
}

/*
__________________________ NOTAS ____________________________

  • https://www.geeksforgeeks.org/jagged-array-in-java/
  • https://www.geeksforgeeks.org/array-class-in-java/
_____________________________________________________________
*/
