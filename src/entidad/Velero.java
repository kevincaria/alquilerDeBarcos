package entidad;
// • Número de mástiles para veleros.
public final class Velero extends Barco{
    private int numMastiles;

    public Velero() {
    }

    public Velero(int matricula, int eslora, int fabricación, int numMastiles, boolean disponible) {
        super(matricula, eslora, fabricación, disponible);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public String toString() {
        return super.toString()+"[numMastiles=" + numMastiles + "]";
    }
    
}
