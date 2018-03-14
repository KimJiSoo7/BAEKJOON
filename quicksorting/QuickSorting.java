import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class QuickSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// { 4, 54, 2, 8, 63, 7, 55, 56 }
		//
		int[] unsorted = { 2, 10, 30, 69, 16, 8, 31, 22 };
		int left = 0;
		int right = unsorted.length - 1;

		System.out.println("Before Sorting");
		for (int i = 0; i < unsorted.length; i++) {
			System.out.print(unsorted[i] + " ");
		}
		quickSorting(unsorted, left, right);
		System.out.println("");

		System.out.println("After Sorting");
		for (int i = 0; i < unsorted.length; i++) {
			System.out.print(unsorted[i] + " ");
		}

	}

	public static void swap(int[] arr, int iOld, int iNew) {
		int temp = arr[iOld];
		arr[iOld] = arr[iNew];
		arr[iNew] = temp;
	}

	public static void quickSorting(int[] arr, int l, int r) {
		int left = l;
		int right = r;
		int pivot = arr[(left + right) / 2];

		while (true) {
			while (arr[left] < pivot)
				left++;
			while (arr[right] > pivot)
				right--;

			if (left >= right)
				break;
			swap(arr, left, right);
		}

		if (l < right)
			quickSorting(arr, l, left - 1);
		if (r > left)
			quickSorting(arr, left + 1, r);
	}

}
