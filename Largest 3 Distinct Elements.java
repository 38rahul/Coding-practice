/*
Find the largest three distinct elements in an array
Input: arr[] = {10, 4, 3, 50, 23, 90};
Output: 90, 50, 23

*/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int arr[] = {10, 4, 3, 50, 23, 90};
// 		Arrays.sort(arr);
// 		System.out.print(arr[arr.length-1]+", ");
// 		System.out.print(arr[arr.length-2]+", ");
// 		System.out.print(arr[arr.length-3]+" ");

    int i, first , second ,third ;
		first = second = third = Integer.MIN_VALUE;
		if(arr.length<3){
		    System.out.println("Invalid Input");
		}
		else{
		    for(i=0;i<arr.length;i++){
		        if(arr[i]>first){
		            third=second;
		            second=first;
		            first=arr[i];
		        }
		        else if(arr[i]>second){
		            third =second;
		            second=arr[i];
		        }
		        else if(arr[i]>third){
		            third=arr[i];
		        }
		    }
		}
		System.out.print("first :"+ first+" ");
			System.out.print("second :"+ second+" ");
				System.out.print("third :"+ third+" ");
		
		
	}
	
}
