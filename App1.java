public class App1 {

    public static void mostrarAsteriscos(int caracter) {
        for (int i = 0; i < caracter; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Funcion para mostrar guiones
    public static void mostrarGuiones(int caracter2) {
        for (int i = 0; i< caracter2; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    // Funcion para mostrar numeros
    public static void mostrarNumeros(int num, int repeticiones) {
        for (int i = 0; i < repeticiones; i++) {
            System.out.print(num);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        mostrarAsteriscos(7);
        mostrarGuiones(1);
        mostrarNumeros(5, 6);
    }
}
