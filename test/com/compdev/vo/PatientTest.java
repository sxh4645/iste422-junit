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
public class PatientTest {
    
    public PatientTest() {
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
     * Test of getAddress method, of class Patient.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Patient instance = new Patient();
        String expResult = null;
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddress method, of class Patient.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Patient instance = new Patient();
        instance.setAddress("123 Claybourne");
        String expResult = "123 Claybourne";
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDob method, of class Patient.
     */
    @Test
    public void testGetDob() {
        System.out.println("getDob");
        Patient instance = new Patient();
        String expResult = null;
        String result = instance.getDob();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDob method, of class Patient.
     */
    @Test
    public void testSetDob() {
        System.out.println("setDob");
        Patient instance = new Patient();
        instance.setDob("IwasBornBad");
        String expResult = "IwasBornBad";
        String result = instance.getDob();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Patient.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Patient instance = new Patient();
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Patient.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        Patient instance = new Patient();
        instance.setName("CRAPBOB");
        String expResult = "CRAPBOB";
        String result = instance.getName();
        assertEquals(expResult, result);        
    }

    /**
     * Test of isInsurance method, of class Patient.
     */
    @Test
    public void testIsInsurance() {
        System.out.println("isInsurance");
        Patient instance = new Patient();
        boolean expResult = false;
        boolean result = instance.isInsurance();
        assertEquals(expResult, result);
    }

    /**
     * Test of setInsurance method, of class Patient.
     */
    @Test
    public void testSetInsurance() {
        System.out.println("setInsurance");
        Patient instance = new Patient();
        instance.setInsurance(true);
        boolean expResult = true;
        boolean result = instance.isInsurance();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPatientId method, of class Patient.
     */
    @Test
    public void testGetPatientId() {
        System.out.println("getPatientId");
        Patient instance = new Patient();
        String expResult = null;
        String result = instance.getPatientId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPatientId method, of class Patient.
     */
    @Test
    public void testSetPatientId() {
        System.out.println("setPatientId");
        Patient instance = new Patient();
        instance.setPatientId("12345");
        String expResult = "12345";
        String result = instance.getPatientId();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getPhysicianId method, of class Patient.
     */
    @Test
    public void testGetPhysicianId() {
        System.out.println("getPhysicianId");
        Patient instance = new Patient();
        String expResult = null;
        String result = instance.getPhysicianId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhysicianId method, of class Patient.
     */
    @Test
    public void testSetPhysicianId() {
        System.out.println("setPhysicianId");
        Patient instance = new Patient();
        instance.setPhysicianId("12345");
        String expResult = "12345";
        String result = instance.getPhysicianId();
        assertEquals(expResult, result);
    }
    
}
