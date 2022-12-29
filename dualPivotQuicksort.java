package hw1;

//https://www.geeksforgeeks.org/dual-pivot-quicksort/
//kaynakcam burasi

public class dualPivotQuicksort{
	public dualPivotQuicksort(int [] list)
    {
        sort(list,0,list.length);

    }
	public static void sort(int[] array, int startIndex, int endIndex)
    {
        dualPivotQuicksort(array, startIndex, endIndex - 1, 3);
    }

    public static void swaplist(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void dualPivotQuicksort(int[] a, int left,int right, int middle)
    {
        int len = right - left;
        if (len < 27)
        { 
            for (int i = left + 1; i <= right; i++)
            {
                for (int j = i; j > left && a[j] < a[j - 1]; j--)
                {
                    swaplist(a, j, j - 1);
                }
            }
            return;
        }
        int third = len / middle;
        // "medians"
        int m1 = left + third;
        int m2 = right - third;
        if (m1 <= left)
        {
            m1 = left + 1;
        }
        if (m2 >= right)
        {
            m2 = right - 1;
        }
        if (a[m1] < a[m2])
        {
            swaplist(a, m1, left);
            swaplist(a, m2, right);
        }
        else
        {
            swaplist(a, m1, right);
            swaplist(a, m2, left);
        }
        
        int pivot1 = a[left];
        int pivot2 = a[right];
       
        int less = left + 1;
        int great = right - 1;
       
        for (int k = less; k <= great; k++)
        {
            if (a[k] < pivot1)
            {
                swaplist(a, k, less++);
            }
            else if (a[k] > pivot2)
            {
                while (k < great && a[great] > pivot2)
                {
                    great--;
                }
                swaplist(a, k, great--);
                if (a[k] < pivot1)
                {
                    swaplist(a, k, less++);
                }
            }
        }
        
        int dist = great - less;
        if (dist < 13)
        {
           middle++;
        }
        swaplist(a, less - 1, left);
        swaplist(a, great + 1, right);
        
        dualPivotQuicksort(a, left, less - 2, middle);
        dualPivotQuicksort(a, great + 2, right, middle);

        if (dist > len - 13 && pivot1 != pivot2)
        {
            for (int k = less; k <= great; k++)
            {
                if (a[k] == pivot1)
                {
                    swaplist(a, k, less++);
                }
                else if (a[k] == pivot2)
                {
                    swaplist(a, k, great--);
                    if (a[k] == pivot1)
                    {
                        swaplist(a, k, less++);
                    }
                }
            }
        }
        
        if (pivot1 < pivot2)
        {
            dualPivotQuicksort(a, less, great, middle);
        }
    }
}