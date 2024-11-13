public class Libros extends Productos {

    String Autor;

    public Libros(String nombre, double precio, int cantidadEnInventario, SistemeDePago pagar, String autor) {
        super(nombre, precio, cantidadEnInventario, pagar);
        Autor = autor;
    }

    @Override
    public void descuentoEspecial() {
        System.out.println("tienes un descuento especial si el pago es con"+SistemeDePago.TRANSFERENCIA);
    }

    @Override
    public void informacionProducto() {

        pagar();
        super.informacionProducto();
        descuentoEspecial();
        calcularPrecioVenta();

    }

    @Override
    public void calcularPrecioVenta() {
        double precioVenta = getPrecio() / getCantidadEnInventario();
        System.out.println("El precio de venta de " + getNombre() + " es: " + precioVenta + " con " + SistemeDePago.TRANSFERENCIA );
    }


}
