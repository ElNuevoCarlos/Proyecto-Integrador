public class Venta {
    private double precioTotalVenta;
    private int numeroCuotas;
    private double interesesAplicados;
    private Cliente cliente;
    private String fecha;
    private String estado; // Pendiente, Procesada, Finalizada

    public Venta(double precioTotalVenta, int numeroCuotas, double interesesAplicados, Cliente cliente, String fecha, String estado) {
        this.precioTotalVenta = precioTotalVenta;
        this.numeroCuotas = numeroCuotas;
        this.interesesAplicados = interesesAplicados;
        this.cliente = cliente;
        this.fecha = fecha;
        this.estado = estado;
    }

    public double getPrecioTotalVenta() {
        return precioTotalVenta;
    }

    public void setPrecioTotalVenta(double precioTotalVenta) {
        this.precioTotalVenta = precioTotalVenta;
    }

    public int getNumeroCuotas() {
        return numeroCuotas;
    }

    public void setNumeroCuotas(int numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
    }

    public double getInteresesAplicados() {
        return interesesAplicados;
    }

    public void setInteresesAplicados(double interesesAplicados) {
        this.interesesAplicados = interesesAplicados;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
