package com.soohyun.while1;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class WhileTest_4_1 {

	public static void main(String[] args) {

		int bBuger = 0;   //수량 or 주문한총가격
		int cBuger = 0;   
		int potato = 0;
		int salad = 0;
		int select =0;
		int price =0, i=0;
		int count=0, num=0;   //수량 입력
		int total=0;//총합계
		String menu ="";
		boolean check= true;  //반복문의 조건      

		Scanner sc = new Scanner(System.in);
		while(check){
			System.out.println("****메뉴를 선택하세요****");
			System.out.println("햄버거*******");
			System.out.println("1.불고기버거 \t3500원");
			System.out.println("2.치킨버거 \t3200원");
			System.out.println("추가********");
			System.out.println("3.감자튀김 \t1000원");
			System.out.println("4.샐러드 \t2000원");



			System.out.println("메뉴선택");
			select = sc.nextInt();
			System.out.println("수량을 입력하세요");
			count = sc.nextInt();
			switch(select) {
			case 1:
				//불고기버거
				bBuger = bBuger+count*3500;
				break;
			case 2:
				//치킨버거
				cBuger = cBuger+count*3200;
				break;
			case 3:
				potato = potato+count*1000;
				//감자튀김
				break;
			case 4:
				salad = salad+count*2000;
				//샐러드
				break;

			}
			System.out.println("추가주문은 1, 아니면 0");
			select = sc.nextInt();
			if(select ==0) {
				break;
			}

		}

		//최종출력문
		//최종가격
		total = bBuger+cBuger+potato+salad;
		if(bBuger>0) {
			System.out.println("불고기는 : "+bBuger+"원    개수는 : "+ bBuger/3500);
		}
		if(cBuger>0) {
			System.out.println("치킨 : "+cBuger+"원    개수는 : "+ cBuger/3200);
		}
		if(cBuger>0) {
			System.out.println("감튀는 : "+potato+"원    개수는 : "+ potato/1000);
		}
		if(salad>0) {
			System.out.println("샐러드는 : "+salad+"원    개수는 : "+ salad/2000);
		}
		System.out.println("총 가격은 : "+ total);
	}

}


