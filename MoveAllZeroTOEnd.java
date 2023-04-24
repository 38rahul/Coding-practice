/**
 * Move all zeroes to end of array
Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};

Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
Output : arr[] = {1, 2, 3, 6, 0, 0, 0};

**/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
		for(int i=0,j=arr.length-1;i<j;){
		    if(arr[i]!=0){
		        i++;
		    }
		    else if(arr[i]==0 && arr[j]==0 ){
		        j--;
		    }
		    else if(arr[i]==0 &&arr[j]!=0 ){
		        int temp = arr[i];
		        arr[i]=arr[j];
		        arr[j]=temp;
		        j--;
		        i++;
		    }
		}
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}


// Approach 2

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int arr[] = {1, 2, 0, 0, 0, 3, 6};
		moveAll0toEnd(arr);
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
	public static void moveAll0toEnd(int arr[]){
	    
	    int count =0;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]!=0){
	            arr[count++] =arr[i];
	        }
	    }
	    while(count<arr.length){
	        arr[count++] =0;
	    }
	    
	}
}

