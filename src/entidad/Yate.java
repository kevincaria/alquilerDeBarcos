package entidad;
// • Potencia en CV y número de camarotes para yates de lujo.
public final class Yate extends Amotor {
    private int numCamarotes;

    public Yate() {
    }

    public Yate(int matricula, int eslora, int fabricación, int potencia, int numCamarotes, boolean disponible) {
        super(matricula, eslora, fabricación, potencia, disponible);
        this.numCamarotes = numCamarotes;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        return super.toString()+"numCamarotes=" + numCamarotes + "]";
    }

    
}
