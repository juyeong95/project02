package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("기능을 선택하세요");
			System.out.println("1.회원가입 2.회원보기 3.회원탈퇴 4.이벤트등록 5.이벤트보기 6.종료");
			System.out.print(">>>");
			int num;
			num=input.nextInt();
			switch(num) {
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: return;
			}
		}
		
	}
}
