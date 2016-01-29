package com.xg.sortedimp;

public class TwoSelectSorter extends AbstractSorter {

	@Override
	public void sort(int[] a) {
		int length = a.length;
		for (int i = 0; i < length / 2; i++) {

			int minkey = i;
			int maxKey = i;
			for (int x = i + 1; x < length -i; x++) {
				if (a[x] < a[minkey]) {
					minkey = x;
				}
				if (a[x] > a[maxKey]) {
					maxKey = x;
				}
			}
			
			int temp = a[minkey];
			a[minkey] = a[i];
			a[i] = temp;
			
			if(i==maxKey) maxKey=minkey;
			
			int temp2 = a[maxKey];
			a[maxKey]=a[length - i-1];
			a[length - i-1]=temp2;

			print(a, i);
		}
	}

}
