package udemyAlgorithm;

/**
 * 등차수열 : 연속하는 두 수의 차이가 일정한 수 
 * 
 * @author geranium
 *
 */
public class AtirhmeticSequence {
	public static void main(String[] args) {		
		// input
		int sum = 0;
		
		// process
		for (int i = 1; i < 21; i++) {
			if(i % 2 != 0) { 
				sum += i;
			}
		}
		
		// output
		System.out.println("sum : " + sum);
	}
}
