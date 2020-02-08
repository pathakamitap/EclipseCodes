package com;

public class CallingFun {
	public static void main(String aa[]){
		try {
		System.out.println("calling of withoutExceptionHandling() :");
		String arr[]=new String[2];
		withoutExceptionHandling.main(arr);
		}catch(Exception ex) {
			System.out.println("excetion of withoutExceptionHandling() :");
			ex.printStackTrace();
		}
	}
}
