/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compdev.vo;

import java.util.HashMap;
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
public class AppointmentTest {
    
    public AppointmentTest() {
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
     * Test of getPhysicianId method, of class Appointment.
     */
    @Test
    public void testGetPhysicianId_DefaultConstructor() {
        System.out.println("getPhysicianId");
        Appointment instance = new Appointment();
        String expResult = null;
        String result = instance.getPhysicianId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }  
    
    @Test
    public void testSetPhysicianId() {
        System.out.println("getPhysicianId");
        Appointment instance = new Appointment();
        instance.setPhysicianId("Bob");
        String expResult = "Bob";
        String result = instance.getPhysicianId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }     
}
