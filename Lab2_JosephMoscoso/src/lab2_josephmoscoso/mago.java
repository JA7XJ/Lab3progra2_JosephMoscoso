package lab2_josephmoscoso;

/**
 *
 * @author Joseph
 */
public class mago extends psja{
    private String grito;
    private int ap=50;
    /*private int hp=120;
    private int ad=20;
    private int eficacia=70;
    private int velocidad=10;
    private int critic=2;
    private int suerte=20;*/
    private int edad;
    private String nombre;
    private int estatura;
    private int peso;
    private String color;
    private String peloc;
    
    public mago() {
        super();
    }

    public mago(String grito, int edad, String nombre, int estatura, int peso, String color, String peloc, int hp, int ad, int eficacia, int velocidad, int critic, int suerte) {
        super(hp, ad, eficacia, velocidad, critic, suerte);
        this.grito = grito;
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.color = color;
        this.peloc = peloc;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }
    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPeloc() {
        return peloc;
    }

    public void setPeloc(String peloc) {
        this.peloc = peloc;
    }
    
    public String getGrito() {
        return grito;
    }
    
    public void setGrito(String grito) {
        this.grito = grito;
    }

    @Override
    public String toString() {
        return "mago{" + "grito=" + grito + ", ap=" + ap + ", edad=" + edad + ", nombre=" + nombre + ", estatura=" + estatura + ", peso=" + peso + ", color=" + color + ", peloc=" + peloc + '}'+ super.toString();
    }
    
}
