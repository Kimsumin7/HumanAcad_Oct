package com.human.cal;

import com.sun.org.apache.xerces.internal.impl.dv.dtd.NMTOKENDatatypeValidator;

public class CalClass {
	private double num1, num2;
	private String operator="+";
	private String result="";
	
	public String resultString() {
	    if (operator.equals("+")) {
	        result = (int)(num1 + num2) + "";
	    } else if(operator.equals("-")) {
	        result = (int)(num1 - num2) + "";
	    } else if(operator.equals("/")) {
	        result = (int)(num1 / num2) + "";
	    } else if(operator.equals("*")) {
	        result = (int)(num1 * num2) + "";
	    }
	    return result;
	}


	@Override
	public String toString() {
		return resultString();
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	

}
