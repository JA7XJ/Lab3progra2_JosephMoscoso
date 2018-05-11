package lab2_josephmoscoso;

/**
 *
 * @author Joseph
 */
public class berserk{
    private String grito;
    private int hp=190;
    private int ad=80;
    private int eficacia=80;
    private int velocidad;
    private int critic=30;
    private int suerte=15;
    private int edad;
    private String nombre;
    private int estatura;
    private int peso;
    private String color;
    private String peloc;
    
    public berserk() {
    }

    public berserk(String grito, int velocidad, int edad, String nombre, int estatura, int peso, String color, String peloc) {
        this.grito = grito;
        this.velocidad = velocidad;
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.color = color;
        this.peloc = peloc;
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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public int getEficacia() {
        return eficacia;
    }

    public void setEficacia(int eficacia) {
        this.eficacia = eficacia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCritic() {
        return critic;
    }

    public void setCritic(int critic) {
        this.critic = critic;
    }

    public int getSuerte() {
        return suerte;
    }

    public void setSuerte(int suerte) {
        this.suerte = suerte;
    }
    
}
