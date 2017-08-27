package wangcc.sort.choosesort;


/**
 * @ClassName: ChooseSort
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author wangcc
 * @date 2017年8月27日 下午7:15:53
 *       选择排序也是一种简单直观的排序算法。它的工作原理很容易理解：初始时在序列中找到最小（大）元素，放到序列的起始位置作为已排序序列
 *       ；然后，再从剩余未排序元素中继续寻找最小（大）元素，放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 * 
 *       　　注意选择排序与冒泡排序的区别：冒泡排序通过依次交换相邻两个顺序不合法的元素位置，从而将当前最小（大）元素放到合适的位置；
 *       而选择排序每遍历一次都记住了当前最小（大）元素的位置，最后仅需一次交换操作即可将其放到合适的位置。
 */
public class ChooseSort {
	public void swap(int A[], int a, int b) {
		int temp;
		temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}

	public void selectionSort(int a[]) {
		/*
		 * 将序列分为两部分，一部分是已排序好的，另一部分是未排序的,每一次和已排好序的最后一个元素相比较
		 * 然后找到未排好序中最小的那个放在已排序好的尾部
		 */
		int length = a.length;
		for (int i = 0; i < length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			if (min != i) {
				swap(a, min, i);
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
		ChooseSort sort = new ChooseSort();
		sort.selectionSort(a);
		System.out.println("排序后");
		for (int i : a) {
			System.out.print(i + "  ");

		}
	}
}
