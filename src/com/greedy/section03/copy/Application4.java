package com.greedy.section03.copy;

public class Application4 {

	public static void main(String[] args) {

		/* 깊은 복사 사용 예제 */
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = arr1.clone();
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] += 10;
			}
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		/* 향상된 for문 : jdk 1.5에서 추가됨 */
		for(int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i : arr2) {
			i += 10;
		}
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}
}
