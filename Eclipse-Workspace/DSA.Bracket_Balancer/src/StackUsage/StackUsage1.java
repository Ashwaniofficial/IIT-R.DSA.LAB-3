package StackUsage;

import java.util.Iterator;
import java.util.Stack;

public class StackUsage1 {
public static void main(String[] args) {
		
		Stack<Integer> numbers = new Stack<>();
		
		pushElements(numbers);
		popElements(numbers);
		iterateElements(numbers);
	}
	
	private static void pushElements(Stack<Integer> numbers) {
		
		numbers.push(10);
		numbers.push(20);
		numbers.push(30);
		numbers.push(40);
		numbers.push(50);		
	}
	
	private static void popElements(Stack<Integer> numbers) {
		
		Integer aNumber = numbers.pop();
		System.out.println("Popped Out Element is " + aNumber);
		
		aNumber = numbers.pop();
		System.out.println("Popped Out Element is " + aNumber);

	}
	
	private static void iterateElements(Stack<Integer> numbers) {
	
		System.out.println();
		System.out.println("Iterating over the elements");
		
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
	}
}



