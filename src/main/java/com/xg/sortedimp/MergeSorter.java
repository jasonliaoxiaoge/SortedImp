package com.xg.sortedimp;

public class MergeSorter extends AbstractSorter {

	@Override
	public void sort(int[] ints) {
		int[] intsb = new int[ints.length];
		int[] result = mergeSort(ints, intsb, ints.length);
		System.arraycopy(result, 0, ints, 0, result.length);
	}

	private int[] mergeSort(int[] a, int[] b, int length) {
		int len = 1;
		while (len < length) {
			int s = len;
			len = 2 * s;
			int i = 0;
			while (i + len < length) {
				merge(a, b, i, i + s - 1, i + len - 1);
				i = i + len;
			}
			if (i + s < length) {
				merge(a, b, i, i + s - 1, length - 1);
			}

			int[] tmp = a;
			a = b;
			b = tmp;
		}
		return a;
	}

	private void merge(int[] a, int[] b, int i, int m, int n) {
		int j,k;
		for(j=m+1,k=i;i<=m&&j<=n;++k) {
			if(a[j]<a[i]) b[k]=a[j++];
			else b[k]=a[i++];
		}
		while(i<=m) b[k++]=a[i++];
		while(j<=n) b[k++]=a[j++];
		
		print(b,n+1);
	}

}
