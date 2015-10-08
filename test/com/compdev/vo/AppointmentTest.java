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
 * @author Shane Hare
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
    public void testGetPhysicianId() {
        System.out.println("getPhysicianId");
        Appointment instance = new Appointment();
        String expResult = null;
        String result = instance.getPhysicianId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhysicianId method, of class Appointment.
     */
    @Test
    public void testSetPhysicianId() {
        System.out.println("setPhysicianId");
        Appointment instance = new Appointment();
        instance.setPhysicianId("12345");
        String expResult = "12345";
        String result = instance.getPhysicianId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAppointmentDate method, of class Appointment.
     */
    @Test
    public void testGetAppointmentDate() {
        System.out.println("getAppointmentDate");
        Appointment instance = new Appointment();
        String expResult = null;
        String result = instance.getAppointmentDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAppointmentDate method, of class Appointment.
     */
    @Test
    public void testSetAppointmentDate() {
        System.out.println("setAppointmentDate");
        String appointmentDate = "";
        Appointment instance = new Appointment();
        instance.setAppointmentDate("5555");
        String expResult = "5555";
        String result = instance.getAppointmentDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAppointmentNumber method, of class Appointment.
     */
    @Test
    public void testGetAppointmentNumber() {
        System.out.println("getAppointmentNumber");
        Appointment instance = new Appointment();
        String expResult = null;
        String result = instance.getAppointmentNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAppointmentNumber method, of class Appointment.
     */
    @Test
    public void testSetAppointmentNumber() {
        System.out.println("setAppointmentNumber");
        Appointment instance = new Appointment();
        instance.setAppointmentNumber("54321");
        String expResult = "54321";
        String result = instance.getAppointmentNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAppointmentTime method, of class Appointment.
     */
    @Test
    public void testGetAppointmentTime() {
        System.out.println("getAppointmentTime");
        try{
            Appointment instance = new Appointment();
            String result = instance.getAppointmentTime();            
            fail("Should have thrown a NullPointerException");
        }
        catch(NullPointerException ex){
            //Passes
        }
        catch(Exception ex){
            fail("Default Exception thrown - not expected");
        }
    }   
    
    /**
     * Test of setAppointmentTime method, of class Appointment.
     */
    @Test
    public void testSetAppointmentTime() {
        System.out.println("setAppointmentTime");
        Appointment instance = new Appointment();
        instance.setAppointmentTime("12");
        String expResult = "12:00";
        String result = instance.getAppointmentTime();
        assertEquals(expResult, result);       
    }    
    
    /**
     * Test of setAppointmentTime method, of class Appointment.
     */
    @Test
    public void testSetAppointmentTime_Error() {
        System.out.println("setAppointmentTime");
        try{
            Appointment instance = new Appointment();
            instance.setAppointmentTime("1");
            String expResult = "1:00";
            String result = instance.getAppointmentTime();
            fail("Should of thrown Exception out of bounds");
        }
        catch(IndexOutOfBoundsException ex){
            //Pass
        }
        catch(Exception ex){
            fail("Default Exception thrown - not expected");
        }        
    } 
    
    /**
     * Test of getPatientId method, of class Appointment.
     */
    @Test
    public void testGetPatientId() {
        System.out.println("getPatientId");
        Appointment instance = new Appointment();
        String expResult = null;
        String result = instance.getPatientId();
        assertEquals(expResult, result);
    } 
    
    /**
     * Test of setPatientId method, of class Appointment.
     */
    @Test
    public void testSetPatientId() {
        System.out.println("setPatientId");
        Appointment instance = new Appointment();
        instance.setPatientId("12345");
        String expResult = "12345";
        String result = instance.getPatientId();
        assertEquals(expResult, result);   
    }   
    
    /**
     * Test of getPatientServiceCenterCode method, of class Appointment.
     */
    @Test
    public void testGetPatientServiceCenterCode() {
        System.out.println("getPatientServiceCenterCode");
        Appointment instance = new Appointment();
        String expResult = null;
        String result = instance.getPatientServiceCenterCode();
        assertEquals(expResult, result);
    }   
    
    /**
     * Test of setPatientServiceCenterCode method, of class Appointment.
     */
    @Test
    public void testSetPatientServiceCenterCode() {
        System.out.println("setPatientServiceCenterCode");
        Appointment instance = new Appointment();
        instance.setPatientServiceCenterCode("Code545");
        String expResult = "Code545";
        String result = instance.getPatientServiceCenterCode();
        assertEquals(expResult, result);
    }    
    
    /**
     * Test of getPhlebotomistId method, of class Appointment.
     */
    @Test
    public void testGetPhlebotomistId() {
        System.out.println("getPhlebotomistId");
        Appointment instance = new Appointment();
        String expResult = null;
        String result = instance.getPhlebotomistId();
        assertEquals(expResult, result);
    }    
    
    /**
     * Test of setPhlebotomistId method, of class Appointment.
     */
    @Test
    public void testSetPhlebotomistId() {
        System.out.println("setPhlebotomistId");
        Appointment instance = new Appointment();
        instance.setPhlebotomistId("5466");
        String expResult = "5466";
        String result = instance.getPhlebotomistId();
        assertEquals(expResult, result);
    }    
    
    /**
     * Test of getTestDetails method, of class Appointment.
     */
    @Test
    public void testGetTestDetails() {
        System.out.println("getTestDetails");
        Appointment instance = new Appointment();
        HashMap<String, String> expResult = null;
        HashMap<String, String> result = instance.getTestDetails();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTestDetails method, of class Appointment.
     */
    @Test
    public void testSetTestDetails() {
        System.out.println("setTestDetails");
        HashMap<String, String> testDetails = null;
        Appointment instance = new Appointment();
        instance.setTestDetails(testDetails);
        HashMap<String, String> expResult = null;
        HashMap<String, String> result = instance.getTestDetails();
        assertEquals(expResult, result);       
    }    
}
