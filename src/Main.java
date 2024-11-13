import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> historialDeCompras = new ArrayList<>();



        System.out.println("compra - Electrodoméstico");
        Productos productos = new Electrodomesticos("Samsung", 100, 10, SistemeDePago.TARJETA_DE_CREDITO, "110 VOLTIOS");
        String salidaProducto = productos.informacionProducto();
        historialDeCompras.add(salidaProducto);  // Guardamos la salida en la lista

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println(" compra - Libro");
        Productos libros = new Libros("harrypoter", 20, 2, SistemeDePago.TRANSFERENCIA, "desconocido");
        salidaProducto = libros.informacionProducto();
        historialDeCompras.add(salidaProducto);

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("compra - Ropa");
        Productos ropa = new Ropa("camisa", 10, 100, SistemeDePago.PAGO_CONTRA_REEMBOLSO, "large");
        salidaProducto = ropa.informacionProducto();
        historialDeCompras.add(salidaProducto);

        System.out.println("");
        System.out.println("========== HISTORIAL DE COMPRAS ==========");
        for (String compra : historialDeCompras) {
            System.out.println(compra);
        }
    }
}
