/*
Author: Darren Zhu
2/1/18
Lab 3.1
References: https://www.geeksforgeeks.org/selection-sort/
http://www.sanfoundry.com/java-program-implement-insertion-sort/
*/
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
	
	public static void insertionSort(int[] list1)//start from beginning and insert each value in correct position one by one
	{
		for(int i = 1; i < list1.length; i++)// for loop that starts at index 1 in array
		{
			int j = i;// set j equal to i
			int temp = list1[i];// temporary store the value at index i in variable temp
			while(j > 0 && temp < list1[j-1])// run following as long as j > 0 and the value of temp is less than value at index j-1
			{
				list1[j] = list1[j-1];// swap by setting value at index j to value at the index before it
				j = j - 1;// we use this in order to cycle through all values that comes before index i to make sure you have check all of them
			}
			list1[j] = temp;// replace value at index j with store value in temp integer
		}
	}
	
	public static void selectionSort(double[] list1)//find min to place in front
	{
		for(int i = 0; i < list1.length -1; i++)// for loop to pick out the first number to compare
		{
			int min = i;//set the 1st value as min
			for(int j = i+1; j < list1.length; j++)//for loop to pick out the num that comes after
			{
				if(list1[j] < list1[min])//check if the second number is less than first
				{
					min = j;//if it is set that second number as the new min
				}
			}
			//now we swap the two values
			double temp = list1[min];//create temporary variable to store min
			list1[min] = list1[i];//replace the second value with the first value
			list1[i] = temp;//place the min in the first index
		}
	}
	
	public static void bubbleSort(String[] list1)// swap first two then next two, ect. Repeat until it is all sorted
	{
		String temp;// temporary variable to store strings
		boolean swap = true;// boolean to determine if sort is finished
		while(swap)
		{
			swap = false;
			for(int i = 0; i < list1.length - 1; i++)//for loop that loops through array
			{
				int j = i + 1; //set j as the index after i
				if(list1[i].compareTo(list1[j])>0)//use compareto method to determine alphabetical order
					//compareto compares two strings lexicographically
					//result is < 0 if it is in alphabetical order
					//result is 0 if they are the same letter
					//result is > 0 if they are not sorted in alphabetical order
				{
					temp = list1[i];//assign the temp string with string at index i
					list1[i] = list1[j];//replace string at index i with index j
					list1[j] = temp;//replace string at index j with the temp string
					swap = true;//setting swap to true will exit while loop and finishing the sort
				}
			}
		}
	}
}