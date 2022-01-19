


	public class queue<T> extends stack<T>{
		private stack<T> st1;
		private stack<T> st2;
		private int size;

	public queue(stack<T> st1, stack<T> st2) {
		this.st1=st1;
		this.st2=st2;
		size=0;
		
		
	}
	public void add(T el) {
	st1.push(el);
	size+=1;
	
	
		}
	
	public T remove() {
		if(st2.isEmpty()) {
			T temp=st1.pop();
			size-=1;
			st2.push(temp);
			return st2.pop();
		}else {
			return st2.pop();
		}
		
	}
	public String toString() {
		return null;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack<Integer> st1=new stack<Integer>();
		stack<Integer> st2= new stack<Integer>();
		
		queue<Integer> qu = new queue<Integer>(st1, st2);
		qu.add(1);
		qu.add(2);
		qu.remove();
		
		
	}

}

