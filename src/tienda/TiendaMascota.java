package tienda;

import java.util.Arrays;

public class TiendaMascota {
    Mascota[] inventario;
    int numeroMascotas;
    public TiendaMascota(){
        this.inventario= new Mascota[100];
        this.numeroMascotas=0;
    }
    public TiendaMascota(int numeroMascotas){
        this.numeroMascotas=numeroMascotas;
    }
    public  void agregarMascota(String nombre, String animal, int edad){
        Mascota mascota = new Mascota(nombre,animal,edad );
        inventario[numeroMascotas]=mascota;
        numeroMascotas++;
        System.out.println(" La mascota "+ nombre+" se ha añadido");
    }
    public void venderMascota(String nombre){
        for (int i = 0; i < numeroMascotas;i++) {
            if (inventario[i].getNombre().equals(nombre)){
                System.out.println(" La mascota "+inventario[i].getNombre());
                inventario[i] = null;
                for (int j = 0; j < numeroMascotas-1; j++){
                    inventario[j]=inventario[j+1];
                }
                numeroMascotas--;
                return;
            }
        }
        System.out.println(" La mascota "+ nombre+ " no esta disponible");
    }
    public  void mostrarInventario(){
        System.out.println(" El inventario de la tienda;");
        for (int i = 0; i < numeroMascotas;i++) {
            System.out.println("nombre: " +inventario[i].getNombre());
        }
    }
}