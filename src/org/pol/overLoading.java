package org.pol;

public class overLoading {
	
	public void movies(String s) {
		System.out.println("Movie "+s);
	}
	
	public void movies(String r,String t) {
		System.out.println("Movie is "+r);
		System.out.println("Movie is "+t);
		System.out.println("5-4");
		System.out.println("6-3");
	}
	
	public void movies(long o,float f) {
		System.out.println("Likes "+o);
		System.out.println("Perday likes "+f);
		System.out.println("1-2");
		System.out.println("3-4");
	}
	
	public static void main(String[]args) {
		
		overLoading x=new overLoading();
		x.movies("Grass", "Gravity");	
		x.movies("Movies time");
		
		x.movies(10000, 5);
	}
	

}
