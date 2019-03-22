package com.soohyun.while1;

import java.util.Scanner;

public class WhileTest_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		int uId, uPw;
		boolean check = false;

		do{
			System.out.println("아이디와 비밀번호를 입력하세요");
			uId = sc.nextInt();
			uPw = sc.nextInt();

			if(id == uId && pw == uPw) {
				System.out.println("로그인성공");
				break;
			}
			System.out.println("로그인실패");

		}while(check);

	}
}
