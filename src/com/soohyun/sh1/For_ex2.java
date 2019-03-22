package com.soohyun.sh1;

public class For_ex2 {

	public static void main(String[] args) {
		int i, count=5;
		for(i=0; i<10; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
			
		for(i=0; i<10; i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		
		
		
		
		
		
		
	}

}
