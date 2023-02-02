package com.greedy.section01.array;

public class Application1 {

	public static void main(String[] args) {

		/* 배열이란?
		 * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다.
		 * 배열은 heap 영역에 new 연산자를 이용하여 할당한다.
		 * */
		
		/* 배열의 사용 이유
		 * 1. 연속된 메모리 공간으로 활용할 수 있다. (배열을 사용하지 않으면 여러 개 변수를 사용해야 한다.)
		 * 2. 반복문을 이용한 연속처리가 가능하다.
		 * */
		
//		int num1 = 10;			//배열을 사용하지 않으면 변수 이름들을 다 알고있어야함
//		int num2 = 20;
//		int num3 = 30;
//		int num4 = 40;
//		int num5 = 50;
//		
//		int sum = 0;
//		
//		sum += num1;
//		sum += num2;
//		sum += num3;
//		sum += num4;
//		sum += num5;
//
//		System.out.println("sum : " + sum);
		
		/* 배열의 선언 및 할당 */
		int[] arr = new int[5];		//
//		
//		arr[0] = 10;				//배열을 만들었지만 변수를 선언한 것. 반복문을 이용할 수 있음
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
		int value = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = value += 10;		//최초에 0으로 초기화했기때문에 10을 더하고 시작함
		}
		
		int sum = 0;
		
//		sum += arr[0];
//		sum += arr[1];
//		sum += arr[2];
//		sum += arr[3];
//		sum += arr[4];
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum : " + sum);
	}

}
