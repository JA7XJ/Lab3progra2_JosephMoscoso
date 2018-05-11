package lab2_josephmoscoso;

/**
 *
 * @author Joseph
 */
public class articulos {
    private String nombre;
    private int bono;
    private String rareza;

    public articulos() {
    }

    public articulos(String nombre, int bono, String rareza) {
        this.nombre = nombre;
        this.bono = bono;
        this.rareza = rareza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }
    
}
