package com.soohyun.sh1;

public class For_ex5 {
	public static void main(String[] args) {
		//3단부터 4단까지 학
		for(int i=3; i<5; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(i +" * "+j+" = "+i*j + "\t");

			}//안쪽 for
			System.out.println(" ");
		}//바깥쪽 for
	}
}
