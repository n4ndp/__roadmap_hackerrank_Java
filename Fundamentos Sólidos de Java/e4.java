import java.util.Scanner;

public class e4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Altura (m): ");
        double altura = scanner.nextDouble();

        scanner.close();
        
        double imc = peso / (altura * altura);
        
        String clasificacion = imc < 18.5 ? "Bajo peso" :
                              imc <= 24.9 ? "Normal" : "Sobrepeso";
        
        System.out.printf("IMC: %.2f - %s%n", imc, clasificacion);
    }
}

/*
__________________________ NOTAS ____________________________

  • https://www.geeksforgeeks.org/java-io-input-output-in-java-with-examples/
  • https://www.geeksforgeeks.org/java-bufferedreader-vs-scanner-class/
_____________________________________________________________
*/
