package lab2_josephmoscoso;

/**
 *
 * @author Joseph
 */
public class arquero {
    private int hp=150;
    private int ad=50;
    private int eficacia=85;
    private int velocidad=15;
    private int critic=60;
    private int suerte=20;
    private String grito;
    private int edad;
    private String nombre;
    private int estatura;
    private int peso;
    private String color;
    private String peloc;
    public arquero() {
    }

    public arquero(String grito, int edad, String nombre, int estatura, int peso, String color, String peloc) {
        this.grito = grito;
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

    public String getGrito() {
        return grito;
    }

    public void setGrito(String grito) {
        this.grito = grito;
    }
    
}
