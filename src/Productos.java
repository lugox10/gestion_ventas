import intefaces.CarritoDeCompras;
import intefaces.CategoriaProductos;
import intefaces.MetodoDePago;
import intefaces.TipoDePago;


public  class Productos implements CategoriaProductos, MetodoDePago, CarritoDeCompras {

    private String nombre;
    private double precio;
    private int cantidadEnInventario;
    private SistemeDePago pagar;

    public Productos(String nombre, double precio, int cantidadEnInventario, SistemeDePago pagar) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnInventario = cantidadEnInventario;
        this.pagar = pagar;
    }



    @Override
    public void descuentoEspecial() {

    }


    public String informacionProducto(){

        return "Nombre: " + nombre + ", Precio: " + precio + ", Cantidad en inventario: " + cantidadEnInventario;
    }


    public void calcularPrecioVenta(){
        System.out.println("El precio de venta es: ");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnInventario() {
        return cantidadEnInventario;
    }

    public void setCantidadEnInventario(int cantidadEnInventario) {
        this.cantidadEnInventario = cantidadEnInventario;
    }


    @Override
    public void tarjetaCredito() {
        System.out.println("pago con tarjeta de credito");
    }

    @Override
    public void pagoContraReembolso() {
        System.out.println("pago contra entrega");
    }

    @Override
    public void pagoTransferencia() {
        System.out.println("pagar por transfeencia");
    }


    @Override
    public void pagar() {

    }
}
