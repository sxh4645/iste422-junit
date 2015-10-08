/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compdev.dbutil;

import com.compdev.dbutil.BusinessDelegator;
import com.compdev.exceptions.DatabaseException;
import com.compdev.vo.Appointment;
import com.compdev.vo.Patient;
import com.compdev.vo.PatientServiceCenter;
import com.compdev.vo.Phlebotomist;
import components.data.DB;
import components.data.Physician;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public class BusinessDelegatorTest {
    
    public BusinessDelegatorTest() {
        
        List<Object> objs = BusinessDelegator.db.getData("Appointment", "");
        for (Object obj : objs){
            System.out.println(obj);
        }        
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

    /*
     * Test of isValidPatient method, of class BusinessDelegator.
     */
    @Test
    public void testIsValidPatient() throws Exception {
        System.out.println("isValidPatient");
        String p_patientId = "260";
        boolean expResult = true;
        boolean result = BusinessDelegator.isValidPatient(p_patientId);
        assertEquals(expResult, result);
    }
    
    /*
     * Test of isValidPatient method, of class BusinessDelegator.
     */
    @Test
    public void testIsValidPatient_Negative() throws Exception {
        System.out.println("isValidPatient");
        String p_patientId = "160";
        boolean expResult = false;
        boolean result = BusinessDelegator.isValidPatient(p_patientId);
        assertEquals(expResult, result);
    }    
    
    /**
     * Test of getPatientById method, of class BusinessDelegator.
     */
    @Test
    public void testGetPatientById() throws Exception {
        System.out.println("getPatientById");
        String p_patientId = "260";
        Patient result = BusinessDelegator.getPatientById(p_patientId);
        assertTrue(result != null);
    }    
    
    /**
     * Test of getPatientById method, of class BusinessDelegator.
     */
    @Test
    public void testGetPatientById_Negative() throws Exception {
        System.out.println("getPatientById");
        String p_patientId = "160";
        Patient expResult = null;
        Patient result = BusinessDelegator.getPatientById(p_patientId);
        assertEquals(expResult, result);
    }  
    
    /**
     * Test of getPatientByDetails method, of class BusinessDelegator.
     */
    @Test
    public void testGetPatientByDetails() throws Exception {
        System.out.println("getPatientByDetails");
        Patient p_patient = new Patient();
        p_patient.setName("Tom Thumb");
        p_patient.setDob("1959-09-22");     
        Patient result = BusinessDelegator.getPatientByDetails(p_patient);
        //Dumb Design, if it finds the patient it prints it's details in the function
        assertTrue(result != null);
    }    
    
    /**
     * Test of getPatientByDetails method, of class BusinessDelegator.
     */
    @Test
    public void testGetPatientByDetails_Negative() throws Exception {
        System.out.println("getPatientByDetails_Negative");
        
        Patient p_patient = new Patient();
        p_patient.setName("Tommy NonExist");
        p_patient.setDob("1959-09-22");     
        Patient result = BusinessDelegator.getPatientByDetails(p_patient);
        assertTrue(result == null);
    }  
    
    /**
     * Test of isValidPhelbotomist method, of class BusinessDelegator.
     */
    @Test
    public void testIsValidPhelbotomist() throws Exception {
        System.out.println("isValidPhelbotomist");
        String p_phelbotomist = "120";
        boolean expResult = true;
        boolean result = BusinessDelegator.isValidPhelbotomist(p_phelbotomist);
        assertEquals(expResult, result);
    }    
    
    /**
     * Test of isValidPhelbotomist method, of class BusinessDelegator.
     */
    @Test
    public void testIsValidPhelbotomist_Negative() throws Exception {
        System.out.println("isValidPhelbotomist");
        String p_phelbotomist = "99";
        boolean expResult = false;
        boolean result = BusinessDelegator.isValidPhelbotomist(p_phelbotomist);
        assertEquals(expResult, result);
    }     
    
    /**
     * Test of isValidPhysician method, of class BusinessDelegator.
     */
    @Test
    public void testIsValidPhysician() throws Exception {
        System.out.println("isValidPhysician");
        String p_physician = "10";
        boolean expResult = true;
        boolean result = BusinessDelegator.isValidPhysician(p_physician);
        assertEquals(expResult, result);
    }  
    
    /**
     * Test of isValidPhysician method, of class BusinessDelegator.
     */
    @Test
    public void testIsValidPhysician_Negative() throws Exception {
        System.out.println("isValidPhysician");
        String p_physician = "9";
        boolean expResult = false;
        boolean result = BusinessDelegator.isValidPhysician(p_physician);
        assertEquals(expResult, result);
    }   
    
    /**
     * Test of isValidDSMCode method, of class BusinessDelegator.
     */
    @Test
    public void testIsValidDSMCode() throws Exception {
        System.out.println("isValidDSMCode");
        String p_dsmcode = "290.0";
        boolean expResult = true;
        boolean result = BusinessDelegator.isValidDSMCode(p_dsmcode);
        assertEquals(expResult, result);
    }    
    
    /**
     * Test of isValidDSMCode method, of class BusinessDelegator.
     */
    @Test
    public void testIsValidDSMCode_Negative() throws Exception {
        System.out.println("isValidDSMCode");
        String p_dsmcode = "2.1";
        boolean expResult = false;
        boolean result = BusinessDelegator.isValidDSMCode(p_dsmcode);
        assertEquals(expResult, result);
    }    
    
    /**
     * Test of isValidPSC method, of class BusinessDelegator.
     */
    @Test
    public void testIsValidPSC() throws Exception {
        System.out.println("isValidPSC");
        String p_PSCCode = "500";
        boolean expResult = true;
        boolean result = BusinessDelegator.isValidPSC(p_PSCCode);
        assertEquals(expResult, result);
    }    
    
    /**
     * Test of isValidPSC method, of class BusinessDelegator.
     */
    @Test
    public void testIsValidPSC_Negative() throws Exception {
        System.out.println("isValidPSC");
        String p_PSCCode = "0";
        boolean expResult = false;
        boolean result = BusinessDelegator.isValidPSC(p_PSCCode);
        assertEquals(expResult, result);
    }   
    
    /**
     * Test of isValidLabTest method, of class BusinessDelegator.
     */
    @Test
    public void testIsValidLabTest() throws Exception {
        System.out.println("isValidLabTest");
        String p_LabTestCode = "82088";
        boolean expResult = true;
        boolean result = BusinessDelegator.isValidLabTest(p_LabTestCode);
        assertEquals(expResult, result);
    } 
    
    /**
     * Test of isValidLabTest method, of class BusinessDelegator.
     */
    @Test
    public void testIsValidLabTest_Negative() throws Exception {
        System.out.println("isValidLabTest");
        String p_LabTestCode = "";
        boolean expResult = false;
        boolean result = BusinessDelegator.isValidLabTest(p_LabTestCode);
        assertEquals(expResult, result);
    }        
    
    /**
     * Test of isPSCAvailable method, of class BusinessDelegator.
     */
    @Test
    public void testIsPSCAvailable() throws Exception {
        System.out.println("isPSCAvailable");
        Appointment p_appointment = new Appointment();
        p_appointment.setPatientServiceCenterCode("500");
        p_appointment.setAppointmentDate("2009-09-01");
        p_appointment.setAppointmentTime("10:15:00");
        boolean expResult = false;
        boolean result = BusinessDelegator.isPSCAvailable(p_appointment);
        assertEquals(expResult, result);
    }    
    
    /**
     * Test of isPSCAvailable method, of class BusinessDelegator.
     */
    @Test
    public void testIsPSCAvailable_Negative() throws Exception {
        System.out.println("isPSCAvailable");
        Appointment p_appointment = new Appointment();
        p_appointment.setPatientServiceCenterCode("100");
        p_appointment.setAppointmentDate("2009-09-01");
        p_appointment.setAppointmentTime("10:15:00");
        boolean expResult = true;
        boolean result = BusinessDelegator.isPSCAvailable(p_appointment);
        assertEquals(expResult, result);
    }   
    
    /**
     * Test of getAllPSCs method, of class BusinessDelegator.
     */
    @Test
    public void testGetAllPSCs() throws Exception {
        System.out.println("getAllPSCs");
        ArrayList<PatientServiceCenter> result = BusinessDelegator.getAllPSCs();
        assertTrue(result != null);
    }    
    
    /**
     * Test of getAllPhlebotomists method, of class BusinessDelegator.
     */
    @Test
    public void testGetAllPhlebotomists() throws Exception {
        System.out.println("getAllPhlebotomists");
        ArrayList<Phlebotomist> result = BusinessDelegator.getAllPhlebotomists();
        assertTrue(result != null);
    }    
    
    /**
     * Test of createAppointment method, of class BusinessDelegator.
     */
    @Test
    public void testCreateAppointment() throws Exception {
        System.out.println("createAppointment");
        Appointment p_appointment = new Appointment();
        p_appointment.setAppointmentDate("2011-09-01");
        p_appointment.setAppointmentTime("10:00");
        p_appointment.setPhlebotomistId("100");
        p_appointment.setPatientId("220");
        p_appointment.setPatientServiceCenterCode("500");
        p_appointment.setPhysicianId("20");
        HashMap hm = new HashMap();
        hm.put("86900", "292.9");
        p_appointment.setTestDetails(hm);        
        String result = BusinessDelegator.createAppointment(p_appointment);
        assertTrue(result != null);
    }    
    
    /**
     * Test of isPhlebotomistAvailable method, of class BusinessDelegator.
     */
    @Test
    public void testIsPhlebotomistAvailable() throws Exception {
        System.out.println("isPhlebotomistAvailable");
        Appointment p_appointment = new Appointment();
        p_appointment.setAppointmentDate("2111-09-01");
        p_appointment.setAppointmentTime("10:00");
        p_appointment.setPhlebotomistId("100");
        p_appointment.setPatientServiceCenterCode("500"); 
        boolean expResult = false;
        boolean result = BusinessDelegator.isPhlebotomistAvailable(p_appointment);
        assertEquals(expResult, result);
    }     
    
    /**
     * Test of isPhlebotomistAvailable method, of class BusinessDelegator.
     */
    @Test
    public void testIsPhlebotomistAvailable_Negative() throws Exception {
        System.out.println("isPhlebotomistAvailable");
        Appointment p_appointment = new Appointment();
        p_appointment.setAppointmentDate("2009-09-01");
        p_appointment.setAppointmentTime("10:15");
        p_appointment.setPhlebotomistId("100");
        p_appointment.setPatientServiceCenterCode("400"); 
        boolean expResult = true;
        boolean result = BusinessDelegator.isPhlebotomistAvailable(p_appointment);
        assertEquals(expResult, result);
    }          
}
