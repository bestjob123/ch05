package com.greedy.section02.demensional;

public class Application3 {

	public static void main(String[] args) {

		/* 2차원 가변 배열(dynamic array) */
		
		int[][] iarr = new int[3][];
		iarr[0] = new int[3];
//		iarr[1] = new char[2];		//자료형이 달라서 컴파일
		iarr[1] = new int[2];
		
		int[] arr = new int[5];
		iarr[2] = arr;
		
		int value = 0;
		for(int i = 0; i < iarr.length; i++) {
			for(int j = 0; j < iarr[i].length; j++) {
				iarr[i][j] = ++value; 
			}
		}
		
		for(int i = 0; i < iarr.length; i++) {
			for(int j = 0; j < iarr[i].length; j++) {
				System.out.print(iarr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
