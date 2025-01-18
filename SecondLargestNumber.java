public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

    if (arr.length < 2) {
        System.out.println("Array must have at least two elements.");
        return;
    }
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for (int num : arr) {
        if (num > largest) {
            secondLargest = largest;
            largest = num;
        } else if (num > secondLargest && num != largest) {
            secondLargest = num;
        }
    }
    if (secondLargest == Integer.MIN_VALUE) {
        System.out.println("There is no second largest element.");
    } else {
        System.out.println("The second largest number is: " + secondLargest);
    }
    }
}
