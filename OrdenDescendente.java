
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilian Osmin Hernandez Sanchez HS17002
 */
public class OrdenDescendente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float[ ] a = new float[3];//Arreglo que contendra los numeros ingresados
       Scanner scan = new Scanner(System.in);
System.out.println("Digite el primer numero");
a[0] =scan.nextFloat();
System.out.println("Digite el segundo numero");
a[1] =scan.nextFloat();
System.out.println("Digite el tercer numero");
a[2] =scan.nextFloat();
//Se pasan los valores

//Se imprimen en orden descendente
  System.out.println("Orden descendente:");
        ordSelDesc(a);
        for (float num : a) {
            System.out.println(num);
        }
}
    //ordenamos en forma descendente el arreglo de números enteros y lo imprimimos por pantalla
      

    static void ordSelDesc(float[] arreglo) {
        //iteramos sobre los elementos del arreglo
        for (int i = 0 ; i < arreglo.length - 1 ; i++) {
            int max = i;
            //buscamos el mayor número
            for (int j = i + 1 ; j < arreglo.length ; j++) {
                if (arreglo[j] > arreglo[max]) {
                    max = j;    //encontramos el mayor número
                }
            }
            if (i != max) {
                //permutamos los valores
                float aux = arreglo[i];
                arreglo[i] = arreglo[max];
                arreglo[max] = aux;
            }
        }
    }  
    }
  

