package com;

public class Document {
	int id;
	String title;
	String folder_name;
	int pages;
	public Document() {
		
	}
	public Document(int id, String title, String folder_name, int pages) {
		super();
		this.id = id;
		this.title = title;
		this.folder_name = folder_name;
		this.pages = pages;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFolder_name() {
		return folder_name;
	}
	public void setFolder_name(String folder_name) {
		this.folder_name = folder_name;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public Document arrayOfDocs(Document[] docs) {
		int ids=0;
		int counts=0;
		String titles="";
		String folders="";
		Document doc;
		System.out.println("docs length"+docs.length);
		for (int i=0;i<docs.length;i++) {
			if(i != docs.length-1) {
				System.out.println("loop"+i);
				titles=titles.concat(docs[i].getTitle()+"#");
				folders=folders.concat(docs[i].getFolder_name()+"@");
				counts=counts+docs[i].getPages();
			}else {
			System.out.println("last loop");
			ids=docs[i].getId()+1;
			titles=titles.concat(docs[i].getTitle());
			folders=folders.concat(docs[i].getFolder_name());
			counts=counts+docs[i].getPages();
			}
		}
			doc =new Document(ids,titles,folders,counts);

//		doc=null;
		return doc;
		}
	
}
