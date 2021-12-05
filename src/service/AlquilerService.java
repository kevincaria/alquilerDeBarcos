package service;
// En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler

// se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de
// devolución, la posición del amarre y el barco que lo ocupará.

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

import entidad.Alquiler;
import entidad.Amotor;
import entidad.Barco;
import entidad.Cliente;
import entidad.Velero;
import entidad.Yate;


public class AlquilerService {
    Scanner read = new Scanner(System.in);
    ClienteService cs = new ClienteService();
    BarcoService bs = new BarcoService();

    public Alquiler crearAlquiler(ArrayList<Cliente> clientes, ArrayList<Barco> barcos) {
        Cliente cliente = cs.elegirCliente(clientes);
        LocalDate fechaAlquiler = decidirFechasAlquiler();
        LocalDate fechaDevolucion = decidirFechaDevolucion();
        Barco barco = bs.elegirBarco(barcos);
        System.out.println("Ingrese la posicion de amarre");
        int posicion = read.nextInt();
        return new Alquiler(cliente, fechaAlquiler, fechaDevolucion,posicion, barco);
    }

    public LocalDate decidirFechasAlquiler() {
        System.out.println("-----Para el alquiler-----");
        System.out.println("Indique el dia: ");
        int diaA = read.nextInt();
        System.out.println("Indique el mes (en número): ");
        int mesA = read.nextInt();
        System.out.println("Indique el año: ");
        int anioA = read.nextInt();
        LocalDate vFechaAlquiler = LocalDate.of(anioA, mesA, diaA);
        return vFechaAlquiler;
    }

    public LocalDate decidirFechaDevolucion() {
        System.out.println("-----Para la devolución-----");
        System.out.println("Indique el dia: ");
        int diaD = read.nextInt();
        System.out.println("Indique el mes (en número): ");
        int mesD = read.nextInt();
        System.out.println("Indique el año: ");
        int anioD = read.nextInt();
        LocalDate vFechaDevo = LocalDate.of(anioD, mesD, diaD);
        return vFechaDevo;
    }

// Un alquiler se calcula multiplicando el número de días de ocupación (calculado
// con la fecha de alquiler y devolución), por un valor módulo de cada barco
// (obtenido simplemente multiplicando por 10 los metros de eslora).
    public double calcularPrecio(ArrayList<Cliente> clientes, ArrayList<Barco> barcos){
        Alquiler nuevo = crearAlquiler(clientes, barcos);
        Long cantDias = diferenciaDeDias(nuevo);
        double modulo = nuevo.getBarco().getEslora()* 10;
        System.out.println("La El valor modulo del barco es: " + modulo);
        double costoAlquiler = cantDias * modulo;

////        En los barcos de tipo especial el módulo de cada barco, se calcula sacando el
////        modulo normal y sumándole el atributo particular de cada barco.
        if (nuevo.getBarco() instanceof Yate) {

            costoAlquiler += ((Yate) nuevo.getBarco()).getNumCamarotes();
            System.out.println("El costo del Yate = " + costoAlquiler);
            
        } else if (nuevo.getBarco() instanceof Amotor) {

            costoAlquiler += ((Amotor)nuevo.getBarco()).getPotencia();
            System.out.println("El costo del BarcoMotor = " + costoAlquiler);
              
        } else if (nuevo.getBarco()  instanceof Velero) {

            costoAlquiler += ((Velero) nuevo.getBarco()).getNumMastiles();
            System.out.println("El costo del velero  = " + costoAlquiler);
        } else {
            System.out.println("Costo Alquiler del Barco: " + costoAlquiler);
        }
        return costoAlquiler;
    }

    public long diferenciaDeDias(Alquiler alquiler) {
        long numeroDeDias = ChronoUnit.DAYS.between(alquiler.getFechaAlquiler(), alquiler.getFechaDevolución());
        return numeroDeDias;
    }

    

}
