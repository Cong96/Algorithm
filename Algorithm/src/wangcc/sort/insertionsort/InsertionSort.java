package wangcc.sort.insertionsort;

/**
 * @ClassName: InsertionSort
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author wangcc
 * @date 2017年8月27日 下午8:32:50 对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * 
 *       　　插入排序在实现上，通常采用in-place排序（即只需用到O(1)的额外空间的排序），因而在从后向前扫描过程中，
 *       需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
 */
public class InsertionSort {
	public static void insertionSort(int a[], int n) {
		// 首先有序序列就是第一个元素，
		for (int i = 1; i < n; i++) {
			int j = i - 1;
			int get = a[i];
			while (j >= 0 && a[j] > get) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = get;
		}
	}

	/*
	 * int get = a[i]; // 右手抓到一张扑克牌 int j = i - 1; // 拿在左手上的牌总是排序好的 while (j >=
	 * 0 && a[j] > get) // 将抓到的牌与手牌从右向左进行比较 { a[j + 1] = a[j]; //
	 * 如果该手牌比抓到的牌大，就将其右移 j--; } a[j + 1] = get;
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 5, 4, 13, 6, 24, 23, 35, 30 };
		System.out.println("原数组");
		for (int i : a) {
			System.out.print(i + "  ");

		}
		insertionSort(a, a.length);
		System.out.println("排序后");
		for (int i : a) {
			System.out.print(i + "  ");

		}
	}

}
