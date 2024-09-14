public class Pago {
    private double valor;
    private String fechaPago;
    private Cliente cliente;
    private Asesor asesor;
    private String estado; // Pendiente, Procesado, Finalizado

    public Pago(double valor, String fechaPago, Cliente cliente, Asesor asesor, String estado) {
        this.valor = valor;
        this.fechaPago = fechaPago;
        this.cliente = cliente;
        this.asesor = asesor;
        this.estado = estado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Asesor getAsesor() {
        return asesor;
    }

    public void setAsesor(Asesor asesor) {
        this.asesor = asesor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
