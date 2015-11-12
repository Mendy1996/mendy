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
public class ConvertisseurTest extends TestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp(); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Convertisseur convertisseur;
    
    public ConvertisseurTest(String testName) {
        super(testName);
    }

   public void testAjouterDevise() throws Exception {
       
       try {
           convertisseur.ajouterDevise("EUR", 1.36) ;
           fail("Erreur non detectee : devise deja ajoutee");
       }
       catch (Exception e) {
// erreur attendue
       }
       
}
   public void testConvertir() throws Exception {
Convertisseur convertisseur = new Convertisseur();
convertisseur.ajouterDevise("USD", 1.0);
convertisseur.ajouterDevise("GBP", 1.6);
// conversion d'un euro en euros
double resultat = convertisseur.convertir(1.0, "EUR", "EUR");
assertEquals(1.0, resultat);
// conversion d'une livre en dollars
resultat = convertisseur.convertir(1.0, "GBP", "USD");
assertEquals(1.6, resultat);
// conversion de 20 euros en livres
resultat = convertisseur.convertir(20.0, "EUR", "GBP");
assertEquals(17.0, resultat);
try {
convertisseur.convertir(1.0, "YEN", "USD") ;
fail("Erreur non detectee : devise inconnue");
}
catch (Exception e) {
// erreur attendue
}
}
    
}
