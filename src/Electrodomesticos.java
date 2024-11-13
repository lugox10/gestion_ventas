import intefaces.TipoDePago;

import java.util.List;

public class Electrodomesticos extends Productos {

    String voltaje;

    public Electrodomesticos(String nombre, double precio, int cantidadEnInventario, SistemeDePago pagar, String voltaje) {
        super(nombre, precio, cantidadEnInventario, pagar);
        this.voltaje = voltaje;
    }

    public void descuentoPorMarca() {
        String nombreMarca = getNombre();

        if (nombreMarca.equals("Samsung")) {
            System.out.println("El descuento es de 10%");
        } else if (nombreMarca.equals("Apple")) {
            System.out.println("El descuento es de 15%");
        } else if (nombreMarca.equals("Huawei")) {
            System.out.println("El descuento es de 20%");
        } else if (nombreMarca.equals("LG")) {
            System.out.println("El descuento es de 5%");
        } else {
            System.out.println("No hay descuento");
        }
    }

    @Override
    public String informacionProducto() {
        descuentoPorMarca();
        calcularPrecioVenta();
        pagar();
        return super.informacionProducto();

    }

    @Override
    public void calcularPrecioVenta() {
        double precioVenta = getPrecio() * getCantidadEnInventario();
        System.out.println("El precio de venta de " + getNombre() + " es: " + precioVenta + " " + SistemeDePago.TARJETA_DE_CREDITO);
    }


    @Override
    public void pagar() {
        tarjetaCredito();
    }
}