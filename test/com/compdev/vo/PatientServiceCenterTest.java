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
public class PatientServiceCenterTest {
    
    public PatientServiceCenterTest() {
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
     * Test of getPscId method, of class PatientServiceCenter.
     */
    @Test
    public void testGetPscId() {
        System.out.println("getPscId");
        PatientServiceCenter instance = new PatientServiceCenter();
        String expResult = null;
        String result = instance.getPscId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPscId method, of class PatientServiceCenter.
     */
    @Test
    public void testSetPscId() {
        System.out.println("setPscId");
        PatientServiceCenter instance = new PatientServiceCenter();
        instance.setPscId("12345");
        String expResult = "12345";
        String result = instance.getPscId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPscName method, of class PatientServiceCenter.
     */
    @Test
    public void testGetPscName() {
        System.out.println("getPscName");
        PatientServiceCenter instance = new PatientServiceCenter();
        String expResult = null;
        String result = instance.getPscName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPscName method, of class PatientServiceCenter.
     */
    @Test
    public void testSetPscName() {
        System.out.println("setPscName");
        PatientServiceCenter instance = new PatientServiceCenter();
        instance.setPscName("54321");
        String expResult = "54321";
        String result = instance.getPscName();
        assertEquals(expResult, result);
    }
    
}
