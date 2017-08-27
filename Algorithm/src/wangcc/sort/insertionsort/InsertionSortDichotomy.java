package wangcc.sort.insertionsort;

//二分插入
public class InsertionSortDichotomy {
	public static void insertionSortDichotomy(int a[], int n) {
		for (int i = 1; i < n; i++) {
			int get = a[i];
			// 使用二分法找到元素所在的位置
			int left = 0;
			int right = i - 1;

			while (left <= right) {
				int mid = (left + right) / 2;
				if (a[mid] > get) {
					right = mid - 1;// 找到比get大的元素后，还是要继续，到找到第一个比get大的元素
				} else {
					left = mid + 1;// 只要没找到比get大的元素就往后走
				}
			}
			for (int j = i - 1; j >= left; j--) {
				a[j + 1] = a[j];
			}
			a[left] = get;

		}
	}

	// 插入排序是边比较边移动，而二插排序是先找到位置，然后再移动，也就是说减少了移动次数，比较次数还是一样的
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 5, 4, 13, 6, 24, 23, 35, 30 };
		System.out.println("原数组");
		for (int i : a) {
			System.out.print(i + "  ");

		}
		// System.out.println("ll");
		insertionSortDichotomy(a, a.length);

		System.out.println("排序后");

		for (int i : a) {
			System.out.print(i + "  ");

		}
	}
}
