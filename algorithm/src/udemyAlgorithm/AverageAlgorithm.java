package udemyAlgorithm;

/**
 * 평균 알고리즘 : 주어진 범위에 주어진 조건에 해당하는 자료들의 평
 * 
 * @author geranium
 *
 */
public class AverageAlgorithm {

	public static void main(String[] args) {
		// n명의 점수 중에서 80점 이상 95점 이하인 점수의 평

		// input
		int[] scores = { 90, 65, 78, 50, 95 };
		int sum = 0;
		int count = 0;

		// process
		for (int score : scores) {
			if (score >= 80 || score <= 95) {
				sum += score;
				count++;
			}
		}

		double avg = sum / count;

		// output
		System.out.println(scores.length + "명의 점수 중 80점 이상, 95점 이하 총점 : " + sum);
		System.out.println(scores.length + "명의 점수 중 80점 이상, 95점 이하 평균 : " + avg);
	}

}
