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
public class ConvertisseurBasique {
    

  private double tauxConversion ;
    
    public ConvertisseurBasique(){
     //this.tauxConversion = taux ;
    }
    
     public double convertirEnFrancs(double nombreEnFrancs){
        return nombreEnFrancs*6.55957 ;
    }
    
    public double convertirEnEuros(double nombreEnEuros){
        return nombreEnEuros/6.55957 ;
        }
}