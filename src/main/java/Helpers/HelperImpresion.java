/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Persona;
import java.util.ArrayList;

/**
 *
 * @author 1059237155
 */
public class HelperImpresion {

    public static void ImprimirInfo(ArrayList<Persona> aux) {
       

        for (int i = 0; i < aux.size(); i++) {
            System.out.println("Persona"+(i+1)+"\n");
            System.out.println("El nombre de la persona es:" + "\t" + aux.get(i).getNombre());
            System.out.println("El apellido de la persona es:" + "\t" + aux.get(i).getApellido());
            System.out.println("El cedula de la persona es:" + "\t" + aux.get(i).getCedula());
            System.out.println("El direccion de la persona es:" + "\t" + aux.get(i).getDireccion());
            System.out.println("\n");

            for (int j = 0; j < aux.get(i).getLscomputadores().size(); j++) {
                System.out.println("Computador"+(j+1));
                System.out.println("La marca del computador es:" + "\t" + aux.get(i).getLscomputadores().get(j).getMarca());
                System.out.println("El serial del computador es:" + "\t" + aux.get(i).getLscomputadores().get(j).getSerial());
                System.out.println("El color del computador es:" + "\t" + aux.get(i).getLscomputadores().get(j).getColor());
                System.out.println("La tamaño del computador es:" + "\t" + aux.get(i).getLscomputadores().get(j).getTamaño());
                System.out.println("\n");
            }
        }

    }
    
}
