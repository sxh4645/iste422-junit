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
public class PhysicianTest {
    
    public PhysicianTest() {
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
     * Test of getName method, of class Physician.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Physician instance = new Physician();
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Physician.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Physician instance = new Physician();
        instance.setName("ThisIsMyName");
        String expResult = "ThisIsMyName";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPhysicianId method, of class Physician.
     */
    @Test
    public void testGetPhysicianId() {
        System.out.println("getPhysicianId");
        Physician instance = new Physician();
        int expResult = 0;
        int result = instance.getPhysicianId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhysicianId method, of class Physician.
     */
    @Test
    public void testSetPhysicianId_Positive() {
        System.out.println("setPhysicianId");
        Physician instance = new Physician();
        instance.setPhysicianId(5);
        int expResult = 5;
        int result = instance.getPhysicianId();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPhysicianId_Negative() {
        System.out.println("setPhysicianId");
        Physician instance = new Physician();
        instance.setPhysicianId(-5);
        int expResult = -5;
        int result = instance.getPhysicianId();
        assertEquals(expResult, result);
    }    
    
}
