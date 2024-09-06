/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logico_Cliente;

import Helpers.HelperImpresion;
import Helpers.HelperValidacion;
import Logica_Negocio.Computador;
import Logica_Negocio.Persona;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 1059237155
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String marca, serial, tamaño, color;
        String nombre, cedula, apellido, direccion;
        int opc = 0, num_pcs = 0;
        Scanner scan = new Scanner(System.in);
        int rta, conteo;

        ArrayList<Computador> listacompusglobal = null;
        Computador compu;
        Persona objPersona;
        ArrayList<Persona> listapersona = new ArrayList<>();

        do {
            System.out.println("1. Registrar Persona");
            System.out.println("2. Mostrar Persona");
            System.out.println("3. Salir");

            do {
                try {

                    System.out.println("Digite una opcion valida");
                    opc = scan.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("Error");
                }
                scan.nextLine();
            } while (opc <= 0);

            switch (opc) {
                case 1:
                    ArrayList<Computador> listacompuslocal = new ArrayList<>();
                    do {
                        try {

                            System.out.println("Digite el numero de pcs");
                            num_pcs = scan.nextInt();

                        } catch (InputMismatchException e) {
                            System.out.println("Error");
                        }
                        scan.nextLine();

                    } while (num_pcs <= 0);

                    for (int i = 0; i < num_pcs; i++) {

                        System.out.println("Digite la marca del computador");
                        marca = scan.nextLine();

                        rta = HelperValidacion.ValidarVacio(marca);

                        while (rta > 0) {
                            System.out.println("Digite la marca del computador");
                            marca = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(marca);
                        }

                        conteo = HelperValidacion.ValidarTodo(marca);

                        while (conteo != 0) {
                            System.out.println("Digite la marca de la persona");
                            marca = scan.nextLine();
                            conteo = HelperValidacion.ValidarTodo(marca);

                        }
                        //termina marca
                       
                        System.out.println("Digite el serial del computador");
                        serial = scan.nextLine();
                       
                        rta = HelperValidacion.ValidarVacio(serial);

                        while (rta > 0) {
                            System.out.println("Digite el serial  del computador");
                            serial = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(serial);
                        }

                        conteo = HelperValidacion.ValidarTodoSerial(serial);

                        while (conteo != 0) {
                            System.out.println("Digite el serial de la persona");
                            serial = scan.nextLine();
                            conteo = HelperValidacion.ValidarTodoSerial(serial);

                        }
                        //termina serial
                       
                        System.out.println("Digite el tamaño del computador");
                        tamaño = scan.nextLine();
                       
                        rta = HelperValidacion.ValidarVacio(tamaño);

                        while (rta > 0) {
                            System.out.println("Digite el tamaño  del computador");
                            tamaño = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(tamaño);
                        }

                        conteo = HelperValidacion.ValidarTodo(tamaño);

                        while (conteo != 0) {
                            System.out.println("Digite el tamaño de la persona");
                            tamaño = scan.nextLine();
                            conteo = HelperValidacion.ValidarTodo(tamaño);

                        }
                        //termina tamaño
                        System.out.println("Digite la color del computador");
                        color = scan.nextLine();
                     
                         rta = HelperValidacion.ValidarVacio(color);

                        while (rta > 0) {
                            System.out.println("Digite el tamaño  del computador");
                            color = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(color);
                        }

                        conteo = HelperValidacion.ValidarTodo(color);

                        while (conteo != 0) {
                            System.out.println("Digite el tamaño de la persona");
                            color = scan.nextLine();
                            conteo = HelperValidacion.ValidarTodo(color);

                        }
                       
                       
                       
                        compu = new Computador(marca, serial, tamaño, color);
                        listacompuslocal.add(compu);
                    }
                    listacompusglobal = listacompuslocal;
                    listacompuslocal = null;

                    System.out.println("Digite el nombre de la persona");
                    nombre = scan.nextLine();
                   
                     rta = HelperValidacion.ValidarVacio(nombre);

                        while (rta > 0) {
                            System.out.println("Digite el nombre  del computador");
                            nombre = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(nombre);
                        }

                        conteo = HelperValidacion.ValidarTodo(nombre);

                        while (conteo != 0) {
                            System.out.println("Digite el nombre de la persona");
                            nombre = scan.nextLine();
                            conteo = HelperValidacion.ValidarTodo(nombre);

                        }
                        //termina nombre
                    System.out.println("Digite el apellido de la persona");
                    apellido = scan.nextLine();
                   
                     rta = HelperValidacion.ValidarVacio(apellido);

                        while (rta > 0) {
                            System.out.println("Digite el apellido  del computador");
                            apellido = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(apellido);
                        }

                        conteo = HelperValidacion.ValidarTodo(apellido);

                        while (conteo != 0) {
                            System.out.println("Digite el apellido de la persona");
                            apellido = scan.nextLine();
                            conteo = HelperValidacion.ValidarTodo(apellido);

                        }
                        //termina apellido
                    System.out.println("Digite la cedula de la persona");
                    cedula = scan.nextLine();
                     rta = HelperValidacion.ValidarVacio(cedula);

                        while (rta > 0) {
                            System.out.println("Digite la cedula  del computador");
                            cedula = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(cedula);
                        }

                        conteo = HelperValidacion.ValidarTodoLetra(cedula);

                        while (conteo != 0) {
                            System.out.println("Digite la cedula de la persona");
                            cedula = scan.nextLine();
                            conteo = HelperValidacion.ValidarTodoLetra(cedula);

                        }
                        //termina cedula
                    System.out.println("Digite la direccion de la persona");
                    direccion = scan.nextLine();
                    rta = HelperValidacion.ValidarVacio(direccion);

                        while (rta > 0) {
                            System.out.println("Digite la direccion del computador");
                            direccion = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(direccion);
                        }

                        conteo = HelperValidacion.ValidarTodoDireccion(direccion);

                        while (conteo != 0) {
                            System.out.println("Digite la direccion de la persona");
                            direccion = scan.nextLine();
                            conteo = HelperValidacion.ValidarTodoDireccion(direccion);

                        }
                        //termina direccion

                    objPersona = new Persona(nombre, apellido, direccion, cedula, listacompusglobal);
                    listapersona.add(objPersona);
                    break;

                case 2:
                    HelperImpresion.ImprimirInfo(listapersona);
                    break;

                case 3:
                    break;
            }

        } while (opc != 3);
    }
    
}
