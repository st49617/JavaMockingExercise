/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.upce.fei.inptp.databasedependency.business;

import cz.upce.fei.inptp.databasedependency.dao.PersonDAO;
import cz.upce.fei.inptp.databasedependency.dao.PersonRolesDAO;
import cz.upce.fei.inptp.databasedependency.entity.Person;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

/**
 *
 * @author st49617
 */
public class AuthorizationServiceTest {

    public AuthorizationServiceTest() {
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
     * Test of Authorize method, of class AuthorizationService.
     */
    @Test
    public void testAuthorize() {
        System.out.println("Authorize");
        String section = "";
        Person operation = null;
        String savedSection = "";
        Person savedOperation = null;

        PersonDAO persondaoMock = Mockito.mock(PersonDAO.class);
        PersonRolesDAO personRolesDaoMock = Mockito.mock(PersonRolesDAO.class);

        AccessOperationType operationType = null;
        AuthorizationService instance = new AuthorizationService();
        boolean expResult = false;
        boolean result = instance.Authorize(operation, section, operationType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
