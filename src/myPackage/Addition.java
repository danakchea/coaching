package myPackage;

import java.io.File;
import java.io.IOException;

public class Addition {

	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("in the method   sss ");
		return  a + b;
	}

	public int[] fibonachi(int[] fiboo) {
		
		fiboo[0] = 1;
		fiboo[1] = 1;
		
		for(int i = 2 ;i< fiboo.length;i++)
		{
			fiboo[i] = fiboo[i-1] + fiboo[i-2];
		}
		return fiboo;
	}

}
