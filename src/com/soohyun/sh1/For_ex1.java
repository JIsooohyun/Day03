package com.soohyun.sh1;

import java.util.Scanner;

public class For_ex1 {

	public static void main(String[] args) {
		/*/1부터 10까지의 합을 구하세요
		int i=0, sum=0;
		for(i=1; i<=10; i++) {
			sum=sum+i;
		}
		System.out.println("1부터 10까지의 합은 : "+sum);
		*/
		//임의의 시간을 입력받는다.
		//초시계
		//0초~59초
		
		Scanner sc = new Scanner(System.in);
		int i, count;
		System.out.println("숫자입력");
		count = sc.nextInt();
		
		
		
		/*for(i=0; i<60; i++) {
			System.out.println(i);
			if(i==count)
				break;
							
		}*/
		
		for(i=0; i<60; i++) {
			System.out.println(i);
			if(i==count) {
				System.out.println("ok");
				i=60;
			}
		}
		
	}

}









