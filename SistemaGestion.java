import java.util.ArrayList;
import java.util.List;

public class SistemaGestion {

    private List<Proyecto> proyectos;
    private List<Cliente> clientes;
    private List<Asesor> asesores;
    private List<Venta> ventas;
    private List<Pago> pagos;

    public SistemaGestion() {
        this.proyectos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.asesores = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.pagos = new ArrayList<>();
    }

    // Métodos para gestionar proyectos
    public void registrarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
        System.out.println("Proyecto registrado: " + proyecto.getNombre());
    }

    public List<Proyecto> obtenerProyectos() {
        return proyectos;
    }

    // Métodos para gestionar clientes
    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente registrado: " + cliente.getNombre());
    }

    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    // Métodos para gestionar asesores
    public void registrarAsesor(Asesor asesor) {
        asesores.add(asesor);
        System.out.println("Asesor registrado: " + asesor.getNombre());
    }

    public List<Asesor> obtenerAsesores() {
        return asesores;
    }

    // Métodos para gestionar ventas
    public void registrarVenta(Venta venta) {
        ventas.add(venta);
        System.out.println("Venta registrada. Cliente: " + venta.getCliente().getNombre() + ", Precio: " + venta.getPrecioTotalVenta());
    }

    public List<Venta> obtenerVentas() {
        return ventas;
    }

    // Métodos para gestionar pagos
    public void registrarPago(Pago pago) {
        pagos.add(pago);
        System.out.println("Pago registrado. Cliente: " + pago.getCliente().getNombre() + ", Valor: " + pago.getValor());
    }

    public List<Pago> obtenerPagos() {
        return pagos;
    }

    // Buscar proyectos por nombre
    public Proyecto buscarProyectoPorNombre(String nombre) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getNombre().equalsIgnoreCase(nombre)) {
                return proyecto;
            }
        }
        System.out.println("Proyecto no encontrado");
        return null;
    }

    // Buscar cliente por cédula
    public Cliente buscarClientePorCedula(String cedula) {
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                return cliente;
            }
        }
        System.out.println("Cliente no encontrado");
        return null;
    }

    // Buscar asesor por cédula
    public Asesor buscarAsesorPorCedula(String cedula) {
        for (Asesor asesor : asesores) {
            if (asesor.getCedula().equals(cedula)) {
                return asesor;
            }
        }
        System.out.println("Asesor no encontrado");
        return null;
    }
}
