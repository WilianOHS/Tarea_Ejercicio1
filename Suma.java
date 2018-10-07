/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilian Osmin Hernandez Sanchez HS17002
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 2;//Se incia el primer numero de la secuencia
        int sum = 0;//Se inicializa la suma
        String band = "TRES";//Variable que ayudara a comparar
        //Inicio de impresion y suma
        while (i <=1800){
        sum = sum + i; 
        System.out.print(i);
        System.out.print("\n");
        //Se compara la variable  
        if( "TRES".equals(band)){
            i = i + 3;
            band = "DOS";
        } else {
            i = i +2;
            band = "TRES";
        }
        }
        //Impresion de la suma
        System.out.print("Suma: "+sum);
        
        System.out.print("\n");
    }
    
}
