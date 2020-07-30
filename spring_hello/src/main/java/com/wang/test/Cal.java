package com.wang.test;

public class Cal {
	private double fNum;
	private double sNum;
	private String calType;
	private CalArrayList calNum;
	
	public double Cal() {
		double r = 0;
		if(calType.contentEquals("+"))
		{
			r = this.Plus();
			System.out.println("여기[+]");
		}
		else if(calType.contentEquals("-"))
		{
			r = this.Minus();
			System.out.println("여기[-]");
		}
		else if(calType.contentEquals("L"))
		{
			r = calNum.Cal();
			System.out.println("여기[L]");
		}
		return r;
	}
	
	public CalArrayList getCalNum() {
		return calNum;
	}
	
	public void setCalNum(CalArrayList calNum) {
		this.calNum = calNum;
	}
	
	public double Plus() {
		double r = 0;
		r = fNum+sNum;
		return r;
	}
	
	public double Minus() {
		double r = 0;
		r = fNum-sNum;
		return r;
	}
	
	public String getCalType() {
		return calType;
	}
	
	public void setCalType(String calType) {
		this.calType = calType;
	}
	
	public double getfNum() {
		return fNum;	
	}
	
	public void setfNum(double fNum) {
		this.fNum = fNum;
	}
	
	public double getsNum() {
		return sNum;	
	}
	
	public void setsNum(double sNum) {
		this.sNum = sNum;
	}

}
