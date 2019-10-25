package HW3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestSort
{

	public static void main(String[] args)
	{
		int[] elements1 = new int[] { 43, 15, 32, 7, 12, 40, 2, 7 };
		int[] elements2 = new int[] { 43, 15, 32, 7, 12, 40, 2, 7 };
		InsertionSort insertionSort = new InsertionSort();
		SelectionSort selectionSort = new SelectionSort();
		insertionSort.sort(elements1);
		System.out.println(Arrays.toString(elements1));
		selectionSort.sort(elements2);
		System.out.println(Arrays.toString(elements2));

		List<int[]> list1 = getArray(3000);
		printTime(list1, insertionSort);
		List<int[]> list2 = getArray(600);
		printTime(list2, insertionSort);
		List<int[]> list3 = getArray(9000);
		printTime(list3, insertionSort);

		List<int[]> list4 = getArray(3000);
		printTime(list4, selectionSort);
		List<int[]> list5 = getArray(600);
		printTime(list5, selectionSort);
		List<int[]> list6 = getArray(9000);
		printTime(list6, selectionSort);
	}

	public static List<int[]> getArray(int len)
	{
		List<int[]> res = new ArrayList<>();
		int[] arrayRandom = new int[len];
		int[] arrayAsc = new int[len];
		int[] arrayDesc = new int[len];
		for (int i = 0; i < len; i++)
		{
			arrayRandom[i] = (int) Math.random() * 3000;
			arrayAsc[i] = i;
			arrayDesc[i] = len - i;
		}
		res.add(arrayRandom);
		res.add(arrayAsc);
		res.add(arrayDesc);
		return res;
	}

	public static void printTime(List<int[]> list, MySort mySort)
	{
		System.out.println("===========Begin printing===========");
		System.out.println("len=" + list.get(0).length + ", sort=" + mySort.getClass().getSimpleName());
		System.out.println(new Date().getTime());
		mySort.sort(list.get(0));
		System.out.println(new Date().getTime());
		mySort.sort(list.get(1));
		System.out.println(new Date().getTime());
		mySort.sort(list.get(2));
		System.out.println(new Date().getTime());
		System.out.println("============End printing============");
	}
}
