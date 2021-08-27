package main;

import java.util.Scanner;

public class Memberout implements Maininter{

	
	public void memout() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정말 탈퇴하시려면 예를 입력해주세요");
		String mem = sc.next();
		if(mem.equals("예")) {
			System.out.println("회원탈퇴가 되었습니다.");
		} else {
			System.out.println("탈퇴가 취소되었습니다.");
			
		}
		
		
	}


	
	
}
