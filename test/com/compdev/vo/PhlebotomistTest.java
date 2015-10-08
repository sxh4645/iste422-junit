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
public class PhlebotomistTest {
    
    public PhlebotomistTest() {
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
     * Test of getName method, of class Phlebotomist.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Phlebotomist instance = new Phlebotomist();
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Phlebotomist.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        Phlebotomist instance = new Phlebotomist();
        instance.setName("ThisIsMyName");
        String expResult = "ThisIsMyName";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPhlebotomistId method, of class Phlebotomist.
     */
    @Test
    public void testGetPhlebotomistId() {
        System.out.println("getPhlebotomistId");
        Phlebotomist instance = new Phlebotomist();
        String expResult = null;
        String result = instance.getPhlebotomistId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhlebotomistId method, of class Phlebotomist.
     */
    @Test
    public void testSetPhlebotomistId() {
        System.out.println("setPhlebotomistId");
        Phlebotomist instance = new Phlebotomist();
        instance.setPhlebotomistId("ThisIsMyId");
        String expResult = "ThisIsMyId";
        String result = instance.getPhlebotomistId();
        assertEquals(expResult, result);
    }
    
}
