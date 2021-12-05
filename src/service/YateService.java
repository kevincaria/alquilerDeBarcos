package service;

import java.util.Scanner;

import entidad.Amotor;
import entidad.Yate;

public class YateService {
    AmotorService ams = new AmotorService();
    Scanner read = new Scanner(System.in);
    
    public Yate crearYate(){
        Amotor nuevo = ams.crearBarcoAMotor();
        int matricula = nuevo.getMatricula();
        int eslora = nuevo.getEslora();
        int fabricacion = nuevo.getFabricación();
        int potencia = nuevo.getPotencia();
        boolean disponible = nuevo.isDisponible();
        System.out.println("Ingrese el numero de camarotes");
        int camarotes = read.nextInt();
        return new Yate(camarotes, matricula, eslora, fabricacion, potencia, disponible);
    }
}
