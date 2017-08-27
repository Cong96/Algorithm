package wangcc.sort.insertionsort;

/**
 * @ClassName: ShellSort
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author wangcc
 * @date 2017年8月27日 下午10:19:54 希尔排序，也叫递减增量排序，是插入排序的一种更高效的改进版本。希尔排序是不稳定的排序算法。
 * 
 *       　　希尔排序是基于插入排序的以下两点性质而提出改进方法的：
 * 
 *       插入排序在对几乎已经排好序的数据操作时，效率高，即可以达到线性排序的效率 但插入排序一般来说是低效的，因为插入排序每次只能将数据移动一位
 *       　　希尔排序通过将比较的全部元素分为几个区域来提升插入排序的性能
 *       。这样可以让一个元素可以一次性地朝最终位置前进一大步。然后算法再取越来越小的步长进行排序
 *       ，算法的最后一步就是普通的插入排序，但是到了这步，需排序的数据几乎是已排好的了（此时插入排序较快）。
 *       　　假设有一个很小的数据在一个已按升序排好序的数组的末端
 *       。如果用复杂度为O(n^2)的排序（冒泡排序或直接插入排序），可能会进行n次的比较和交换才能将该数据移至正确位置
 *       。而希尔排序会用较大的步长移动数据，所以小数据只需进行少数比较和交换即可到正确位置。
 */
public class ShellSort {
	public static void shellSort(int a[], int n) {
		for (int gap = n / 2; gap > 0; gap /= 2) {
			for (int i = 0; i < gap; i++) {
				for (int j = i + gap; j < n; j += gap) {
					int tmp = a[j];
					int k = j - gap;
					while (k >= 0 && a[k] > tmp) {
						a[k + gap] = a[k];
						k -= gap;
					}
					a[k + gap] = tmp;
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 5, 4, 13, 6, 24, 23, 35, 30 };
		System.out.println("原数组");
		for (int i : a) {
			System.out.print(i + "  ");

		}
		// System.out.println("ll");
		shellSort(a, a.length);

		System.out.println("排序后");

		for (int i : a) {
			System.out.print(i + "  ");

		}
	}

}
