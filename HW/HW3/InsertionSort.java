package HW3;

import sun.tools.jar.resources.jar;

/**
 * @author Xiaoxue Du
 *
 */
public class InsertionSort implements MySort
{
	@Override
	public void sort(int num[])
	{
		int n = num.length;
		int item, j;
		for (int i = 1; i < n; i++)
		{
			item = num[i];
			for (j = i - 1; j >= 0 && num[j] > item; j--)
			{
				num[j + 1] = num[j];
			}
			num[j + 1] = item;
		}
	}
}
