package Exercise1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());

            int result = a / b;
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }




        System.out.println(result);


    }
}
