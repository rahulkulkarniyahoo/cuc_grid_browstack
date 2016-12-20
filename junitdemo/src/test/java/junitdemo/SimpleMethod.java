package junitdemo;

import org.openqa.selenium.remote.server.handler.GetAlertText;

public class SimpleMethod {

	int i;
	String s;
	
	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}

	/**
	 * @param i the i to set
	 */
	public void setI(int i) {
		this.i = i;
	}

	/**
	 * @return the s
	 */
	public String getS() {
		return s;
	}

	/**
	 * @param s the s to set
	 */
	public void setS(String s) {
		this.s = s;
	}

	public static void main(String[] args) {
		
		SimpleMethod sm = new SimpleMethod();
		//sm.setI(10);
		System.out.println(sm.getI());
		System.out.println("Got" + sm.getS() + "this");
	}

}
