import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first_number, second_number;
        System.out.print("Input number for a: ");
        first_number = in.nextInt();
        System.out.print("Input number for b: ");
        second_number = in.nextInt();

        if (first_number > second_number) {
            System.out.println("a > b");
        } else if (first_number < second_number){
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        System.out.println("a + b = " + ( first_number + second_number ));
        System.out.println("a - b = " + ( first_number - second_number ));
        System.out.println("a * b = " + ( first_number * second_number ));
        if (second_number != 0) {
            System.out.println("a / b = " + (first_number / second_number));
        } else {
            System.out.println("На ноль делить нельзя :)");
        }

    }
}