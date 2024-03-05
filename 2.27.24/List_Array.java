import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ListArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            ArrayList<Integer> nums = new ArrayList<>();

            while (true) {
                String input = scanner.nextLine().trim();
                if (input.equals("-"))
                    break;
                nums.add(Integer.parseInt(input));
            }

            removeNegativesAndReverse(nums);
        }
    }

    public static void removeNegativesAndReverse(ArrayList<Integer> nums) {
        ArrayList<Integer> positives = new ArrayList<>();

        for (int num : nums) {
            if (num >= 0) {
                positives.add(num);
            }
        }

        if (positives.isEmpty()) {
            System.out.println("empty");
        } else {
            Collections.reverse(positives);
            positives.forEach(num -> System.out.print(num + " "));
            System.out.println();
        }
    }
}
