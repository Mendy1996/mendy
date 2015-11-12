/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertisseur2a;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mendy
 */
public class MainSimple {
    public static void main(String[] Args){
       Convertisseur C1 = new Convertisseur() ;
       try{
       C1.ajouterDevise("Eur",1.5);
        C1.ajouterDevise("Usd",0.8);
       }
       catch (Exception e){
           e.printStackTrace();
       }
       
        try {
           System.out.println("\n Le resultat de cette convertion est: "+C1.convertir(50, "Eur", "Usd"));
        } catch (Exception ex) {
           ex.printStackTrace();
        }
       
       
    }
}
