
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wilian Osmin Hernandez Sanchez HS17002
 */
public class Compania {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crean variables para almacenar los km recorridos y la paga
        float recorrido, paga = 0;
        //Varaible para almacenar el dato ingresado
        String Reco;
        //Se digitan los km
        Reco = JOptionPane.showInputDialog("Digite la cantidad de km recorridos" );
        recorrido = Float.parseFloat(Reco);
        //Se validan con if los km recorridos
        if (recorrido <= 300){
            paga = 30;
        }
        else if (recorrido > 300 || 1000 >= recorrido){
         paga = (float) (30 + 0.15 * (recorrido - 300));
        }
        else if (recorrido > 1000){
         paga = (float) (30 + 0.10 * (recorrido - 1000));
        }
        //Se imprime el monto de pago 
        JOptionPane.showMessageDialog(null, "El monto por el automovil es: $" + paga,null, JOptionPane.INFORMATION_MESSAGE );

    }
    
}
