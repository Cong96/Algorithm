package wangcc.sort;

/**
 * @ClassName: CocktailSort
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author wangcc
 * @date 2017年8月27日 下午6:58:55
 *       　鸡尾酒排序，也叫定向冒泡排序，是冒泡排序的一种改进。此算法与冒泡排序的不同处在于从低到高然后从高到低
 *       ，而冒泡排序则仅从低到高去比较序列里的每个元素。他可以得到比冒泡排序稍微好一点的效能。
 */
public class CocktailSort {
	public void swap(int A[], int a, int b) {
		int temp;
		temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}

	public void cocktailSort(int a[]) {
		int left = 0;
		int right = a.length - 1;
		while (left < right) {
			for (int i = left; i < right; i++) {
				if (a[i] > a[i + 1]) {
					swap(a, i, i + 1);
				}
			}
			right--;
			for (int j = right; j > left; j--) {
				if (a[j] < a[j - 1]) {
					swap(a, j - 1, j);
				}
			}
			left++;
		}

	}

	public static void main(String[] args) {
		int a[] = { 2, 5, 4, 13, 6, 24, 23, 35, 30 };
		System.out.println("原数组");
		for (int i : a) {
			System.out.print(i + "  ");

		}
		CocktailSort sort = new CocktailSort();
		sort.cocktailSort(a);
		System.out.println("排序后");
		for (int i : a) {
			System.out.print(i + "  ");

		}
	}
}
