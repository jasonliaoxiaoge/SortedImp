package com.xg.sortedimp;

public class ShellSorter extends AbstractSorter {

	@Override
	public void sort(int[] ints) {
		int dk = ints.length / 2;
		while (dk >= 1) {
			shellInsertSort(ints, ints.length, dk);
			dk = dk / 2;
		}
	}

	private void shellInsertSort(int a[], int n, int dk) {
		for (int i = dk; i < n; ++i) {
			if (a[i] < a[i - dk]) {
				int j = i - dk;
				int x = a[i];
				a[i] = a[i - dk];
				while (j > dk && x < a[j - dk]) {
					a[j] = a[j - dk];
					j = j - dk;
				}
				a[j] = x;
			}
			print(a, i);
		}
	}

}
