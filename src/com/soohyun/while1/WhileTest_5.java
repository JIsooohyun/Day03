package com.soohyun.while1;

import java.util.Scanner;

public class WhileTest_5 {

	public static void main(String[] args) {
		//----------로그인 처리------------
		//1.로그인  2. 종료     ok
		//
		//----------게임    진행------------
		//레벨 1          ok
		//몬스터의 경험치는 동일
		//레벨 1에서 2넘어갈 때 잡아야할 몬스터의 수는 3  : 1마리 사냥 -> 2마리 사냥 -> 3마리 사냥 ok
		//gold = 0 레벨 5달성 시 1000G지금 10달성시 2000G지급, 레벨 15달성시 30000G지급 몇 레벨업 축하 얼마 지급
		//최종출력: 랩얼마? 현재 골드는 얼마? 

		Scanner sc = new Scanner(System.in);
		int id = 1234, pw = 5678;
		int uId, uPw;  //유저가 입력
		boolean check = true;
		int level=0, monster;  //레벨과 몬스터수
		int mcount=3;
		int gold1, gold2, gold3;
		int total =0;
		int con=0;


		//-----------로그인 부분-----------------
		while(check) {
			System.out.println("아이디와 비밀번호를 입력하세요");
			uId = sc.nextInt();
			uPw = sc.nextInt();
			if(id==uId && pw == uPw) {
				System.out.println("로그인 성공");
				break;
			}
			else {
				System.out.println("다시 로그인 하세요");
			}
		}

		/*
		System.out.println("-------게임 진행-------");
		System.out.println("현재 레벨은 1입니다.");
		for(level=2; level<16; level++) {

			for(monster=1; monster<mcount+1; monster++) {
				System.out.println(monster+"마리 사냥");
			}
			mcount=mcount+3;
			System.out.println("현재 레벨은 "+level+"입니다");


			if(level ==5 ) {
				gold1= 1000;
				System.out.println(gold1+"골드를 지급하였습니다.");
				total = gold1;
			}
			if(level == 10) {
				gold2= 2000;
				System.out.println(gold2+"골드를 지급하였습니다.");
				total = total+gold2;
			}
			if(level == 15) {
				gold3 = 3000;
				System.out.println(gold3+"골드를 지급하였습니다.");
				total = total +gold3;
			}
		}

		System.out.println("최종 레벨은 " +(level-1)+"입니다.");
		System.out.println("현재 보유한 골드는 "+total+"입니다.");
		최종결과 -> 여기다가 레벨마다 그만할 건지 물어보기*/

		System.out.println("-------게임 진행-------");
		System.out.println("현재 레벨은 1입니다.");


		while(check) {
			for(level=2; level<16; level++) {


				for(monster=1; monster<mcount+1; monster++) {
					System.out.println(monster+"마리 사냥");
				}
				mcount=mcount+3;



				//골드지급부분
				if(level ==5 ) {
					gold1= 1000;
					System.out.println(gold1+"골드를 지급하였습니다.");
					total = gold1;
				}
				if(level == 10) {
					gold2= 2000;
					System.out.println(gold2+"골드를 지급하였습니다.");
					total = total+gold2;
				}
				if(level == 15) {
					gold3 = 3000;
					System.out.println(gold3+"골드를 지급하였습니다.");
					total = total +gold3;
				}
				
				System.out.println("현재 레벨은 "+level+"입니다");

				System.out.println("계속진행 1, 아니면 0");
				con = sc.nextInt();
				if(con == 1) {
					check =true;
				}
				else {
					break;
				}
				if(level == 15) {
					break;
				}
			}
			if(con == 0) {
				break;
			}
			if(level == 15) {
				break;
			}

		}
		System.out.println("최종 레벨은 " +(level)+"입니다.");
		System.out.println("현재 보유한 골드는 "+total+"입니다.");



	}

}
