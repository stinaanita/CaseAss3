///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package rest;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import io.restassured.RestAssured;
//import static io.restassured.RestAssured.*;
//import io.restassured.parsing.Parser;
//import static org.hamcrest.Matchers.*;
//
///**
// *
// * @author jarmo
// */
//public class AllTest {
//    
//    public AllTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpBeforeAll() {
//        RestAssured.baseURI = "http://localhost";
//        RestAssured.port = 8080;
//        RestAssured.basePath = "/api/all";
//        RestAssured.defaultParser = Parser.JSON;
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Tests that the server is running*
//     */
//    @Test
//    public void serverIsRunning() {
//        given().when().get().then().statusCode(200);
//    }
//    
//    
//    /**
//     * Test of getText method, of class All.
//     */
//    @Test
//    public void testGetText() {
//        System.out.println("getText");
//        All instance = new All();
//        String expResult = "";
//        String result = instance.getText();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
//}
