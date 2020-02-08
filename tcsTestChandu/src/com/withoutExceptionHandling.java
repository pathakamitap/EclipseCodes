package com;

public class withoutExceptionHandling {
	public static void main(String aa[]) throws Exception {
		int a=9;
		int b=3;
		Document d=null;
		for( int i=0;i<10;i++) {
			d=null;
			if (i>4 && i<7) {
				throw new Exception("manual exception");
//				Document d=null;
			}else {
				d=new Document();
			}
			System.out.println(i+")value of c is :" +d.getId());
		}
		
		System.out.println("value of c is :" +d.getId());
	}
}
