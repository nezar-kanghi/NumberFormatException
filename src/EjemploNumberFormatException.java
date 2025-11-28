import java.util.Scanner;

public class EjemploNumberFormatException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        String entrada = sc.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Has introducido el número: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: No has introducido un valor numérico válido.");
        }

        sc.close();
    }
}
