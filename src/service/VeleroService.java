package service;

import java.util.Scanner;

import entidad.Barco;
import entidad.Velero;

public class VeleroService {
    BarcoService bs = new BarcoService();
    Scanner read = new Scanner(System.in);

    public Velero crearVelero(){
        Barco nuevo = bs.crearBarco();
        int matricula = nuevo.getMatricula();
        int eslora = nuevo.getEslora();
        int fabricacion = nuevo.getFabricación();
        boolean disponible = nuevo.isDisponible();
        System.out.println("Ingrese el numero de mastiles");
        int mastiles = read.nextInt();
        return new Velero(mastiles, matricula, eslora, fabricacion, disponible);
    }
}
