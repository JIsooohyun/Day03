package com.soohyun.while1;

import java.util.Scanner;

public class WhileTest_4 {
	public static void main(String[] args) {

		int menu=0, num=0, money=0, sum=0, i=0;
		String talk = "", talk2="";
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("****메뉴를 선택하세요****");
			System.out.println("햄버거*******");
			System.out.println("1.불고기버거 \t3500원");
			System.out.println("2.치킨버거 \t3200원");
			System.out.println("추가********");
			System.out.println("3.감자튀김 \t1000원");
			System.out.println("4.샐러드 \t2000원");
			
			System.out.println("메뉴선택");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				talk = "불고기버거";
				money = 3500;
				
				break;
			case 2:
				talk = "치킨버거";
				money = 3200;
				break;
			case 3:
				talk = "감자튀김";
				money = 1000;
				break;
			case 4:
				talk = "샐러드";
				money = 2000;
				break;
			}
			System.out.println("수량은?");
			num = sc.nextInt();
			System.out.println(num+"개 주문하셨습니다.");
			sum = sum+(num*money);
			System.out.println("추가주문하시겠습니까? (추가주문 : 1, 주문:0)");
			i = sc.nextInt();
			talk2 = talk2+talk+" ";
			
			
		}while(i>=1);
		System.out.println("주문하신 메뉴는 " +talk2+"입니다.");
		System.out.println("가격은 : "+sum);
		
		


	}
}
