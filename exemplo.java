/**
 * Clase que realiza operaciones aritméticas básicas de forma compacta.
 */
public class OperacionesCortas {

    /**
     * Método principal que arranca la ejecución del programa.
     * @param args Argumentos de la línea de comandos (no utilizados aquí).
     */
    public static void main(String[] args) {
        // Definición e inicialización de las variables numéricas
        // int a valdra 10 y b valdra 5
        int a = 10, b = 5;

        // Imprime en consola el resultado de invocar al método 'sumar'
        System.out.println("Suma: " + sumar(a, b));

        // Imprime en consola el resultado de invocar al método 'restar'
        System.out.println("Resta: " + restar(a, b));
    }

    /**
     * Recibe dos números enteros y calcula su suma.
     * @param x Primer número entero.
     * @param y Segundo número entero.
     * @return El resultado de sumar x más y.
     */
    public static int sumar(int x, int y) {
        return x + y; // Devuelve la suma directa
    }

    /**
     * Recibe dos números enteros y calcula su diferencia.
     * @param x Número del que se va a restar 
     * @param y Cantidad que se va a restar 
     * @return El resultado de restar y a x.
     */
    public static int restar(int x, int y) {
        return x - y; // Devuelve la resta directa
    }
}
