package service;

import java.util.ArrayList;
import java.util.Scanner;

import entidad.Amotor;
import entidad.Barco;
import entidad.Velero;
import entidad.Yate;

public class BarcoService {
    Scanner read = new Scanner(System.in);
    AmotorService ams = new AmotorService();
    VeleroService vs = new VeleroService();
    YateService ys = new YateService();
    
    public Barco crearBarco() {
        System.out.println("Ingrese el numero de matricula");
        int matricula = read.nextInt();
        System.out.println("Ingrese el numero de eslora");
        int eslora = read.nextInt();
        System.out.println("Ingrese el numero del año de fabricacion");
        int fabricacion = read.nextInt();
        return new Barco(matricula, eslora, fabricacion, true);
    }

    public ArrayList<Barco> listarBarcos() {
        ArrayList<Barco> listaBarcos = new ArrayList<Barco>();
        int opcion,opcion2;
        do {
            System.out.println("Ingrese que barco desea alquilar");
            System.out.println("1.Velero");
            System.out.println("2. Barco a motor");
            System.out.println("3.Yate");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    Velero velero = vs.crearVelero();
                    listaBarcos.add(velero);
                    break;
                case 2:
                    Amotor amotor = ams.crearBarcoAMotor();
                    listaBarcos.add(amotor);
                    break;
                case 3:
                    Yate yate = ys.crearYate();
                    listaBarcos.add(yate);
                    break;
            }
            System.out.println("Desea ingresar mas barcos?");
            System.out.println("1.Si");
            System.out.println("2.No");
            opcion2 = read.nextInt();
        } while (opcion2 == 1);
        return listaBarcos;

    }

    public Barco elegirBarco( ArrayList<Barco> listaBarcos) {
        boolean elegirBarco = true;
        Barco elegido = new Barco();
        System.out.println("Indique la matricula del barco");
        int matricula = read.nextInt();
        while (elegirBarco) {
            for (Barco auxiliar : listaBarcos) {
                if (auxiliar.getMatricula() == matricula) {
                    elegido = auxiliar;
                    elegirBarco = false;
                    break;
                }
            }
            System.out.println("No se encontro el barco, ingrese la matricula nuevamente");
            matricula = read.nextInt();
        }
        return elegido;
    }

}
