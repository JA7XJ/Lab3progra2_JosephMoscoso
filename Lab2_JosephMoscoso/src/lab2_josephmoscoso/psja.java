package lab2_josephmoscoso;

/**
 *
 * @author Joseph
 */
public class psja {
    private int hp;
    private int ad;
    private int eficacia;
    private int velocidad;
    private int critic;
    private int suerte;

    public psja() {
    }

    public psja(int hp, int ad, int eficacia, int velocidad, int critic, int suerte) {
        this.hp = hp;
        this.ad = ad;
        this.eficacia = eficacia;
        this.velocidad = velocidad;
        this.critic = critic;
        this.suerte = suerte;
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

    @Override
    public String toString() {
        return "psja{" + "hp=" + hp + ", ad=" + ad + ", eficacia=" + eficacia + ", velocidad=" + velocidad + ", critic=" + critic + ", suerte=" + suerte + '}';
    }
    
}
