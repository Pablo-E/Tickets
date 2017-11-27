/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.ticketDAO;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author Martin
 */
public class test2 {
    
    public test2() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
     
       
        
    }

    
     @Test

     public void hello() {
        ticketDAO t = new ticketDAO();
       
       Date d = new Date();
       
      
       
       t.savePersona("dsf", "dffa", "fdsaf", "fdsaf", "jbjh", d, d, "asfgaf");
     }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
