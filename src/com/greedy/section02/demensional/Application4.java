package com.greedy.section02.demensional;

public class Application4 {

	public static void main(String[] args) {

		/* 정변배열 */
		int[][] iarr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
		
		/* 가변배열 */
		int[][] iarr2 = {{1, 2, 3}, {4, 5, 6, 7, 8,}, {9, 10, 11, 12}};
		
		/* 미리 할당한 배열 이용 */
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {6, 7, 8, 9, 10};
		
		int[][] iarr3 = {arr1, arr2};
	}

}
