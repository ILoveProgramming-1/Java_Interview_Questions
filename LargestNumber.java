import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the Third number : ");
        int num3 = sc.nextInt();
        if (num1>=num2 && num1>=num3) {
            System.out.println(num1+" is Largest number");
        }else if(num2>=num1 && num2 >=num3)
        {
            System.out.println(num2+" is Largest number");
        }else{
            System.out.println(num3+" is Largest number");
        }
        sc.close();
    }
}