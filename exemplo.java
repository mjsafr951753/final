public class OperacionesCortas {

    public static void main(String[] args) {
        int a = 10, b = 5;

        // Llamada a los dos métodos adicionales
        System.out.println("Suma: " + sumar(a, b));
        System.out.println("Resta: " + restar(a, b));
    }

    // Método 1: Suma dos números
    public static int sumar(int x, int y) {
        return x + y;
    }

    // Método 2: Resta dos números
    public static int restar(int x, int y) {
        return x - y;
    }
}
