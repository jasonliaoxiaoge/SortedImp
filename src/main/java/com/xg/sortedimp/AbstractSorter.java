package com.xg.sortedimp;

public abstract class  AbstractSorter {
	
	public static void print(int a[], int i) {
		System.out.print("i="+i+": ");
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	public abstract void sort(int[] ints);

}
