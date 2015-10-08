/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compdev.vo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ARabidNun
 */
public class LabTestTest {
    
    public LabTestTest() {
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

    /**
     * Test of getCost method, of class LabTest.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        LabTest instance = new LabTest();
        double expResult = 0.0;
        double result = instance.getCost();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setCost method, of class LabTest.
     */
    @Test
    public void testSetCost_Positive() {
        System.out.println("setCost");
        double cost = 5;
        LabTest instance = new LabTest();
        instance.setCost(cost);
        double expResult = 5.0;
        double result = instance.getCost();
        assertEquals(expResult, result, 0.0);      
    }
    
    @Test
    public void testSetCost_Negative() {
        System.out.println("setCost");
        double cost = -5;
        LabTest instance = new LabTest();
        instance.setCost(cost);
        double expResult = -5.0;
        double result = instance.getCost();
        assertEquals(expResult, result, 0.0);      
    }    

    /**
     * Test of getTestName method, of class LabTest.
     */
    @Test
    public void testGetTestName() {
        System.out.println("getTestName");
        LabTest instance = new LabTest();
        String expResult = null;
        String result = instance.getTestName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTestName method, of class LabTest.
     */
    @Test
    public void testSetTestName() {
        System.out.println("setTestName");
        LabTest instance = new LabTest();
        instance.setTestName("MyTestFirst");
        String expResult = "MyTestFirst";
        String result = instance.getTestName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTestNumber method, of class LabTest.
     */
    @Test
    public void testGetTestNumber() {
        System.out.println("getTestNumber");
        LabTest instance = new LabTest();
        int expResult = 0;
        int result = instance.getTestNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTestNumber method, of class LabTest.
     */
    @Test
    public void testSetTestNumber_Positive() {
        System.out.println("setTestNumber");
        LabTest instance = new LabTest();
        instance.setTestNumber(5);
        int expResult = 5;
        int result = instance.getTestNumber();
        assertEquals(expResult, result);        
    }
    
    /**
     * Test of setTestNumber method, of class LabTest.
     */
    @Test
    public void testSetTestNumber_Negative() {
        System.out.println("setTestNumber");
        LabTest instance = new LabTest();
        instance.setTestNumber(-5);
        int expResult = -5;
        int result = instance.getTestNumber();
        assertEquals(expResult, result);        
    }    
    
}
