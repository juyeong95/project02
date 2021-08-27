package main;

import java.util.Scanner;

public class add_Event implements addEvent{
	public void addEvent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이벤트를 추가하시겠습니까?(y/n)");
		String yn = sc.next();
		while(true) {
			if(yn.equals("y")) {
				System.out.println("이벤트를 추가합니다."); break;
			}else if(yn.equals("n")) {
				System.out.println("이벤트추가를 취소합니다."); break;
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
}
