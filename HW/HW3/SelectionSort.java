package HW3;

import sun.security.util.Length;

/**
 * @author XiaoxueDu
 *
 */
public class SelectionSort implements MySort
{
	@Override
	public void sort(int num[])
	{
		int min, index, i, j, temp;
		int n = num.length;
		for (i = 0; i < n; i++)
		{
			min = num[i];
			index = i;
			for (j = i + 1; j < n; j++)
			{
				if (num[j] < min)
				{
					min = num[j];
					index = j;
				}
			}
			if (i != index)
			{
				temp = num[i];
				num[i] = num[index];
				num[index] = temp;
			}
		}
	}
}
