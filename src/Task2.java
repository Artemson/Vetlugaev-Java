import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first_str, second_str;
        System.out.print("Input first string: ");
        first_str = in.nextLine();
        System.out.print("Input second string: ");
        second_str = in.nextLine();

        if(first_str.equals(second_str)){
            System.out.println("Строки идентичны");
        }else{
            System.out.println("Строки неидентичны");
        }


    }
}
