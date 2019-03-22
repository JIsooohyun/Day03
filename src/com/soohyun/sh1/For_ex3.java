package com.soohyun.sh1;

import java.util.Scanner;

public class For_ex3 {

	public static void main(String[] args) {

		int id=1234, pw=5678;
		int dId, dPw, i;
		int check=0;
		Scanner sc = new Scanner(System.in);

		String result = "은행에 방문하세요";
		int bank;
		for(i=0; i<5; i++) {
			System.out.println("아이디와 비밀번호 입력");
			dId = sc.nextInt();
			dPw = sc.nextInt();

			if(dId == id && dPw == pw) {
				result="로그인성공";
				check=1;   //어디를 갔다왔냐는 구분을 할 수 있는 변수를 추가해줘라

				break;
			}

		}
		System.out.println(result);

		if(check==1) {
			System.out.println("1.계좌조회");
			System.out.println("2.계좌이체");
			System.out.println("3.대     출");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.println("계좌조회");
				break;
			case 2:
				System.out.println("계좌이체");
				break;
			default:
				System.out.println("대출");

			}
		}

	}
}
