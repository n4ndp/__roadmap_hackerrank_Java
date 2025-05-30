import java.util.Arrays;

public class e13 {
    public static void main(String[] args) {
        double[] temperaturas = {22.5, 21.0, 23.8, 19.6, 20.1, 22.3, 21.9};
        
        System.out.println("Temperaturas registradas: " + Arrays.toString(temperaturas));
        
        double suma = 0;
        for (double temp : temperaturas) {
            suma += temp;
        }
        double promedio = suma / temperaturas.length;
        
        System.out.printf("Temperatura promedio semanal: %.2f°C%n", promedio);
    }
}

/*
__________________________ NOTAS ____________________________

  • https://dev.java/learn/language-basics/arrays/
  • https://www.geeksforgeeks.org/arrays-in-java/
  • https://www.geeksforgeeks.org/how-to-declare-and-initialize-an-array-in-java/
_____________________________________________________________
*/
