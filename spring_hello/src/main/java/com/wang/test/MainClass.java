package com.wang.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		  System.out.println("start....................spring");
//		  
//		  Cal cal = new Cal();
//		  
//		  cal.setfNum(4); cal.setsNum(8);
//		  
//		  int r = cal.Plus();
//		  
//		  System.out.println(cal.getfNum() + "+" + cal.getsNum() + "=" + r);
//		  
//		  Cal cal2 = new Cal();
//		  
//		  cal2.setfNum(10); cal2.setsNum(20);
//		  
//		  int s = cal2.Plus();
//		  
//		  System.out.println(cal2.getfNum() + "+" + cal2.getsNum() + "=" + s+ " (s)");
//		  
//		  r = cal.Plus();
//		  
//		  System.out.println(cal.getfNum() + "+" + cal.getsNum() + "=" + r + " (r)");
		 
		String configLoc = "classpath:appCtx.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		Cal cal = ctx.getBean("cal", Cal.class);
//		cal.setfNum(4);
//		cal.setsNum(8);
		System.out.println("here[0]");
		double r = cal.Cal();
		System.out.println("here[1]");
		//String calType = cal.getCalType();
		System.out.println("here[2]");
		
		System.out.println("결과값=" + r);
		System.out.println("here[3]");
		
		//System.out.println(cal.getfNum() + calType + cal.getsNum() + "=" + r);
		
		/*
		CalArrayList calNum = ctx.getBean("calList", CalArrayList.class);
		double s = calNum.Cal();
		System.out.println(calNum.getCalNum() +"=" + s);
		*/

	}

}
