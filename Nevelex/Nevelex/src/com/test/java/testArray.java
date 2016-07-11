package com.test.java;

import java.util.Arrays;

//This class is used to find a missing integer in a given unsorted integer array having integers from 1 to 1000000
public class testArray {

	public static void main(String[] args) {
		
		//Initializing an integer array with size 1000000
		int intArray[]= new int[1000000];
		
		//Storing integers into the array
		for(int i = 0;i<1000000;i++)
		{
			intArray[i]= i+1;
			
		}
		
		//Removing an integer 6237 and replacing it with 1000001 for testing purpose
		intArray[6236]=1000001;
		
		//Sorting the array
		Arrays.sort(intArray);
		int a=1;
		
		//Looping over the array to find the missing integer
		for(int a1:intArray)
		{
			if (a1==a)
				a++;
			else
				break;
		}
		
		if (a==intArray.length+1)
			System.out.println("There is no integer missing");
		else
			System.out.println("The missing element is "+a);
	}

}
