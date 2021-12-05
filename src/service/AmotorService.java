package service;

import java.util.Scanner;

import entidad.Amotor;
import entidad.Barco;

public class AmotorService {
    BarcoService bs = new BarcoService();
    Scanner read = new Scanner(System.in);
    public Amotor crearBarcoAMotor(){
        Barco nuevo = bs.crearBarco();
        int matricula = nuevo.getMatricula();
        int eslora = nuevo.getEslora();
        int fabricacion = nuevo.getFabricación();
        boolean disponible = nuevo.isDisponible();
        System.out.println("Ingrese la potencia del motor");
        int potencia = read.nextInt();
        return new Amotor(potencia, matricula, eslora, fabricacion, disponible);
    }
}
