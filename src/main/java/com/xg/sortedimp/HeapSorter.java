package com.xg.sortedimp;

public class HeapSorter extends AbstractSorter {

	public void sort(int[] a) {
		int length = a.length;
		for(int i = (length-1)/2;i>=0;i--) {
			heapAjust(a,i,length);
		}
		
		System.out.println("=============finish build heap================");
		
		for(int i = length-1;i>=0;i--){
			int temp = a[i];a[i]=a[0];a[0]=temp;
			heapAjust(a, 0, i);
		}
	}

	private void heapAjust(int[] a, int s, int length) {
		int tmp = a[s];
		int child = 2*s + 1;
		while(child < length) {
			if(child + 1<length && a[child]<a[child+1]){
				child++;
			}
			if(a[s]<a[child]) {
				a[s]=a[child];
				s=child;
				child=2*s+1;
			}else {
				break;
			}
			a[s]=tmp;
			print(a, s);
		}
	}

}
