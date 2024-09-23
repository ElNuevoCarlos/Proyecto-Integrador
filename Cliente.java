class Client {
    public String id;
    public String nombre;
    public String sisben;
    public String subsidioMinisterio;
    public String direccion;
    public String telefono;
    public String correo;

    public Client(String id, String nombre, String sisben, String subsidioMinisterio, String direccion, String telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.sisben = sisben;
        this.subsidioMinisterio = subsidioMinisterio;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public void mostrar() {
        System.out.println("\nInformación del cliente registrado:");
        System.out.println("Identificación: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("SISBEN: " + sisben);
        System.out.println("Subsidio Ministerio: " + subsidioMinisterio);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo: " + correo);
    }
}