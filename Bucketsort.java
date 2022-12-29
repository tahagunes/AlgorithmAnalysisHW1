package hw1;

//https://www.geeksforgeeks.org/bucket-sort-2/
//kaynakcam burasi
import java.util.*;
import java.util.Collections;

public class Bucketsort {

	
	static void bucketSort(int arr[], int n)
	{
		if (n <= 0)
			return;
		else n=5;
		int max = arr.length-1;
		double sort=max/n;
		// 1) Create n empty buckets
		@SuppressWarnings("unchecked")
		Vector<Integer>[] buckets = new Vector[n];

		for (int i = 0; i < n; i++) {
			buckets[i] = new Vector<Integer>();
		}

		// 2) Put array elements in different buckets
		for (int i = 0; i < n; i++) {
			double idx = arr[i] / sort;
			if((int)idx>=5)idx=4;
			buckets[(int) idx].add(arr[i]);
		}

		// 3) Sort individual buckets
		for (int i = 0; i < n; i++) {
			Collections.sort(buckets[i]);
		}

		// 4) Concatenate all buckets into arr[]
		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < buckets[i].size(); j++) {
				
				arr[index++] = buckets[i].get(j);
			}
		}
	}

	
}

