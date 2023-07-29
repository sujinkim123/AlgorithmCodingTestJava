package ch03_자료구조;

import java.util.Scanner;

/*
 * 숫자의 합 구하기
 * 백준 11720 번
 */

public class Q01 {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		String input = stdIn.next();
		char[] c = input.toCharArray();
		int sum = 0;
		
		for(int i=0; i < c.length; i++) {
			sum += c[i] - '0';
		}
		
		System.out.println(sum);
		
	}
}
