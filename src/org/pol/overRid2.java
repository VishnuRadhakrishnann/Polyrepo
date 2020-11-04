package org.pol;

public class overRid2 extends overRid {
	
	@Override
	public void stuName(String s) {
		System.out.println("StuName "+s);
	}
	@Override
	public void engMark(int i) {
		System.out.println("English mark "+i);
	}
	
	@Override
	public void percentage(String a) {
		System.out.println("percentage of sem "+a);
	}
	
	public static void main(String[]args) {
		overRid2 ov=new overRid2();
		
		ov.stuName("vishnu");
		ov.engMark(78);
		ov.percentage("75%");
	
	}
	

}
