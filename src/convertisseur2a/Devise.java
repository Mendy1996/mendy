/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertisseur2a;

/**
 *
 * @author mendy
 */
public class Devise {
    private String nom;
    private double tauxChange ;
    
    
   public Devise(String nom, double tauxChange) throws Exception {
       if (nom.length() == 3 ) {
           this.nom = nom;
           this.tauxChange = tauxChange;
       }
       else {
           throw new Exception("Le nom " + nom + " est incorrect !");
       }
   }
    
    public String getNom() { 
        return this.nom; 
    }
    public double getTauxChange(){
        return this.tauxChange; 
    }
    
    
} 
    

