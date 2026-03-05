import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("******************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Salir");
            System.out.print("Elija una opción válida: ");
            
            opcion = lectura.nextInt();

            if (opcion == 7) break;

            // Aquí llamaremos a la lógica que vamos a crear en el siguiente paso
            System.out.println("Procesando tu conversión...");
        }
        System.out.println("Finalizando el programa. ¡Gracias por usarlo!");
    }
}
