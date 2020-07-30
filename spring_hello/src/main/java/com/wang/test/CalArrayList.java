package com.wang.test;

import java.util.ArrayList;

public class CalArrayList {
	private ArrayList<Double> calNum;

	public double Cal() {
		double r = 0;
		for(int i=0;i<calNum.size();i++) {
			r +=calNum.get(i);
			System.out.println("i:"+i);
			System.out.println("calNum.size():"+ calNum.size());
			System.out.println("calNum.get(i):"+ calNum.get(i));
			System.out.println("여기[i]:"+i+", r:" + r);
		}
		return r;
	}
	public ArrayList<Double> getCalNum() {
		return calNum;
	}
	
	public void setCalNum(ArrayList<Double> calNum) {
		this.calNum = calNum;
	}
}
