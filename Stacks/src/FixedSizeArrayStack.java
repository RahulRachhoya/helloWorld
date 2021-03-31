
public class FixedSizeArrayStack {
	//Length of the array used to implement the stack
	protected int capacity;
	//default capacity
	public static final int CAPACITY=10;
	//array is used to implement the stack
	protected int[] stackRep;
	//Index of the top element of the stack in the array
	protected int top=-1;
	//Initilization  the stack to use an array of default length
	public FixedSizeArrayStack() {
		this(CAPACITY);
	}
	public FixedSizeArrayStack(int cap) {
		capacity=cap;
		stackRep = new int[capacity];
	}
	public int size() {
		return (top+1);
	}
	public boolean isEmpty() {
		return (top<0);
	}
	public void push(int data) throws Exception{
		if(size()==capacity)
			throw new Exception("Stack is Full");
		stackRep[++top]=data;
	}
	public int top() throws Exception{
		if(isEmpty())
			throw new Exception("Stack is Empty");
		return stackRep[top];
	}
	public int pop() throws Exception{
		int data;
		if(isEmpty())
			throw new Exception("Stack is Empty");
		data=stackRep[top];
		stackRep[top--]=Integer.MIN_VALUE;
		return data;
	}
	public String toString() {
		String s;
		s="[";
		if(size()>0)
			s+=stackRep[0];
		if(size()>1)
			for(int i=1; i<=size(); i++) {
				s+=","+stackRep[i];
			}
		return s+"]";
	}
}
