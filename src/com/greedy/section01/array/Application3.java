package com.greedy.section01.array;

public class Application3 {

	public static void main(String[] args) {

		/* 기본적으로 배열을 선언하고 할당하게 되면
		 * 배열의 각 인덱스에는 자바가 지정한 기본값으로 초기화가 된 상태가 된다.
		 * heap영역은 값이 없는 빈 공간이 존재할 수 없다.
		 * */
		
		/* 값의 형태별 기본값
		 * 정수 : 0
		 * 실수 : 0.0
		 * 논리 : false  //0
		 * 문자 : \u0000		//유니코드 0
		 * 참조 : null 
		 * */
		
		int[] iarr = new int[5];
		
		for(int i = 0 ; i < iarr.length; i++) {
			System.out.println("iarr[" + i + "] : " + iarr[i]);
		}
	
		/* 배열의 리터럴 활용 
		 * 자바에서 지정한 기본값 외의 값으로 초기화를 하고 싶은 경우 리터럴을 활용할 수 있다.
		 * 리터럴을 활용하는 경우 new를 사용하지 않아도 되며, 값의 갯수만큼 자동으로 크기가 설정된다.
		 * */
		int[] iarr2 = {11, 22, 33, 44, 55};
		
		for(int i = 0; i < iarr2.length; i++) {
			System.out.println("iarr2[" + i + "] : " + iarr2[i]);
}
		
		int[] iarr3 = new int[] {11, 22, 33, 44, 55};
		
		String[] sarr = {"apple", "banana", "grape", "orange"};
}
}