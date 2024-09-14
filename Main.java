public class Main {
    public static void main(String[] args) {
        SistemaGestion sistema = new SistemaGestion();

        // Registro de clientes
        Cliente cliente1 = new Cliente("12345678", "Carlos Perez", "Nivel 2", "No", "Calle 1", "123456789", "carlos@gmail.com", "Compra");
        sistema.registrarCliente(cliente1);

        // Registro de asesores
        Asesor asesor1 = new Asesor("87654321", "Juan Lopez", "Calle 2", "987654321", "juan@gmail.com");
        sistema.registrarAsesor(asesor1);

        // Registro de proyectos
        Proyecto proyecto1 = new Proyecto("Proyecto A", 2, "Construcción");
        sistema.registrarProyecto(proyecto1);

        // Registro de una venta
        Venta venta1 = new Venta(50000.0, 12, 0.05, cliente1, "01/09/2024", "Pendiente");
        sistema.registrarVenta(venta1);

        // Registro de un pago
        Pago pago1 = new Pago(10000.0, "02/09/2024", cliente1, asesor1, "Pendiente");
        sistema.registrarPago(pago1);

        // Ver los datos registrados
        System.out.println("Proyectos: " + sistema.obtenerProyectos().size());
        System.out.println("Clientes: " + sistema.obtenerClientes().size());
        System.out.println("Asesores: " + sistema.obtenerAsesores().size());
        System.out.println("Ventas: " + sistema.obtenerVentas().size());
        System.out.println("Pagos: " + sistema.obtenerPagos().size());
    }
}
