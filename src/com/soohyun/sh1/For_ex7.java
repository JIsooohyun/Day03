package com.soohyun.sh1;

import java.util.Scanner;

public class For_ex7 {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int i=0, j=0, aa=10, ss;
		/*for(i=0; i<3; i++){
			System.out.println("1번 : 단발\t 2번 : 점사");
			int gun = sc.nextInt();
			if(gun==1) {
				for(j=0; j<30; j++) {
					System.out.println("탕");
				}
			}else if(gun==2) {
				for(j=0; j<10; j++) {
					System.out.println("타타탕");
				}
			}
		}
		System.out.println("게임 종료");
		 */
		/*

		for(i=0; i<3; i++) {
			System.out.println("1번 : 단발 \t 2번 : 점사");
			ss=sc.nextInt();
			if(ss==1){
				aa=30;
			}else{
				aa=10;
			}
			aa=30;
			for(j=0; j<aa; j++) {
					System.out.println("탕");
				}else {
					System.out.println("타타탕");
				}

			}
		}
		System.out.println("종료");
		 */
		
		for(i=0; i<3; i++) {
			aa=10;
			String sound ="타타탕";
			System.out.println("1번 : 단발 \t 2번 : 점사");
			ss=sc.nextInt();
			
			if(ss ==1) {
				aa=30;
				sound="탕";
			}else {
			}
			for(j=0; j<aa; j++) {
				System.out.println(j+1+sound);
			}
		}


	}
}
