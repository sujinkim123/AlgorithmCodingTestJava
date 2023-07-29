package ch03_자료구조;

import java.util.Scanner;

/*
 * 평균 구하기
 * 백준 1546 번
 */
public class Q02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		double[] arr = new double[count];
		double M = -1;
		double sum = 0;
		
		for(int i=0; i < count; i++) {
			arr[i] = sc.nextInt();
			
			if (arr[i] > M) {
				M = arr[i];
			}
		}
		
		for(int i=0; i < count; i++) {
			arr[i] = arr[i] / M * 100;
			sum += arr[i];
		} 
		
		System.out.println(sum / count);
		
	}
}
