
public class Stack {
	
	// Methods
	// Instance methods
	
	public double[] stack;
	public int top;
	
	public boolean is_empty() {
		if ( top == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void push(double x) {
		stack[top] = x;
		top++;
	}
	
	public double pop() {
		if (this.is_empty()) {
			return 0;
		} else {
			top--;
			double pop_val = stack[top];
			return pop_val;
		}
	}
	
	// Constructor
	// #1 - Default constructor
	Stack() {
		stack = new double[1000];
		top = 0;	
	}
	
}
