
import java.util.Scanner;

public class Main {
    public static String id;
    public static String nombre;
    public static String sisben;
    public static String subsidio_ministerio;
    public static String direccion;
    public static String telefono;
    public static String correo;

    public static void main(String[] args) {
        System.out.print("Construcciones Urbanas C.A.S.");
        Scanner scanner = new Scanner(System.in);

        System.out.print("| Elige una de las siguientes opciones\n  1) Registrarme en el sistema\n| Eliges: ");
        int selection = scanner.nextInt();

        if (selection > 1 || selection < 1) {
            System.out.print("Debe seleccionar una de las opciones disponibles");
        } else {
            System.out.print("Introduce tu numero de identificación: ");
            id = scanner.nextLine();

            System.out.print("Introduce tu nombre completo: ");
            nombre = scanner.nextLine();

            System.out.print("Introduce tu sisben: ");
            sisben = scanner.nextLine();

            System.out.print("Introduce tu subsidio ministerio: ");
            subsidio_ministerio = scanner.nextLine();

            System.out.print("Introduce tu dirección de residencia: ");
            direccion = scanner.nextLine();

            System.out.print("Introduce tu numero telefonico: ");
            telefono = scanner.nextLine();

            System.out.print("Introduce tu correo electronico: ");
            correo = scanner.nextLine();

            System.out.println("\n| Acabas de ser registrado con éxito |");
            System.out.println("\nInformación recolectada y guardada");
        }
    }
}
