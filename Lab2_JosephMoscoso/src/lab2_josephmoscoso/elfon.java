package lab2_josephmoscoso;

/**
 *
 * @author Joseph
 */
public class elfon extends enemy {
    private int edad;
    private int estatura;
    private int peso;
    private int name;

    public elfon() {
        super();
    }

    public elfon(int edad, int estatura, int peso, int name, int hp, int ad, int eficacia, int velocidad, int critic) {
        super(hp, ad, eficacia, velocidad, critic);
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.name = name;
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
        return "elfon{" + "edad=" + edad + ", estatura=" + estatura + ", peso=" + peso + ", name=" + name + '}' + super.toString();
    }
    
}
