package entidad;
// • Potencia en CV para barcos a motor.
public class Amotor extends Barco {
    protected int potencia;

    public Amotor() {
    }

    public Amotor(int matricula, int eslora, int fabricación, int potencia, boolean disponible) {
        super(matricula, eslora, fabricación, disponible);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return super.toString() + "potencia=" + potencia + "]";
    }

    
}
