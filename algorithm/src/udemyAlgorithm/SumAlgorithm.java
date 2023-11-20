package udemyAlgorithm;

/**
 * 합계 알고리즘
 * 주어진 범위에 주어진 조건에 해당하는 자료들의 합
 * @author geranium
 *
 */
public class SumAlgorithm {

	public static void main(String[] args) {
		// input
		int[] scores = {100, 75, 50, 37, 90, 95};
		int sum = 0;
		
		// process
		for (int score : scores) {
			if(score >= 80) sum += score;
		}
		
		// output
		System.out.println(scores.length + "명의 점수 중 80점 이상의 총점 : " + sum);
	}

}
