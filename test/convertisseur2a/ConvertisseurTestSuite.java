/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertisseur2a;

import junit.framework.Test;
import junit.framework.TestSuite;

public class ConvertisseurTestSuite extends TestSuite {
    public static Test suite() {
        
        ConvertisseurTestSuite suite = new ConvertisseurTestSuite();
        suite.addTestSuite(ConvertisseurBasiqueTest.class);
        suite.addTestSuite(DeviseTest.class);
        suite.addTestSuite(ConvertisseurTest.class);
        return suite;
        
       
       
        
       
    }        
}

    
    
    

