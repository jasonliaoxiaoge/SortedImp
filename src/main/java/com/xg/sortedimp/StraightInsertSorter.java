package com.xg.sortedimp;

public class StraightInsertSorter extends AbstractSorter {

	public void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) {
				int x = a[i];
				a[i] = a[i - 1];
				int j = i - 1;
				while (j > 0 && x < a[j - 1]) {
					a[j] = a[j - 1];
					j--;
				}
				a[j] = x;
			}
			print(a, i);
		}
	}

	public void sort2(int[] a) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			if (a[i] < a[i - 1]) {
				int j = i - 1;
				int x = a[i];
				// a[i]=a[i-1];
				while (j >= 0 && x < a[j]) {
					a[j + 1] = a[j];
					j--;
				}
				a[j + 1] = x;
			}
			print(a, i);
		}
	}

}
