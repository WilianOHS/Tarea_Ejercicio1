
import java.util.ArrayList;
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
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Arreglo lista para almacenar los datos
        ArrayList<TiendaProducto> P = new ArrayList();
        Scanner scan = new Scanner(System.in);
        //Se introducen los datos en la lista con un for
        for (int i = 0;i<10;i++){
        TiendaProducto T = new TiendaProducto();
        System.out.println("Digite el valor $");
        T.valor=scan.nextFloat();
        System.out.println("Digite la cantidad");
        T.cantidad =scan.nextFloat();
        T.compra = T.valor * T.cantidad;
        if (T.cantidad > 36){
            T.descuento = (float) (T.compra * 0.15);
            T.total = T.compra - T.descuento;
            T.cantidad = 3 + T.cantidad;
        }
        else{
            T.descuento = (float) (T.compra * 0.1);
            T.total = T.compra - T.descuento;
        }
        P.add(T);//Se agragan los datos la lista
        }
       //Se imprimen los datos de los 10 clientes
        for (int i = 0; i<10;i++){
        System.out.println("Cliente "+(i+1));
        System.out.println("El monto de la compra es: $" + P.get(i).compra);
        System.out.println("El monto del descuento es: $" + P.get(i).descuento);
        System.out.println("El monto a pagar es: $" + P.get(i).total);
        if (P.get(i).cantidad > 36){
        System.out.println("La cantidad que se lleva por llevar mas de 3 docenas es: " + P.get(i).cantidad);
        }

        }
        
        
    }
    }
