public class e11 {
    static int contadorStatic = 0;
    int contadorInstance = 0;

    public e11() {
        contadorStatic++;
        contadorInstance++;
    }

    public static void mostrarContadorStatic() {
        System.out.println("Contador estático: " + contadorStatic);
    }

    public void mostrarContadorInstance() {
        System.out.println("Contador de instancia: " + contadorInstance);
    }

    public static void main(String[] args) {
        e11 obj1 = new e11();
        e11 obj2 = new e11();

        e11.mostrarContadorStatic();

        obj1.mostrarContadorInstance();
        obj2.mostrarContadorInstance();

        System.out.println("obj1.contadorStatic: " + obj1.contadorStatic);
        System.out.println("obj2.contadorStatic: " + obj2.contadorStatic);

        System.out.println("obj1.contadorInstance: " + obj1.contadorInstance);
        System.out.println("obj2.contadorInstance: " + obj2.contadorInstance);
    }
}

/*
__________________________ NOTAS ____________________________

  • https://www.geeksforgeeks.org/static-methods-vs-instance-methods-in-java/
  • https://www.geeksforgeeks.org/access-modifiers-java/
_____________________________________________________________
*/
