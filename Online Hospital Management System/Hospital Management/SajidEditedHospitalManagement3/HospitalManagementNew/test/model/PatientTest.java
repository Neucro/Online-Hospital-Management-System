/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abdul
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

    @Test
    public void patientTest() {
        Patient.PatientBuilder builder = new Patient.PatientBuilder();
        String firstName = "Abrar";
        String lastName =  "Tajwar";
        Patient patient = builder.firstName(firstName).lastName(lastName).build();
        
        assertEquals(patient.getFirstName(), firstName);
         assertEquals(patient.getLastName(), lastName);
    }
}
