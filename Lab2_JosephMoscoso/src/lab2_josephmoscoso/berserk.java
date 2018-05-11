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
    
    public berserk() {
    }

    public berserk(String grito, int hp, int ad, int eficacia, int velocidad, int critic, int suerte) {
        this.grito = grito;
        this.hp = hp;
        this.ad = ad;
        this.eficacia = eficacia;
        this.velocidad = velocidad;
        this.critic = critic;
        this.suerte = suerte;
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
