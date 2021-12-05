package entidad;
// Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
// fabricación.
public class Barco {
    protected int matricula;
    protected int eslora;
    protected int fabricación;
    protected boolean disponible;
    
    public Barco() {
    }

    public Barco(int matricula, int eslora, int fabricación, boolean disponible) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricación = fabricación;
        this.disponible = disponible;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getFabricación() {
        return fabricación;
    }

    public void setFabricación(int fabricación) {
        this.fabricación = fabricación;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Barco [eslora=" + eslora + ", fabricación=" + fabricación + ", matricula=" + matricula + "]";
    }

    
    
}
