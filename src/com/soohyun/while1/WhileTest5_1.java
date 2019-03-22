package com.soohyun.while1;

import java.util.Scanner;

public class WhileTest5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		boolean  check = true;
		int level=0, gold=0;
		int monster=3;
		int mcount =3;


		while(check) {
			System.out.println("1. 로그인    2.종료");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.println("아이디를 입력하세요");
				int yid= sc.nextInt();
				System.out.println("비밀번호를 입력하세요");
				int ypw = sc.nextInt();

				if(id == yid && pw == ypw) {
					System.out.println("로그인 성공");
					check = !check;
				}else {
					System.out.println("로그인 실패");
				}
			}else {
				break;
			}
		} //while end

		//check F ->로그인 성공 ,   T -> 로그인 실패 
		if(check == false) {
			System.out.println("게임 진행");		
			
			
			for(level=1; level<15; level++) {
				if(level == 5 || level == 10) {
					gold = gold+(level/5)*1000;
					System.out.println((level/5)*1000+"골드 지급");
				}
				for(int i=1; i<=level*3; i++){
					System.out.println(i+"마리 사냥");
				}
				
				System.out.println("축 레벨업!!"+(level+1));
			}//바깥 for문

			gold = gold+3000;
			System.out.println("현재 레밸 : "+level);
			System.out.println("Gold : "+gold);
			

		}

		System.out.println("프로그램을 종료");


	}

}
