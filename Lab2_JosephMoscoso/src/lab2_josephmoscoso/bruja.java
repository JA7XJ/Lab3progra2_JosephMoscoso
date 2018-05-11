package lab2_josephmoscoso;

/**
 *
 * @author Joseph
 */
public class bruja extends enemy {
    private int ap;
    private int edad;
    private int estatura;
    private int peso;
    private int name;

    public bruja() {
        super();
    }

    public bruja(int ap, int edad, int estatura, int peso, int name, int hp, int ad, int eficacia, int velocidad, int critic) {
        super(hp, ad, eficacia, velocidad, critic);
        this.ap = ap;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.name = name;
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

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "bruja{" + "ap=" + ap + ", edad=" + edad + ", estatura=" + estatura + ", peso=" + peso + ", name=" + name + '}'+ super.toString();
    }
    
}
