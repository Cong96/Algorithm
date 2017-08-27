package wangcc.sort;

public class BubbleSort {
	public void swap(int A[], int a, int b) {
		int temp;
		temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}

	public void bubble(int a[]) {
		int length = a.length;
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
					// int tmp = a[j];
					// a[j] = a[j + 1];
					// a[j + 1] = tmp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 2, 5, 4, 13, 6, 24, 23, 35, 30 };
		System.out.println("原数组");
		for (int i : a) {
			System.out.print(i + "  ");

		}
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubble(a);
		System.out.println("排序后");
		for (int i : a) {
			System.out.print(i + "  ");

		}
	}
}
