package wangcc.sort.choosesort;

/**
 * @ClassName: HeapSort
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author wangcc
 * @date 2017年8月27日 下午7:36:21 讨论堆排序，就必须要对数据结构有所了解，堆排序是基于一种叫做堆的数据结构
 *       堆分为最小堆和最大堆，堆是一种类似树的数据结构
 */
public class HeapSort {
	/*
	 * 堆排序 先建立堆，然后将堆变成最小堆 删除堆顶元素，将最后一个元素放到堆顶，然后再将该堆变成最小堆，这就是堆排序的思路。
	 */

	/*
	 * (最小)堆的向下调整算法
	 * 
	 * 注：数组实现的堆中，第N个节点的左孩子的索引值是(2N+1)，右孩子的索引是(2N+2)。
	 * 其中，N为数组下标索引值，如数组中第1个数对应的N为0。
	 * 
	 * 参数说明： a -- 待排序的数组 start -- 被下调节点的起始位置(一般为0，表示从第1个开始) end --
	 * 截至范围(一般为数组中最后一个元素的索引)
	 */

	public static void minHeapDown(int a[], int start, int end) {
		int c = start;// 当前节点的位置
		int l = 2 * c + 1;
		int tmp = a[c];
		for (; l <= end; c = l, l = 2 * l + 1) {
			if (l < end && a[l] > a[l + 1]) {// 找到左右节点中更小的点
				l++;
			}
			if (tmp <= a[l]) {// 当前节点与较小节点比较，看是否需要换位置
				break;
			} else {
				a[c] = a[l];
				a[l] = tmp;
			}
		}

	}

	public static void maxHeapDown(int[] a, int start, int end) {
		int c = start; // 当前(current)节点的位置
		int l = 2 * c + 1; // 左(left)孩子的位置
		int tmp = a[c]; // 当前(current)节点的大小

		for (; l <= end; c = l, l = 2 * l + 1) {
			// "l"是左孩子，"l+1"是右孩子
			if (l < end && a[l] < a[l + 1])
				l++; // 左右两孩子中选择较大者，即m_heap[l+1]
			if (tmp >= a[l])
				break; // 调整结束
			else { // 交换值
				a[c] = a[l];
				a[l] = tmp;
			}
		}
	}

	/*
	 * 堆排序(从小到大)
	 * 
	 * 参数说明： a -- 待排序的数组 n -- 数组的长度
	 */
	public static void heapSortAsc(int[] a, int n) {
		int i, tmp;

		// 从(n/2-1) --> 0逐次遍历。遍历之后，得到的数组实际上是一个(最大)二叉堆。
		for (i = n / 2 - 1; i >= 0; i--)
			maxHeapDown(a, i, n - 1);

		// 从最后一个元素开始对序列进行调整，不断的缩小调整的范围直到第一个元素
		for (i = n - 1; i > 0; i--) {
			// 交换a[0]和a[i]。交换后，a[i]是a[0...i]中最大的。
			tmp = a[0];
			a[0] = a[i];
			a[i] = tmp;
			// 调整a[0...i-1]，使得a[0...i-1]仍然是一个最大堆。
			// 即，保证a[i-1]是a[0...i-1]中的最大值。
			maxHeapDown(a, 0, i - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 5, 4, 13, 6, 24, 23, 35, 30 };
		System.out.println("原数组");
		for (int i : a) {
			System.out.print(i + "  ");

		}
		heapSortAsc(a, a.length);
		System.out.println("排序后");
		for (int i : a) {
			System.out.print(i + "  ");

		}
	}

}
