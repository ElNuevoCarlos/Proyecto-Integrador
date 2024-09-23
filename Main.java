import java.util.Scanner;

public class Main {
    public static Client register(Scanner scanner) {
        System.out.print("Introduce tu número de identificación: ");
        String id = scanner.nextLine();
        System.out.print("Introduce tu nombre completo: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce tu SISBEN: ");
        String sisben = scanner.nextLine();
        System.out.print("Introduce tu subsidio ministerio: ");
        String subsidioMinisterio = scanner.nextLine();
        System.out.print("Introduce tu dirección de residencia: ");
        String direccion = scanner.nextLine();
        System.out.print("Introduce tu número telefónico: ");
        String telefono = scanner.nextLine();
        System.out.print("Introduce tu correo electrónico: ");
        String correo = scanner.nextLine();

        Client nuevoCliente = new Client(id, nombre, sisben, subsidioMinisterio, direccion, telefono, correo);
        System.out.println("\n| Acabas de ser registrado con éxito |");
        nuevoCliente.mostrar();

        return nuevoCliente;
    }

    public static void login(Scanner scanner) {
        System.out.print("En construcción");
    }

    public static void main(String[] args) {
        System.out.println("Construcciones Urbanas C.A.S.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("| Elige una de las siguientes opciones |");
        System.out.println("- 1) Registrarme en el sistema");
        System.out.println("- 2) Logearme en el sistema");
        System.out.print("| Eliges: ");
        int selection = scanner.nextInt();
        scanner.nextLine();

        switch (selection) {
            case 1:
                Client client = register(scanner);
                break;
            case 2:
                login(scanner);
                break;
            default:
                System.out.println("Debe seleccionar una de las opciones disponibles.");
                break;
        }
    }
}
