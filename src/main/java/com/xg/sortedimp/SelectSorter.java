package com.xg.sortedimp;

public class SelectSorter extends AbstractSorter {

	@Override
	public void sort(int[] a) {
		int length = a.length;
		for(int i=0;i<length;i++) {
			int minkey=i;
			for(int x=i+1;x<length;x++) {
				if(a[x]<a[minkey]) {
					minkey=x;
				}
			}
			int temp=a[i];
			a[i]=a[minkey];
			a[minkey]=temp;
			
			print(a, i);
		}
	}

}
