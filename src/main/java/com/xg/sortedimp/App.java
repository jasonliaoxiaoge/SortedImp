package com.xg.sortedimp;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		int[] ints = {49,38,65,97,76,13,27,49};
		//AbstractSorter sorter = new StraightInsertSorter();
		//AbstractSorter sorter = new ShellSorter();
		//AbstractSorter sorter = new SelectSorter();
		//AbstractSorter sorter = new TwoSelectSorter();
		//AbstractSorter sorter = new HeapSorter();
		AbstractSorter sorter = new QuickSorter();
		
		AbstractSorter.print(ints, 0);
		System.out.println("================init==============");
		sorter.sort(ints);
		System.out.println("================final==============");
		AbstractSorter.print(ints, 0);
		
	}
}
