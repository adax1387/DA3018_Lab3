

public class RPN {

	public static void calculator(String[] args) {
		
		Stack stack = new Stack();
		
		for ( String c: args) {
			
			//System.out.println("In for, c=" + c);
			
			switch (c) {
			
			case "+":
				stack.push(stack.pop() + stack.pop()); // adds top stack elmnts, pushes the sum
				break;
			case "-":
				stack.push(- stack.pop() + stack.pop());
				break;
			case "/":
				stack.push(stack.pop() / stack.pop());
				break;
			case "*":
				stack.push(stack.pop() * stack.pop());
				break;
			case "=":
				double result = 0.0;
				int factors = stack.top;
				for (int i = 0; i < factors; i++) {
					result += stack.stack[i];
				}
				System.out.println("\nResult:" + result); // prints top elmnt of stack
				break;
			default: // should catch doubles, if correct input
				Double temp = Double.parseDouble(c); // convert string to double
				stack.push(temp);
				break;
			}
		}

	}

}
