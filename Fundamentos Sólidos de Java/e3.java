public class e3 {
    public static void main(String[] args) {
        final double TASA_IMPUESTO = 0.18;
        var precioProducto = 150.0;

        double impuesto = precioProducto * TASA_IMPUESTO;
        double precioFinal = precioProducto + impuesto;

        System.out.println("Precio base: " + precioProducto);
        System.out.println("Impuesto (18%): " + impuesto);
        System.out.println("Precio final: " + precioFinal);
    }
}

/*
__________________________ NOTAS ____________________________

  • https://www.geeksforgeeks.org/final-keyword-in-java/
  • https://dev.java/learn/language-basics/using-var/
_____________________________________________________________
*/
