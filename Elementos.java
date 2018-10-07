/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Wilian Osmin Hernández Sánchez HS17002
 */
public class Elementos {
static Elemento tmp;
static Elemento tmp_ant;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea una lista para almacenar los datos
        ArrayList<Elemento> element = new ArrayList();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos");
        int n = scan.nextInt();//Ingreso de la cantidad de elementos
        //Se usa un ciclo for para ir ingresando los datos segun n elementos
        for(int i =0; i<n;i++)
        {
        //Se crea objeto tipo elemento para ingresar los datos
        Elemento e = new  Elemento();
           System. out.println("Ingrese el nombre");
           e.Nombre =scan.next();
           System. out.println("Ingrese la concuctividad termica");     
           e.ConductividadTermica=scan.nextFloat();
           System. out.println("Ingrese la conductividad electrica");
           e.ConductividadElectrica=scan.nextFloat();
           element.add(e);//se agregan los datos a la lista
        }
        //SE iguala el objeto a la posicion 0 de la lista
       tmp=element.get(0);
       tmp_ant=tmp;//Luego se le pasa a tmp_ant para que lo contenga
       //Se recorre con un forEach la lista para cada dato que se necesita
       element.forEach(item -> {
           if(item.ConductividadElectrica> tmp.ConductividadElectrica){
           tmp_ant = tmp;
           tmp=item;
           }
       });
       //Se imprime el mayor conductividad electrica
       System.out.println("Mayor conductividad electrica ");
       System.out.println("Nombre: "+tmp.Nombre);
       System.out.println("Conductividad electrica: "+tmp.ConductividadElectrica);
       element.forEach(item -> {
           if(item.ConductividadTermica>tmp.ConductividadTermica){
           tmp_ant = tmp;
           tmp=item;
           }
       });
       //Se imprime el mayor conductividad  termica
       System.out.println("Mayor conductividad termica ");
       System.out.println("Nombre: "+tmp.Nombre);
       System.out.println("Conductividad termica: "+tmp.ConductividadTermica);
       element.forEach(item -> {
           if(item.ConductividadElectrica< tmp.ConductividadElectrica){
           tmp_ant = tmp;
           tmp=item;
           }
       });
       //Se imprime el menor de conductividad electrica
       System.out.println("Menor conductividad electrica ");
       System.out.println("Nombre: "+tmp.Nombre);
       System.out.println("Conductividad electrica: "+tmp.ConductividadElectrica);
       element.forEach(item -> {
           if(item.ConductividadTermica<tmp.ConductividadTermica){
           tmp_ant = tmp;
           tmp=item;
           }
       });
       //Se imprime el menor de conductividad termica
       System.out.println("Menor conductividad termica ");
       System.out.println("Nombre: "+tmp.Nombre);
       System.out.println("Conductividad termica: "+tmp.ConductividadTermica);
    }
    
}
