/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertisseur2a;
import java.util.HashMap ;
import java.util.Map;
/**
 *
 * @author mendy
 */
public class Convertisseur {
    
    HashMap<String,Devise>lesDevises ;
    
    public  Convertisseur(){
    this.lesDevises = new HashMap<String,Devise>();
    }   

    public void ajouterDevise(String nom, double tauxChange) throws Exception {
       if (this.lesDevises.containsKey(nom)){
         throw new Exception("Devise  deja ajoutée"); 
       }
       else{
       Devise uneDevise = new Devise(nom,tauxChange);
       this.lesDevises.put(nom, uneDevise) ;
       System.out.println("La Devise "+nom+" a bien été ajoutée ");
        }
    }
    public double convertir(double montant, String nomDeviseDepart, String nomDeviseCible) throws Exception {
      double resultat =0 ;
    
        if(lesDevises.containsKey(nomDeviseDepart) && lesDevises.containsKey(nomDeviseCible) ){
          
          Devise deviseCible = lesDevises.get(nomDeviseCible);
           
          resultat = montant * deviseCible.getTauxChange();
          
         }
        else{
            throw new Exception("Devise inconnue"); 
        }
      return resultat;
      
    }
}
    

