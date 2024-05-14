package ejer4;
public class Main {
    public static void main(String[] args) {
        Almacen<Producto> almacen = new Almacen<>();

        Producto producto1 = new Producto("Salsa", 10.5);
        Producto producto2 = new Producto("Prepizza", 20.0);
        Producto producto3 = new Producto("Queso", 15.75);

        almacen.añadirElemento(producto1);
        almacen.añadirElemento(producto2);
        almacen.añadirElemento(producto3);

        almacen.imprimirElementos();
    }
}