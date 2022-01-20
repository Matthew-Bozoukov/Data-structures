public class queue<T> extends stack<T>{
		private stack<T> st1;
		private stack<T> st2;
		private int size1;
		private int size2;

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
		for(int i=0; i<size1; i++) {
			st2.push(st1.pop());
			size1-=1;
		}
		return st2.pop();
		}else {
			return st2.pop();
	
		}
		
	}
	
	
	
	
	
	public String toString() {
	return st2.toString( )+ st1.toString();
	
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stack<Integer> st1=new stack<Integer>();
		//stack<Integer> st2= new stack<Integer>();
		
	queue<Integer> qu = new queue<Integer>();
		qu.add(1);
	qu.add(2);
	qu.add(3);
	qu.add(4);
	qu.remove();
	
	
	
	
		
	
		
		
	System.out.println(qu);
		
		
	}
	}


