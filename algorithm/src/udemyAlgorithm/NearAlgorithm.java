package udemyAlgorithm;

/**
 * 근삿값 알고리즘 : 차잇값의 절댓값의 최솟값 
 * 
 * @author geranium
 *
 */
public class NearAlgorithm {
	public static int abs(int number) {
		return (number < 0) ? Math.abs(number) : number;
	}

	public static void main(String[] args) {
		// input
		int[] datas = { -2, 3, 7, 1, -5, -9, 10, 6, -7 };
		int min = Integer.MAX_VALUE;
		int near = 0;
		int target = 4;
		
		// process
		for (int data : datas) {
			int abs = abs(data - target);
			
			// 최초값은 무조건 들어간다
			if(abs < min) {
				min = abs;
				near = data;
				
				System.out.println("min : " + min);
				System.out.println("near : " + near);
			}
		}

		System.out.println();
		System.out.println("근삿값 : " + near);
	}

}
