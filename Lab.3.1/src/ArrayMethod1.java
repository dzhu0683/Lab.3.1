public class ArrayMethod1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}
	
	public static int binarysearch(int [] list1, int query)
	{
		int L = 0;
		int R = list1.length - 1;
		while(L <= R)
		{
			int mid = L + (R-L)/2;
			if(list1[mid] > query)
			{
				L = mid;
			}
			if (list1[mid] < query)
			{
				R = mid;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
	
	public static void insertionSort(int[] list1)
	{
		
	}
	
	public static void selectionSort(double[] list1)
	{
		
	}
	
	public static void bubbleSort(String[] list1)
	{
		for(int x = list1.length; x >= 0; x++)
		{
			
		}
	}

}