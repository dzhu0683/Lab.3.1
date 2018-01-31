import java.util.Arrays;

public class ArrayMethod1 
{

	public static void main(String[] args) 
	{
		//Testing Array
		int [] test1 = {1, 4, 4, 5, 2, 4, 3, 17, 0};
		double [] test2 = {1.1, 4.1, 4.2, 5.0, 2.0, 4.0, 3.0, 17.0, 0.0};
		String [] test3 = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
		
		//Insertion Sort Test
		long start = System.nanoTime();
		insertionSort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test1 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test1));
		
		//Selection Sort Test
		start = System.nanoTime();
		selectionSort(test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test2 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test2));
		
		//Bubble Sort Test
		start = System.nanoTime();
		bubbleSort(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test3 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test3));

	}
	
	public static void insertionSort(int[] list1)
	{
		for(int i = 1; i < list1.length; i++)// for loop that starts at second num in array
		{
			int j = i - 1;
			
			while(j >= 0 && list1[j] > list1[i])//as long as the value at index j in greater than value at index i
			{
				list1[j+1] = list1[j];//replace value after index j with value at index j
				j = j - 1;//j - 1 so you can continue to check all values in the front of i until j reachs 0
			}
			list1[j+1] = list1[i]; //replace value after index j with value at index i
		}
	}
	
	public static void selectionSort(double[] list1)
	{
		for(int i = 0; i < list1.length -1; i++)// for loop to pick out the first number to compare
		{
			int min = i;//set the 1st value as min
			for(int j = i+1; j < list1.length; j++)//for loop to pick out the num that comes after
			{
				if(list1[j] < list1[min])//if the second number is less than first
				{
					min = j;//if it is set that second number as the new min
				}
			}
			//now we swap the two values
			double temp = list1[min];//create temporay variable to store min
			list1[min] = list1[i];//replace the second value with the first value
			list1[i] = temp;//place the min in the first index
		}
	}
	
	public static void bubbleSort(String[] list1)
	{
		String Temp = 
		int swap = 0;
		while(swap > 0)
		{
			for(int i = 0; i < list1.length; i++)
			{
				for(int j = 1; j < list1.length -1; j++)
				{
					list1[i].compareTo(list1[j]);
				}
			}
		}
	}
}