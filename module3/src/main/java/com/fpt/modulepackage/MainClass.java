package com.fpt.modulepackage;

import io.jitpack.Module1Utill;
import io.jitpack2.Module2Util;

public class MainClass {
	public static void main(String[] args) {
		Module1Utill m= new Module1Utill();
		String s=m.testMethod();
		System.out.println(s);
		Module2Util m2=new Module2Util();
		m2.testm1();
	}
}
