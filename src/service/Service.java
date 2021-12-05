package service;

import java.util.ArrayList;
import java.util.Scanner;

import entidad.Barco;
import entidad.Cliente;

public class Service {
    Scanner read = new Scanner(System.in);
    ClienteService cs = new ClienteService();
    BarcoService bs = new BarcoService();
    AlquilerService as = new AlquilerService();

    public void menu(){
        
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Barco> barcos = new ArrayList<Barco>();
        int op;
        int op2 = 0;
        double alquiler = 0;

        do {
            System.out.println("MENU");
            System.out.println("1.Crear Clientes");
            System.out.println("2.Crear Barcos");
            System.out.println("3.Mostrar lista de clientes");
            System.out.println("4.Mostrar lista de Barcos");
            System.out.println("5.Alquilar");
            System.out.println("6.Salir");
            System.out.println("Ingrese una opcion: ");

            op = read.nextInt();
            while (op < 0 || op > 6) {
                System.out.println("Opcion incorrecta, elija la opcion 1 y 6");
                op = read.nextInt();
            }

            switch (op) {
                case 1:
                    clientes = cs.listarCliente();
                    System.out.println("Clientes agregados!");
                    break;
                case 2:
                    barcos = bs.listarBarcos();
                    System.out.println("Barcos agregados!");
                    break;
                case 3:
                    System.out.println("Lista de clientes");
                    for (Cliente cliente : clientes) {
                        System.out.println(cliente.toString());
                    }
                    break;
                case 4:
                     System.out.println("Lista de barcos");
                     for (Barco barco : barcos) {
                         System.out.println(barco.toString());
                    }
                    break;
                case 5:
                    alquiler = as.calcularPrecio(clientes,barcos);
                    System.out.println("El precio del alquiler es de $"+alquiler);
                    break;
                case 6:
                    System.out.println("Esta seguro que desea salir?");
                    System.out.println("1.Si");
                    System.out.println("2.No");
                    op2 = read.nextInt();
                    while (op2 != 1 && op2 != 2) {
                        System.out.println("Ingrese una opcion correcta");
                        op2 = read.nextInt();
                    }
            }
        } while (op2 != 1);
    }
 }

