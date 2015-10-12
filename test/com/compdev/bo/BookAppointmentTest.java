/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compdev.bo;

import com.compdev.vo.Appointment;
import com.compdev.vo.Patient;
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
public class BookAppointmentTest {
    
    public BookAppointmentTest() {
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
     * Test of checkAvailability method, of class BookAppointment.
     */
    @Test
    public void testCheckAvailability() throws Exception {
        System.out.println("checkAvailability");
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
        BookAppointment instance = new BookAppointment();
        boolean expResult = true;
        boolean result = instance.checkAvailability(p_appointment);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkAvailability method, of class BookAppointment.
     */
    @Test
    public void testCheckAvailability_NegativePhleoID() throws Exception {
        System.out.println("checkAvailability");
        try{
            Appointment p_appointment = new Appointment();
            p_appointment.setAppointmentDate("2020-06-07");
            p_appointment.setAppointmentTime("10:00");
            p_appointment.setPhlebotomistId("-1");
            p_appointment.setPatientId("220");
            p_appointment.setPatientServiceCenterCode("500");
            p_appointment.setPhysicianId("20");
            HashMap hm = new HashMap();
            hm.put("86900", "292.9");
            p_appointment.setTestDetails(hm); 
            BookAppointment instance = new BookAppointment();
            boolean expResult = true;
            boolean result = instance.checkAvailability(p_appointment);
            fail("Should throw Error");
        }
        catch(Exception ex){
            //pass
        }
    }    

    /**
     * Test of makeAppointment method, of class BookAppointment.
     */
    @Test
    public void testMakeAppointment_Negative() throws Exception {
        System.out.println("makeAppointment");
        try{
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
            BookAppointment instance = new BookAppointment();
            String expResult = "";
            String result = instance.makeAppointment(p_appointment);
            assertTrue(result != "");
            fail("Should throw Exception, unable to make appointment");
        }
        catch(Exception ex){
            //Pass
        }
    }  
    
   /**
     * Test of getPatientInfoById method, of class BookAppointment.
     */
    @Test
    public void testGetPatientInfoById() throws Exception {
        System.out.println("getPatientInfoById");
        String p_patientId = "260";
        BookAppointment instance = new BookAppointment(); 
        Patient result = instance.getPatientInfoById(p_patientId);
        assertTrue(result != null);
    }    
    
   /**
     * Test of getPatientInfoById method, of class BookAppointment.
     */
    @Test
    public void testGetPatientInfoById_Null() throws Exception {
        System.out.println("getPatientInfoById");
        try{
            String p_patientId = null;
            BookAppointment instance = new BookAppointment(); 
            Patient result = instance.getPatientInfoById(p_patientId);
            fail("Should throw exception");
        }
        catch(Exception ex){
            //Pass
        }
    }      
    
   /**
     * Test of getPatientInfoById method, of class BookAppointment.
     */
    @Test
    public void testGetPatientInfoById_NonInteger() throws Exception {
        System.out.println("getPatientInfoById");
        try{
            String p_patientId = "a";
            BookAppointment instance = new BookAppointment(); 
            Patient result = instance.getPatientInfoById(p_patientId);
            fail("Should throw exception");
        }
        catch(Exception ex){
            //Pass
        }
    }  
    
   /**
     * Test of getPatientInfoById method, of class BookAppointment.
     */
    @Test
    public void testGetPatientInfoById_NotFound() throws Exception {
        System.out.println("getPatientInfoById");
        String p_patientId = "100";
        BookAppointment instance = new BookAppointment(); 
        Patient result = instance.getPatientInfoById(p_patientId);
        assertTrue(result == null);
    }    
    
    /**
     * Test of getPatientInfoByDetails method, of class BookAppointment.
     */
    @Test
    public void testGetPatientInfoByDetails() throws Exception {
        System.out.println("getPatientInfoByDetails");
        Patient p_patient = new Patient();
        p_patient.setName("Tom Thumb");
        p_patient.setDob("1959-09-22"); 
        BookAppointment instance = new BookAppointment();
        Patient result = instance.getPatientInfoByDetails(p_patient);
        assertTrue(null != result);
    }
    
    /**
     * Test of getPatientInfoByDetails method, of class BookAppointment.
     */
    @Test
    public void testGetPatientInfoByDetails_Null() throws Exception {
        System.out.println("getPatientInfoByDetails");
        try{
            Patient p_patient = new Patient();
            p_patient.setName(null);
            p_patient.setDob(null); 
            BookAppointment instance = new BookAppointment();
            Patient result = instance.getPatientInfoByDetails(p_patient);
            fail("Should throw if null case exception");
        }
        catch(Exception ex){
            //Pass
        }
    }   
    
    /**
     * Test of getPatientInfoByDetails method, of class BookAppointment.
     */
    @Test
    public void testGetPatientInfoByDetails_NullName() throws Exception {
        System.out.println("getPatientInfoByDetails");
        try{
            Patient p_patient = new Patient();
            p_patient.setName(null);
            p_patient.setDob(""); 
            BookAppointment instance = new BookAppointment();
            Patient result = instance.getPatientInfoByDetails(p_patient);
            fail("Should throw if null case exception");
        }
        catch(Exception ex){
            //Pass
        }
    }  
    
    /**
     * Test of getPatientInfoByDetails method, of class BookAppointment.
     */
    @Test
    public void testGetPatientInfoByDetails_NullDob() throws Exception {
        System.out.println("getPatientInfoByDetails");
        try{
            Patient p_patient = new Patient();
            p_patient.setName("");
            p_patient.setDob(null); 
            BookAppointment instance = new BookAppointment();
            Patient result = instance.getPatientInfoByDetails(p_patient);
            fail("Should throw if null case exception");
        }
        catch(Exception ex){
            //Pass
        }
    }       
    
    /**
     * Test of getPatientInfoByDetails method, of class BookAppointment.
     */
    @Test
    public void testGetPatientInfoByDetails_BadDob() throws Exception {
        System.out.println("getPatientInfoByDetails");
        try{
            Patient p_patient = new Patient();
            p_patient.setName("Tom Thumb");
            p_patient.setDob("Bad Date"); 
            BookAppointment instance = new BookAppointment();
            Patient result = instance.getPatientInfoByDetails(p_patient);
            fail("Should throw if null case exception");
        }
        catch(Exception ex){
            //Pass
        }
    }      
    
    /**
     * Test of getPatientInfoByDetails method, of class BookAppointment.
     */
    @Test
    public void testGetPatientInfoByDetails_NotFound() throws Exception {
        System.out.println("getPatientInfoByDetails");

        Patient p_patient = new Patient();
        p_patient.setName("Tom Thumb");
        p_patient.setDob("2000-09-22"); 
        BookAppointment instance = new BookAppointment();
        Patient result = instance.getPatientInfoByDetails(p_patient);
        assertTrue(result == null); 
    }        
    
}
