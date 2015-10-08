/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compdev.util;

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
public class ValidateTest {
    
    public ValidateTest() {
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
     * Test of isPureString method, of class Validate.
     */
    @Test
    public void testIsPureString() {
        System.out.println("isPureString");
        String str = "IamAStringPlease";
        boolean expResult = true;
        boolean result = Validate.isPureString(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPureString_Exception() {
        System.out.println("isPureString");
        try{
            String str = null;
            boolean expResult = true;
            boolean result = Validate.isPureString(str);
            assertEquals(expResult, result);
            fail("Should not reach here - null object cannot be checked for string");
        }
        catch(Exception ex){
            //Pass - canot do regular expression on null object
        }
    }    

    /**
     * Test of isValidName method, of class Validate.
     */
    @Test
    public void testIsValidName() {
        System.out.println("isValidName");
        String strName = "John     Doe";
        boolean expResult = true;
        boolean result = Validate.isValidName(strName);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidName_Negative() {
        System.out.println("isValidName");
        String strName = "John_Doe";
        boolean expResult = false;
        boolean result = Validate.isValidName(strName);
        assertEquals(expResult, result);
    }   
    
    @Test
    public void testIsValidName_Error() {
        System.out.println("isValidName");
        try{
            String strName = null;
            boolean expResult = false;
            boolean result = Validate.isValidName(strName);
            assertEquals(expResult, result);
            fail("Should not reach here - null object cannot be checked for string");
        }
        catch(Exception ex){
            //pass - cannot check null objecty
        }
    }       

    /**
     * Test of isPureInteger method, of class Validate.
     */
    @Test
    public void testIsPureInteger() {
        System.out.println("isPureInteger");
        String str = "15423";
        boolean expResult = true;
        boolean result = Validate.isPureInteger(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPureInteger_Negative() {
        System.out.println("isPureInteger");
        String str = "123a546";
        boolean expResult = false;
        boolean result = Validate.isPureInteger(str);
        assertEquals(expResult, result);
    }    
  
    @Test
    public void testIsPureInteger_Error() {
        System.out.println("isPureInteger");
        try{
            String str = null;
            boolean expResult = false;
            boolean result = Validate.isPureInteger(str);
            assertEquals(expResult, result);
            fail("Should not reach here - null object cannot be checked for string");
        }
        catch(Exception ex){
            //Pass
        }
    }      

    /**
     * Test of isValidDate method, of class Validate.
     */
    @Test
    public void testIsValidDate() {
        System.out.println("isValidDate");
        String strDate = "2015-05-05";
        boolean expResult = true;
        boolean result = Validate.isValidDate(strDate);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidDate_Negative() {
        System.out.println("isValidDate");
        String strDate = "05-06-2015";
        boolean expResult = false;
        boolean result = Validate.isValidDate(strDate);
        assertEquals(expResult, result);
    }    
    
    @Test
    public void testIsValidDate_Error() {
        System.out.println("isValidDate");
        String strDate = null;
        boolean expResult = false;
        boolean result = Validate.isValidDate(strDate);
        assertEquals(expResult, result);
    }        

    /**
     * Test of isValidDXCode method, of class Validate.
     */
    @Test
    public void testIsValidDXCode() {
        System.out.println("isValidDXCode");
        String dxCode = "1342.54";
        boolean expResult = true;
        boolean result = Validate.isValidDXCode(dxCode);
        assertEquals(expResult, result);
    }
    
    public void testIsValidDXCode_Negative() {
        System.out.println("isValidDXCode");
        String dxCode = "CODE54";
        boolean expResult = false;
        boolean result = Validate.isValidDXCode(dxCode);
        assertEquals(expResult, result);
    }    
    
    public void testIsValidDXCode_Error() {
        System.out.println("isValidDXCode");
        try{
            String dxCode = null;
            boolean expResult = false;
            boolean result = Validate.isValidDXCode(dxCode);
            assertEquals(expResult, result);
            fail("Should not reach here - null object cannot be checked for string");
        }
        catch(Exception ex){
            //Pass - Should throw error
        }
    }       

    /**
     * Test of isValidAppointmentTime method, of class Validate.
     */
    @Test
    public void testIsValidAppointmentTime() {
        System.out.println("isValidAppointmentTime");
        String strtime = "";
        boolean expResult = false;
        boolean result = Validate.isValidAppointmentTime(strtime);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidAppointmentTime_LowerBound() {
        System.out.println("isValidAppointmentTime");
        String strtime = "9:00";
        boolean expResult = true;
        boolean result = Validate.isValidAppointmentTime(strtime);
        assertEquals(expResult, result);
    }   
    
    @Test
    public void testIsValidAppointmentTime_LowerBound_Negative() {
        System.out.println("isValidAppointmentTime");
        String strtime = "8:59";
        boolean expResult = false;
        boolean result = Validate.isValidAppointmentTime(strtime);
        assertEquals(expResult, result);
    }   
    
    @Test
    public void testIsValidAppointmentTime_UpperBound() {
        System.out.println("isValidAppointmentTime");
        String strtime = "14:58";
        boolean expResult = false;
        boolean result = Validate.isValidAppointmentTime(strtime);
        assertEquals(expResult, result);
    }   
    
    @Test
    public void testIsValidAppointmentTime_UpperBound_Negative() {
        System.out.println("isValidAppointmentTime");
        String strtime = "15:00";
        boolean expResult = true;
        boolean result = Validate.isValidAppointmentTime(strtime);
        assertEquals(expResult, result);
    }        

    public void testIsValidAppointmentTime_Error() {
        System.out.println("isValidAppointmentTime");
        try{
            String strtime = null;
            boolean expResult = false;
            boolean result = Validate.isValidAppointmentTime(strtime);
            assertEquals(expResult, result);
            fail("Should not reach here - null object cannot be checked for string");
        }
        catch(Exception ex){
            //Pass - Exception on Null string
        }
    }    
    
    /**
     * Test of isValidAppointmentDate method, of class Validate.
     */
    @Test
    public void testIsValidAppointmentDate() {
        System.out.println("isValidAppointmentDate");
        String strDate = "2020-06-07";
        boolean expResult = true;
        boolean result = Validate.isValidAppointmentDate(strDate);
        assertEquals(expResult, result);
    }    
    
    @Test
    public void testIsValidAppointmentDate_Negative() {
        System.out.println("isValidAppointmentDate");
        String strDate = "2000-06-07";
        boolean expResult = false;
        boolean result = Validate.isValidAppointmentDate(strDate);
        assertEquals(expResult, result);
    }    
    
    @Test
    public void testIsValidAppointmentDate_Error() {
        System.out.println("isValidAppointmentDate");
        String strDate = null;
        boolean expResult = false;
        boolean result = Validate.isValidAppointmentDate(strDate);
        assertEquals(expResult, result);
    }      
}
