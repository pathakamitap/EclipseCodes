package com;

public class exceptionHandling extends Thread{
	public static void main(String aa[]){
	try {
		
		int a=9;
		int b=3;
		Document d=null;
		for( int i=0;i<10;i++) {
			d=null;
			if (i>4 && i<7) {
//				Document d=null;
				throw new Exception("manual exception");
			}else {
				d=new Document();
			}
			System.out.println(i+")value of c is :" +d.getId());
			
		}
		System.out.println("value of d is :" + d.getId());
		
	}catch(Exception ex) {
		System.out.println("Exception is logged here : ");
		 ex.printStackTrace();

		
	}finally {
		System.out.println("End of the program");
	}
	}
}
