package tienda;

public class Main {
    public static void main(String[] args) {
        TiendaMascota tiendaMascota= new TiendaMascota();
        tiendaMascota.agregarMascota("luis", "caballo", 5);
        tiendaMascota.agregarMascota("Rafa", "perro", 3);
        tiendaMascota.agregarMascota("Max", "gato", 1);

        tiendaMascota.venderMascota("luis");
        tiendaMascota.mostrarInventario();
    }
}