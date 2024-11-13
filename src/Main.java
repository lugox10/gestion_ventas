public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Productos productos = new Electrodomesticos("Samsung",100,10,SistemeDePago.TARJETA_DE_CREDITO,"110 VOLTIOS");
        productos.informacionProducto();
        System.out.println("------------------------------------------------------------------------------------------");
        Productos libros = new Libros("harrypoter",20,2,SistemeDePago.TRANSFERENCIA,"desconocido");
        libros.informacionProducto();
    }
}