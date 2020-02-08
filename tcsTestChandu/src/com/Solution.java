package com;

import java.util.Scanner;

public class Solution {
	public static void  main(String[] aa) {
//		Scanner scan=new Scanner(System.in);
//		Document doc[]=new Document[4];
//		for (int i=0;i<4;i++) {
////			System.out.println("Enter id \t"+i);
//			int id =i+1;
//			
//			System.out.println("Enter title \t"+i);
//			String title=scan.next();
//			
//			System.out.println("Enter folder \t"+i);
//			String folder_name=scan.next();
//			
//			System.out.println("Enter pages \t"+i);
//			int pages =scan.nextInt();
//			
//			doc[i]=new Document(id,title,folder_name,pages);
//		}		
//		scan.close();
//		
//		Document doct=null;
		Document doct=new Document();
		doct.setFolder_name("hello");
		String str=doct.getFolder_name();
		System.out.println(str);
//		Document docc=new Document();
//		Document solution=docc.arrayOfDocs(doc);
//		System.out.println("id\t"+solution.getId());
//		System.out.println("title\t"+solution.getTitle());
//		System.out.println("folder\t"+solution.getFolder_name());
//		System.out.println("pages\t"+solution.getPages());
	}
}
