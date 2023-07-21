
package org.tnsif.operators;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		int x=34,y=57;
		int res1=x++ + ++y;
		System.out.println(res1);
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("Result2:");
		int res2=x-- + --y;
		System.out.println(x);
		System.out.println(y);
		
	}

}
