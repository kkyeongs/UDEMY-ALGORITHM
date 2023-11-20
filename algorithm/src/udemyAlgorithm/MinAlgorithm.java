package udemyAlgorithm;

/**
 * 최솟값 알고리즘 : (주어진 범위 + 주어진 조건)의 자료들의 가장 작은 값
 * 
 * @author geranium
 *
 */
public class MinAlgorithm {

	public static void main(String[] args) {
		// 주어진 데이터 중에서 가장 큰 값 구하기

		// input
		int[] datas = { -2, 3, 7, 1, -5, -9, 10, 6, -7 };
		int min = Integer.MAX_VALUE;

		// process
		for (int data : datas) {
			if (min < data) {
				min = data;
			}
		}

		System.out.println("최솟값 : " + min);
	}

}
