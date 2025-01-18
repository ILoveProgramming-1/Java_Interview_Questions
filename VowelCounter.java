import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'e'
                    || str.toLowerCase().charAt(i) == 'i' || str.toLowerCase().charAt(i) == 'o'
                    || str.toLowerCase().charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("There is " + count + " vowel in Sentence");
        sc.close();
    }
}
