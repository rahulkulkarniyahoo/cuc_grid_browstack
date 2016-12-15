package junitdemo;

import org.junit.Before;
import org.junit.Test;

public class StepDef {

	@Before
	public void iStart(){
		System.out.println("I start");
	}
	
	@Test
	public void iTest(){
	
	/*	String s1 = System.getProperty("number1");
		String s2 = System.getProperty("number2");
		
		System.out.println("Values are = " + s1 + " "  + s2);
		*/
		System.out.println(System.getProperty("addProp"));
		System.out.println(System.getProperty("multProp"));
		
		System.out.println(System.getProperty("label"));
		
	}
}
