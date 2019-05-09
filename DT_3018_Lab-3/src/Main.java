
public class Main {

	public static void main(String[] args) {
		
		RPN myRPN = new RPN();
		
		//String[] test_string = {"3", "5", "+", "1", "3", "-", ""/", "="};
		//myRPN.calculator(test_string);
		
		myRPN.calculator(args);

	}

}


// ~/adax/RPN.jar
// Kör: java -jar RPN.jar 1 1 + 5 3 - / =
