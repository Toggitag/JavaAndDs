public class SumNoLoop {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(sum(array, 0));
	}

	public static int sum(int[] arr, int index) {

		if (arr.length <= index) {

			return 0;
		}

		return arr[index] + sum(arr, index + 1);

	}
}