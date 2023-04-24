/*
Find Second largest element in an array

Input: arr[] = {12, 35, 1, 10, 34, 1}
Output: The second largest element is 34.


Input: arr[] = {10, 5, 10}
Output: The second largest element is 5.


Input: arr[] = {10, 10, 10}
Output: The second largest does not exist.
Explanation: Largest element of the array 
is 10 there is no second largest element

*/
import java.util.*;

public class Main
{
    public static int secondLargestElement(int arr[]){
        int sum=0;
         int firstLargest=Integer.MIN_VALUE, secondLargest=Integer.MIN_VALUE;
         
         if(arr.length <2)
          return -1;
          
      
	    for(int i=0;i<arr.length;i++)
	    {
	        sum+=arr[i];
	        if(arr[i]>firstLargest)
	        {
	        secondLargest = firstLargest;
	        firstLargest = arr[i];
	        }
	       else if(arr[i]!=firstLargest && arr[i]>secondLargest){
	            secondLargest = arr[i];
	        }
	   }
	   if((sum/arr.length)==arr[0])
	    return -1;
	   return secondLargest;   
    }
    
        
    
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	
	int arr[] = {10,10,10};
	
	System.out.println(secondLargestElement(arr));
		
	
	}
	
}
=================================================

/*
Find Second largest element in an array

Input: arr[] = {12, 35, 1, 10, 34, 1}
Output: The second largest element is 34.


Input: arr[] = {10, 5, 10}
Output: The second largest element is 5.


Input: arr[] = {10, 10, 10}
Output: The second largest does not exist.
Explanation: Largest element of the array 
is 10 there is no second largest element

*/
import java.util.*;

public class Main
{
    public static int secondLargestElement(int arr[]){
         
          Set<Integer> set1 = new TreeSet<Integer>();    
          for(int i=0;i<arr.length;i++)
          {
              set1.add(arr[i]);
          }
          System.out.println(set1+" ");
          if(set1.size()==1)
           return -1;
           Integer[] set2 = set1.toArray(new Integer[set1.size()]);
           return set2[set1.size()-2];
    }
    
        
    
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	
	int arr[] = {1,1};
	
	System.out.println(secondLargestElement(arr));
		
	
	}
	
}
