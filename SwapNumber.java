public class SwapNumber {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Number after swaping :");
        System.out.println("a: "+a+" b: "+b);
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("Number before swaping :");
        System.out.println("a: "+a+" b: "+b);
    }
}
