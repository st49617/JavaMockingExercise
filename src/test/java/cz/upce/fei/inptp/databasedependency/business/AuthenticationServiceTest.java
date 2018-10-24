/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.upce.fei.inptp.databasedependency.business;

import cz.upce.fei.inptp.databasedependency.dao.PersonDAO;
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
public class AuthenticationServiceTest {

    public AuthenticationServiceTest() {
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
     * Test of Authenticate method, of class AuthenticationService.
     */
    @org.junit.Test
    public void testAuthenticate1() {
        System.out.println("Authenticate");
        String login = "user";
        String password = "pass";
        String savedLogin = "user";
        String savedPassword = "pass";

        PersonDAO mock = Mockito.mock(PersonDAO.class);

        Mockito.when(mock.load("name = '" + savedLogin + "'")).thenReturn(new Person(0, savedLogin, AuthenticationService.encryptPassword(savedPassword)));
        AuthenticationService instance = new AuthenticationService(mock);

        boolean expResult = true;
        boolean result = instance.Authenticate(login, password);
        assertEquals(expResult, result);
    }

    /**
     * Test of Authenticate method, of class AuthenticationService.
     */
    @org.junit.Test
    public void testAuthenticate2() {
        System.out.println("Authenticate");
        String login = "user";
        String password = "invalid";
        String savedLogin = "user";
        String savedPassword = "pass";

        PersonDAO mock = Mockito.mock(PersonDAO.class);

        Mockito.when(mock.load("name = '" + savedLogin + "'")).thenReturn(new Person(0, savedLogin, AuthenticationService.encryptPassword(savedPassword)));
        AuthenticationService instance = new AuthenticationService(mock);

        boolean expResult = false;
        boolean result = instance.Authenticate(login, password);
        assertEquals(expResult, result);
    }

    /**
     * Test of Authenticate method, of class AuthenticationService.
     */
    @org.junit.Test
    public void testAuthenticate3() {
        System.out.println("Authenticate");
        String login = "user";
        String password = "pass";
        String savedLogin = "user";
        String savedPassword = "pass";

        PersonDAO mock = Mockito.mock(PersonDAO.class);

        Mockito.when(mock.load("name = '" + savedLogin + "'")).thenReturn(null);
        AuthenticationService instance = new AuthenticationService(mock);

        boolean expResult = false;
        boolean result = instance.Authenticate(login, password);
        assertEquals(expResult, result);
    }

//    /**
//     * Test of encryptPassword method, of class AuthenticationService.
//     */
//    @org.junit.Test
//    public void testEncryptPassword() {
//        System.out.println("encryptPassword");
//        String password = "";
//        String expResult = "";
//        String result = AuthenticationService.encryptPassword(password);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
