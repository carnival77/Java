package chap05.arrays;

public class PrimitiveTypeArray {
	public static void main(String[] args) {
		// array 선언
		int[] nums;
		int num2[];
		// array 선언 및 생성.
		nums = new int[3];

		System.out.println(nums);
		System.out.println(nums.length);
		System.out.println(nums[0]);

		// array 값을 초기화
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;

		// array 값을 출력
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		// enhanced for loop
		for (int val : nums) {
			System.out.println(val);
		}
		
		for (int i : nums) {
			System.out.println(i);
		}

	}
}
