

public class Ropa extends Productos {

   private  String tamaño;

    public Ropa(String nombre, double precio, int cantidadEnInventario, SistemeDePago pagar, String tamaño) {
        super(nombre, precio, cantidadEnInventario, pagar);
        this.tamaño = tamaño;
    }

    @Override
    public void descuentoEspecial() {
        System.out.println("tienes un descuento especial si el pago es con"+SistemeDePago.PAGO_CONTRA_REEMBOLSO);
    }

    @Override
    public String informacionProducto() {
        calcularPrecioVenta();
        pagar();
        descuentoEspecial();
        return super.informacionProducto();
    }

    @Override
    public void calcularPrecioVenta() {
        double precioVenta = getPrecio() / getCantidadEnInventario();
        System.out.println("El precio de venta de la  " + getNombre() + " es: " + precioVenta + " con descuento " + SistemeDePago.PAGO_CONTRA_REEMBOLSO );
    }

}
