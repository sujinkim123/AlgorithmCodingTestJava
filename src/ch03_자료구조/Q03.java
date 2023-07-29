package ch03_자료구조;

import java.util.Scanner;

/*
 * 	구간 합 구하기
 * 	백준 11659 번
 * 	아래 코드는 시간 초과...
 * 	다시 고민 필요...
 */
public class Q03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = new int[a];
		int[] result = new int[b];
		
		for(int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i < b; i++) {
			int one = sc.nextInt();
			int two = sc.nextInt();
			
			for(int j=one-1; j < two; j++) {
				result[i] += arr[j];
			}
		}
		
		for(int i=0; i < b; i++) {
			System.out.println(result[i]);
		}
		
	}
}
