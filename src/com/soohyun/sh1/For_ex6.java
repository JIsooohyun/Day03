package com.soohyun.sh1;

import java.util.Scanner;

public class For_ex6 {
	public static void main(String[] args) {
		//분과 초를 다룸
		//0분 0초 
		//59분 59초
		//분과 초를 입력 
		//내가 입력한 분과 초과 나오면 멈추기
		Scanner sc = new Scanner(System.in);
		int min, sec;
		System.out.println("분과 초를 입력하세요");
		min = sc.nextInt();
		sec = sc.nextInt();
		int i, j;
		for(i = 0; i<60; i++) {

			for(j = 0; j<60; j++) {
				System.out.println(i+"분" + j+"초");
				if(i==min && j == sec) {
					j=60;
					i=60;
				}
					
			}//안쪽  for문
			
		}//바깥쪽 for문


	}//main
}
