package service;

import java.util.ArrayList;
import java.util.Scanner;

import entidad.Cliente;

public class ClienteService {
    Scanner read = new Scanner(System.in);

    private Cliente crearCliente(){
        System.out.println("Ingrese el nombre");
        String nombre = read.next();
        System.out.println("Ingrese el documento");
        int documento = read.nextInt();
        return new Cliente(nombre, documento);
    }

    public ArrayList<Cliente> listarCliente(){
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        int opcion;
        do{
            Cliente nuevo = crearCliente();
            listaClientes.add(nuevo);
            System.out.println("Desea ingresar mas clientes?");
            System.out.println("1.Si");
            System.out.println("2.No");
            opcion = read.nextInt();
        }while(opcion==1);
        return listaClientes;
    }

    public Cliente elegirCliente(ArrayList<Cliente> clientes) {
        boolean found = true;
        Cliente cliente = new Cliente();
        System.out.println("Indique el nombre del cliente");
        String nombre = read.next();
        while (found) {
            for (Cliente auxiliar : clientes) {
                if (auxiliar.getNombre().equalsIgnoreCase(nombre)) {
                    cliente = auxiliar;
                    found = false;
                    break;
                }
            }
            System.out.println("No se encontro el cliente, ingrese el nombre nuevamente");
            nombre = read.next();
        }
        return cliente;
    }

}
