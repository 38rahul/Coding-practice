
class MyArrayList {
	
	Object arr[];   // object array to store all the elements that we are going to add in the array list
	int s;
	int capacity;
	
	public MyArrayList(){
		
		s=0;
		capacity=10;
		arr= new Object[capacity];
	}
	
	public void add(Object item){
		arr[s++] = item;
	}
	
	public Object get(int index){
		return arr[index];
	}
	
	public int size(){
		return s;
	}
	public String isEmpty(){
		if(s==0)
			return "Yes, It is Empty";
		else 
			return "No, It is not an Empty";
	}
	
}


public class Main{
	public static void main(String args[]){
		
		MyArrayList l= new MyArrayList();
		System.out.println(l.isEmpty());
		l.add(10);
		l.add(20);
		l.add(30);
		l.add("Vishnu priya");
		l.add("Rahul");
		l.add(null);
		l.add(30.55);
		l.add('f');
	
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		System.out.println(l.isEmpty());
		
	}
}
/////////////////////////

// Generic ArrayList

class MyArrayList<T> {
	
	Object arr[];   // object array to store all the elements that we are going to add in the array list
	int s;
	int capacity;
	
	public MyArrayList(){
		
		s=0;
		capacity=10;
		arr= new Object[capacity];
	}
	
	// Constructor 2
	public MyArrayList(int c){
		
		s=0;
		capacity=c;
		arr= new Object[capacity];
	}
	
	public void add(T item){
		arr[s++] = item;
	}
	
	public T get(int index){
		return (T) arr[index];
	}
	
	public int size(){
		return s;
	}
	
	public String isEmpty(){
		if(s==0)
			return "Yes, It is Empty";
		else 
			return "No, It is not Empty";
	}
	 public int currentCapacity(){
		return capacity;
	}
	
}


public class Main{
	public static void main(String args[]){
		
		MyArrayList<Integer> l= new MyArrayList<Integer>();
		//System.out.println(l.currentCapacity());
		
		//MyArrayList l2= new MyArrayList(20);
		//System.out.println(l2.currentCapacity());
		
		for(int i=1;i<=5;i++){
			l.add(i);
		}
		//l.add("Rahul");
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		
		
}
}
////////////////////////////////////

// Generic ArrayList
// Dynamic Capacity facility

class MyArrayList<T> {
	
	Object arr[];   // object array to store all the elements that we are going to add in the array list
	int s;
	int capacity;
	
	public MyArrayList(){
		
		s=0;
		capacity=10;
		arr= new Object[capacity];
	}
	
	// Constructor 2
	public MyArrayList(int c){
		
		s=0;
		capacity=c;
		arr= new Object[capacity];
	}
	
	public void add(T item){   // Grow the size of Array
		if(s==capacity){
			object brr[]= new Object(s);
			for(int i=0;i<s;i++){
				brr[i] =arr[i];
			}
			capacity =capacity*3/2+1;
			arr= new Object[capacity];
			for(int i=0;i<s;i++)
				arr[i]=brr[i];
		}
		arr[s++] = item;
	}
	
	public T get(int index){
		return (T) arr[index];
	}
	
	public int size(){
		return s;
	}
	
	public String isEmpty(){
		if(s==0)
			return "Yes, It is Empty";
		else 
			return "No, It is not Empty";
	}
	 public int currentCapacity(){
		return capacity;
	}
	
}


public class Main{
	public static void main(String args[]){
		
		MyArrayList<Integer> l= new MyArrayList<Integer>();
		//System.out.println(l.currentCapacity());
		
		//MyArrayList l2= new MyArrayList(20);
		//System.out.println(l2.currentCapacity());
		
		System.out.println(l.currentCapacity());
		for(int i=1;i<=10;i++){
			l.add(i);
		}
		//l.add("Rahul");
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		
		System.out.println(l.currentCapacity());
		
		
}
}