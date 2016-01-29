package com.xg.sortedimp;

public class QuickSorter extends AbstractSorter {
	private static int count = 0;

	@Override
	public void sort(int[] a) {
		quickSort(a, 0, a.length-1);
	}

	void quickSort(int a[], int low, int high) {
		if (low < high) {
			int privotLoc = partition(a, low, high);
			quickSort(a, low, privotLoc-1);
			quickSort(a, privotLoc + 1, high);
		}
	}

	private int partition(int[] a, int low, int high) {
		int privotKey = a[low];
		while (low < high) {
			while (low < high && a[high] >= privotKey)
				high--;
			int temp = a[low];
			a[low] = a[high];
			a[high] = temp;
			while (low < high && a[low] <= privotKey)
				low++;
			temp = a[low];
			a[low] = a[high];
			a[high] = temp;
		}
		print(a, ++count);
		return low;
	}

}
