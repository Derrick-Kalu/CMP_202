public class fib {
    public static void main (String[] args){
        int num1 = 0;
        int num2 = 1;
        System.out.println(num1);
        System.out.println(num2);

        int next = num1 + num2;
        System.out.println(next);

        num1 = num2;
        num2 = next;

        System.out.println(next + num2);

        num2=next;
        next=num1;
        System.out.println(num1+ next);

    }
}
