package AnnotationConf;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {

  @Test
  public void test1() {
	 
	 //Reporter.log("This is my first test case: 1",true);
	  System.out.println("This is my first test case: 1");
  }
  
  @Test
  public void test2() {
	  //Reporter.log("This is my second test case: 2",true);
	  System.out.println("This is my second test case:2");
	  	
  }
  @BeforeMethod
  public void beforeMethod() {
	  //Reporter.log("This is my beforeMethod",true);
	 System.out.println("This is my beforeMethod");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is my afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is my beforevclass");
	 
  }

  @AfterClass
  public void afterClass() {
	 System.out.println("this is my afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is my BeforTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is my aftertest");
	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is my beforesuit");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is my aftersuit");
  }

}
