package tienda;

public class Mascota {
    private String nombre;
    String animal;
    int edad;
    public Mascota(String nombre, String animal, int edad){
        this.nombre=nombre;
        this.animal=animal;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }
}
