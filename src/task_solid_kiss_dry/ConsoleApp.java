package task_solid_kiss_dry;

import java.util.*;

public class ConsoleApp {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static List<Double> getInput(){
		double a,b;
		System.out.println("Enter first number");
		a = sc.nextDouble();
		System.out.println("Enter second number");;
		b = sc.nextDouble();
		List<Double> fin = new ArrayList<Double>();
		fin.add(a);
		fin.add(b);
		return fin;
	}
	
	public static void main(String[] args) throws Exception{
		int choice = 0;
		List<Double> l = null;
		do {
			System.out.println("Choose your option");
			System.out.println("1.\tAdd");
			System.out.println("2.\tSubtract");
			System.out.println("3.\tMultiply");
			System.out.println("4.\tDivide");
			System.out.println("5.\tExit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				l = getInput();
				System.out.println(MathOperations.add(l.get(0),l.get(1)));
				break;
			case 2:
				l = getInput();
				System.out.println(MathOperations.sub(l.get(0),l.get(1)));
				break;
			case 3:
				l = getInput();
				System.out.println(MathOperations.mul(l.get(0),l.get(1)));
				break;
			case 4:
				l = getInput();
				System.out.println(MathOperations.div(l.get(0),l.get(1)));
				break;
			case 5:
				System.out.println("Thank you!");
				break;
			default:
				System.out.println("Enter valid input ranging from 1 to 5");
				break;
			}
		}while(choice != 5);
	}
}
