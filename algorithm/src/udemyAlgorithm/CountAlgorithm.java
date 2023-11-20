package udemyAlgorithm;

import java.util.ArrayList;

/**
 * 개수 알고리즘(Count Algorithm) 주어진 범위에 주어진 조건에 해당하는 자료들의 개수
 * 
 * @author geranium
 *
 */
public class CountAlgorithm {

	public static void main(String[] args) {
		// 1부터 1000까지의 정수 중 13의 배수의 개

		// input
		int count = 0;
		ArrayList<Integer> arr = new ArrayList<>();

		// process
		for (int i = 1; i < 1001; i++) {
			if (i % 13 == 0) {
				count++;
				arr.add(i);
			}
		}

		// output
		System.out.println("count : " + count);
		System.out.println(arr.toString());
	}

}
