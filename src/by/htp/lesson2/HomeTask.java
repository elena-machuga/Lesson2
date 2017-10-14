package by.htp.lesson2;

public class HomeTask {

	public static void main(String[] args) {

		int[] numbers = { 2, 5, 7, 8, 6, 1, 3, 4, 9 };

		int max = findMaxValue(numbers);
		System.out.println(max);

		int min = findMinValue(numbers);
		System.out.println(min);

		sortAsc(numbers);

		for (int x : numbers) {
			System.out.println(x);
		}

		sortDsc(numbers);

		for (int x : numbers) {
			System.out.println(x);
		}

	}

	public static int findMaxValue(int[] numbers) {
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		return max;
	}

	public static int findMinValue(int[] numbers) {
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		return min;
	}

	public static void sortAsc(int[] numbers) {
		int tmp;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 1; j < numbers.length - i; j++) {

				if (numbers[j - 1] > numbers[j]) {
					tmp = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
	}

	public static void sortDsc(int[] numbers) {
		int tmp;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 1; j < numbers.length - i; j++) {

				if (numbers[j - 1] < numbers[j]) {
					tmp = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
	}

}
