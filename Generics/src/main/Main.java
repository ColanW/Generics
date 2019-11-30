package main;

public class Main {

	public static void main(String args[]) {
		
		Integer[] i = { 1, 2, 3, 4, 5 };
		
		String[] s = { "a", "b", "c" };
		
		printArray(i);
		printArray(s);
		
	}
	
	public static <T> void printArray(T[] array) {
		
		for(T element : array) {
			
			System.out.println(element + " ");
			
		}
		
	}
	
}
