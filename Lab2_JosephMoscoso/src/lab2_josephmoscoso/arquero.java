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

    public arquero() {
    }
    
    public arquero(int hp, int ad, int eficacia, int velocidad, int critic, int suerte, String grito) {
        this.hp = hp;
        this.ad = ad;
        this.eficacia = eficacia;
        this.velocidad = velocidad;
        this.critic = critic;
        this.suerte = suerte;
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

    public String getGrito() {
        return grito;
    }

    public void setGrito(String grito) {
        this.grito = grito;
    }
    
}
