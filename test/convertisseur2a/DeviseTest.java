/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertisseur2a;

import junit.framework.TestCase;

/**
 *
 * @author mendy
 */
public class DeviseTest extends TestCase {
    
    public DeviseTest(String testName) {
        super(testName);
    }

    public void testConstructeur() throws Exception { 
    String nom = "USD";
    double tauxChange = 1.0;
    Devise devise = new Devise(nom, tauxChange);
    assertEquals(nom, devise.getNom());
    assertEquals(tauxChange, devise.getTauxChange());
} 
    public void testReglesMetier() throws Exception {
 
        Devise devise2;
       try {
           devise2= new Devise("dollard",-1) ;
           fail("Erreur non detectee : nom incorrect");
          }
       catch(Exception e){
// erreur attendue
        }
    }
}