import java.util.ArrayList;

public class stack<T> {
private ArrayList<T> data; //int[] data, String[] mystr
private int size; // # of elements
	public stack(){
		data=new ArrayList<T>();
		size=0;
		
		
		
	}
	
	public int size() {
		return size;
	}
	public void push(T el) {
		data.add(el);
		size+=1;//update size
	}
	public T pop() {
		 //remove and return the element
		data.remove(size-1);
		return data.get(size-1);

		//update other relevant info
		
	
	}
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}else {
			return false;
		}
	}
	public String toString() {
		
		return data.get(data.size()-1)+ "";
	}
	//public void main(String[] //args) {
			// TODO Auto-generated method stub
			//add lines of code to test implementation of stack works
			
			//stack st = new stack();
			//st.toString();
		
}





	//push - add element
	
	//pop remove and return element from the list
	//should be from he "top" of the list
	//public void main(String[] args) {
		// TODO Auto-generated method stub
		//add lines of code to test implementation of stack works
		
		//stack st = new stack();
		//st.toString();
	
		

