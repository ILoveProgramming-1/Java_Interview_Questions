public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};
        // Sorting the array using Bubble Sort
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap numbers[j] and numbers[j + 1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        // Printing the sorted array
        System.out.print("Sorted Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
