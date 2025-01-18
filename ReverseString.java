import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        String reverseStr="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverseStr +=str.charAt(i);
        }
        System.out.println("Old String : "+ str);
        System.out.println("New String : "+ reverseStr);
        sc.close();
    }
}
