/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compdev.util;

import com.compdev.exceptions.LAMSException;
import com.compdev.vo.Appointment;
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
public class AppointmentHelperTest {
    
    public AppointmentHelperTest() {
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
     * Test of isApponitmentAvailable method, of class AppointmentHelper.
     */
    @Test
    public void testIsApponitmentAvailable() throws Exception {
        System.out.println("isApponitmentAvailable");
        Appointment p_appointment = new Appointment();
        p_appointment.setAppointmentDate("2020-06-07");
        p_appointment.setAppointmentTime("10:00");
        p_appointment.setPhlebotomistId("100");
        p_appointment.setPatientId("220");
        p_appointment.setPatientServiceCenterCode("510");
        p_appointment.setPhysicianId("20");
        HashMap hm = new HashMap();
        hm.put("86900", "292.9");
        p_appointment.setTestDetails(hm); 
        Appointment result = AppointmentHelper.isApponitmentAvailable(p_appointment);
        assertTrue(result != null);
    }    
    
    /**
     * Test of isApponitmentAvailable method, of class AppointmentHelper.
     */
    @Test
    public void testIsApponitmentAvailabled_NotAvailable() throws Exception {
        System.out.println("isApponitmentAvailable");
        try{
            Appointment p_appointment = new Appointment();
            p_appointment.setAppointmentDate("2009-09-01");
            p_appointment.setAppointmentTime("10:15:00");
            p_appointment.setPhlebotomistId("100");
            p_appointment.setPatientId("220");
            p_appointment.setPatientServiceCenterCode("500");
            p_appointment.setPhysicianId("20");
            HashMap hm = new HashMap();
            hm.put("86900", "292.9");
            p_appointment.setTestDetails(hm); 
            Appointment result = AppointmentHelper.isApponitmentAvailable(p_appointment);
            fail("Should throw exception no Appointment Available");
        }
        catch(Exception ex){
            //Pass
        }

    }        

    
    /**
     * Test of validateAppointment method, of class AppointmentHelper.
     */
    @Test
    public void testValidateAppointment() throws Exception {
        System.out.println("validateAppointment");

        Appointment p_appointment = new Appointment();
        p_appointment.setAppointmentDate("2020-06-07");
        p_appointment.setAppointmentTime("10:00");
        p_appointment.setPhlebotomistId("100");
        p_appointment.setPatientId("220");
        p_appointment.setPatientServiceCenterCode("500");
        p_appointment.setPhysicianId("20");
        HashMap hm = new HashMap();
        hm.put("86900", "292.9");
        p_appointment.setTestDetails(hm);          
        boolean expResult = true;
        boolean result = AppointmentHelper.validateAppointment(p_appointment);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of validateAppointment method, of class AppointmentHelper.
     */
    @Test
    public void testValidateAppointment_NullPhysicianId() throws Exception {
        System.out.println("validateAppointment");
        try{
            Appointment p_appointment = new Appointment();
            p_appointment.setAppointmentDate("2020-06-07");
            p_appointment.setAppointmentTime("10:00");
            p_appointment.setPhlebotomistId("100");
            p_appointment.setPatientId("220");
            p_appointment.setPatientServiceCenterCode("500");
            p_appointment.setPhysicianId(null);
            HashMap hm = new HashMap();
            hm.put("86900", "292.9");
            p_appointment.setTestDetails(hm);          
            boolean result = AppointmentHelper.validateAppointment(p_appointment);
            fail("Should throw LAMSException");
        }
        catch(LAMSException ex){
            //Pass
        }
    }    
    
    /**
     * Test of validateAppointment method, of class AppointmentHelper.
     */
    @Test
    public void testValidateAppointment_InvalidIntegerPatientId() throws Exception {
        System.out.println("validateAppointment");
        try{
            Appointment p_appointment = new Appointment();
            p_appointment.setAppointmentDate("2020-06-07");
            p_appointment.setAppointmentTime("10:00");
            p_appointment.setPhlebotomistId("100");
            p_appointment.setPatientId("a");
            p_appointment.setPatientServiceCenterCode("500");
            p_appointment.setPhysicianId("20");
            HashMap hm = new HashMap();
            hm.put("86900", "292.9");
            p_appointment.setTestDetails(hm);          
            boolean result = AppointmentHelper.validateAppointment(p_appointment);
            fail("Should throw LAMSException");
        }
        catch(LAMSException ex){
            //Pass
        }
    }   
    
    /**
     * Test of validateAppointment method, of class AppointmentHelper.
     */
    @Test
    public void testValidateAppointment_InvalidIntegerPSC() throws Exception {
        System.out.println("validateAppointment");
        try{
            Appointment p_appointment = new Appointment();
            p_appointment.setAppointmentDate("2020-06-07");
            p_appointment.setAppointmentTime("10:00");
            p_appointment.setPhlebotomistId("100");
            p_appointment.setPatientId("220");
            p_appointment.setPatientServiceCenterCode("a");
            p_appointment.setPhysicianId("20");
            HashMap hm = new HashMap();
            hm.put("86900", "292.9");
            p_appointment.setTestDetails(hm);          
            boolean result = AppointmentHelper.validateAppointment(p_appointment);
            fail("Should throw LAMSException");
        }
        catch(LAMSException ex){
            //Pass
        }
    }       

    /**
     * Test of validateAppointment method, of class AppointmentHelper.
     */
    @Test
    public void testValidateAppointment_InvalidIntegerPhleboId() throws Exception {
        System.out.println("validateAppointment");
        try{
            Appointment p_appointment = new Appointment();
            p_appointment.setAppointmentDate("2020-06-07");
            p_appointment.setAppointmentTime("10:00");
            p_appointment.setPhlebotomistId("a");
            p_appointment.setPatientId("220");
            p_appointment.setPatientServiceCenterCode("500");
            p_appointment.setPhysicianId("20");
            HashMap hm = new HashMap();
            hm.put("86900", "292.9");
            p_appointment.setTestDetails(hm);          
            boolean result = AppointmentHelper.validateAppointment(p_appointment);
            fail("Should throw LAMSException");
        }
        catch(LAMSException ex){
            //Pass
        }
    }      
    
    /**
     * Test of validateAppointment method, of class AppointmentHelper.
     */
    @Test
    public void testValidateAppointment_InvalidDate() throws Exception {
        System.out.println("validateAppointment");
        try{
            Appointment p_appointment = new Appointment();
            p_appointment.setAppointmentDate("2000-06-07");
            p_appointment.setAppointmentTime("10:00");
            p_appointment.setPhlebotomistId("100");
            p_appointment.setPatientId("220");
            p_appointment.setPatientServiceCenterCode("500");
            p_appointment.setPhysicianId("20");
            HashMap hm = new HashMap();
            hm.put("86900", "292.9");
            p_appointment.setTestDetails(hm);          
            boolean result = AppointmentHelper.validateAppointment(p_appointment);
            fail("Should throw LAMSException");
        }
        catch(LAMSException ex){
            //Pass
        }
    }    
    
    /**
     * Test of validateAppointment method, of class AppointmentHelper.
     */
    @Test
    public void testValidateAppointment_InvalidTime() throws Exception {
        System.out.println("validateAppointment");
        try{
            Appointment p_appointment = new Appointment();
            p_appointment.setAppointmentDate("2020-06-07");
            p_appointment.setAppointmentTime("19:00");
            p_appointment.setPhlebotomistId("100");
            p_appointment.setPatientId("220");
            p_appointment.setPatientServiceCenterCode("500");
            p_appointment.setPhysicianId("20");
            HashMap hm = new HashMap();
            hm.put("86900", "292.9");
            p_appointment.setTestDetails(hm);          
            boolean result = AppointmentHelper.validateAppointment(p_appointment);
            fail("Should throw LAMSException");
        }
        catch(LAMSException ex){
            //Pass
        }
    }    
    
    /**
     * Test of validateAppointment method, of class AppointmentHelper.
     */
    @Test
    public void testValidateAppointment_InvalidTest() throws Exception {
        System.out.println("validateAppointment");
        try{
            Appointment p_appointment = new Appointment();
            p_appointment.setAppointmentDate("2020-06-07");
            p_appointment.setAppointmentTime("10:00");
            p_appointment.setPhlebotomistId("100");
            p_appointment.setPatientId("220");
            p_appointment.setPatientServiceCenterCode("500");
            p_appointment.setPhysicianId("20");
            HashMap hm = new HashMap();
            hm.put("0", "292.9");
            p_appointment.setTestDetails(hm);          
            boolean result = AppointmentHelper.validateAppointment(p_appointment);
            fail("Should throw LAMSException");
        }
        catch(LAMSException ex){
            //Pass
        }
    }     
    
    /**
     * Test of validateAppointment method, of class AppointmentHelper.
     */
    @Test
    public void testValidateAppointment_InvalidDSM() throws Exception {
        System.out.println("validateAppointment");
        try{
            Appointment p_appointment = new Appointment();
            p_appointment.setAppointmentDate("2020-06-07");
            p_appointment.setAppointmentTime("10:00");
            p_appointment.setPhlebotomistId("100");
            p_appointment.setPatientId("220");
            p_appointment.setPatientServiceCenterCode("500");
            p_appointment.setPhysicianId("20");
            HashMap hm = new HashMap();
            hm.put("86900", "123");
            p_appointment.setTestDetails(hm);          
            boolean result = AppointmentHelper.validateAppointment(p_appointment);
            fail("Should throw LAMSException");
        }
        catch(LAMSException ex){
            //Pass
        }
    }      
    
    /**
     * Test of validateAppointment method, of class AppointmentHelper.
     */
    @Test
    public void testValidateAppointment_NoTests() throws Exception {
        System.out.println("validateAppointment");
        try{
            Appointment p_appointment = new Appointment();
            p_appointment.setAppointmentDate("2020-06-07");
            p_appointment.setAppointmentTime("10:00");
            p_appointment.setPhlebotomistId("100");
            p_appointment.setPatientId("220");
            p_appointment.setPatientServiceCenterCode("500");
            p_appointment.setPhysicianId("20");
            HashMap hm = new HashMap();       
            boolean result = AppointmentHelper.validateAppointment(p_appointment);
            fail("Should throw LAMSException");
        }
        catch(LAMSException ex){
            //Pass
        }
    }       
    
    /**
     * Test of isPhlebotomistAvailable method, of class AppointmentHelper.
     */
    @Test
    public void testIsPhlebotomistAvailable() throws Exception {
        System.out.println("isPhlebotomistAvailable");
        Appointment p_appointment = new Appointment();
        p_appointment.setAppointmentDate("2011-09-01");
        p_appointment.setAppointmentTime("10:00");
        p_appointment.setPhlebotomistId("100");
        p_appointment.setPatientId("220");
        p_appointment.setPatientServiceCenterCode("500");
        p_appointment.setPhysicianId(null);
        HashMap hm = new HashMap();
        hm.put("86900", "292.9");
        p_appointment.setTestDetails(hm);  
        boolean expResult = true;
        boolean result = AppointmentHelper.isPhlebotomistAvailable(p_appointment);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPhlebotomistAvailable method, of class AppointmentHelper.
     */
    @Test
    public void testIsPhlebotomistAvailable_Negative() throws Exception {
        System.out.println("isPhlebotomistAvailable");
        Appointment p_appointment = new Appointment();
        p_appointment.setAppointmentDate("2009-09-01");
        p_appointment.setAppointmentTime("10:15");
        p_appointment.setPhlebotomistId("100");
        p_appointment.setPatientServiceCenterCode("400"); 
        HashMap hm = new HashMap();
        hm.put("86900", "292.9");
        p_appointment.setTestDetails(hm);  
        boolean expResult = false;
        boolean result = AppointmentHelper.isPhlebotomistAvailable(p_appointment);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPhlebotomistAvailable method, of class AppointmentHelper.
     */
    @Test
    public void testIsPhlebotomistAvailable_InValidApptTime() throws Exception {
        System.out.println("isPhlebotomistAvailable");
        Appointment p_appointment = new Appointment();
        p_appointment.setAppointmentDate("2009-09-01");
        p_appointment.setAppointmentTime("15:00");
        p_appointment.setPhlebotomistId("100");
        p_appointment.setPatientId("220");
        p_appointment.setPatientServiceCenterCode("500");
        p_appointment.setPhysicianId("20");
        HashMap hm = new HashMap();
        hm.put("86900", "292.9");
        p_appointment.setTestDetails(hm);  
        boolean expResult = true;
        boolean result = AppointmentHelper.isPhlebotomistAvailable(p_appointment);
        assertEquals(expResult, result);
    }    
    
    /**
     * Test of isPhlebotomistAvailable method, of class AppointmentHelper.
     */
    @Test
    public void testIsPhlebotomistAvailable_Error() throws Exception {
        System.out.println("isPhlebotomistAvailable");
        try{
            Appointment p_appointment = null;
            boolean result = AppointmentHelper.isPhlebotomistAvailable(p_appointment);
            fail("Should throw NullPointerException");
        }
        catch(NullPointerException ex){
            //pass
        }
    }        
    
}
