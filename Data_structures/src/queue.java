public class queue<T> extends stack<T>{
		private stack<T> st1;
		private stack<T> st2;
		private int size1;
		

	public queue() {
		st1= new stack<T>();
		st2= new stack<T>();
		size1=0;
		
	}
		public void add(T el) {
			st1.push(el);
			size1+=1;
			
			
			
		}
	public T remove() {
		if(st2.isEmpty()) {
		while(!st1.isEmpty()) {
			st2.push(st1.pop());
			size1-=1;
		}
		
		
	
		}
		return st2.pop();
		
	}
	
	
	
	
	
	public String toString() {
	return st2.toString();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	queue<Integer> qu = new queue<Integer>();
		qu.add(3);
		qu.add(2);
		qu.add(1);
		System.out.println(qu.remove());
		System.out.println(qu.remove());
		System.out.println(qu.remove());
		
		
	}
	}
