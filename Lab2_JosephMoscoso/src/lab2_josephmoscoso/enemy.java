package lab2_josephmoscoso;

/**
 *
 * @author Joseph
 */
public class enemy {
    private int hp;
    private int ad;
    private int eficacia;
    private int velocidad;
    private int critic;

    public enemy() {
    }

    public enemy(int hp, int ad, int eficacia, int velocidad, int critic) {
        this.hp = hp;
        this.ad = ad;
        this.eficacia = eficacia;
        this.velocidad = velocidad;
        this.critic = critic;
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

    @Override
    public String toString() {
        return "enemy{" + "hp=" + hp + ", ad=" + ad + ", eficacia=" + eficacia + ", velocidad=" + velocidad + ", critic=" + critic + '}';
    }
    
}
