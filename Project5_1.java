import java.util.ArrayList;
import java.util.List;

public class Project5_1 {
    public static void main(String[] args) {
        // Sample list of integers (autoboxing)
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10); // Autoboxing: int -> Integer
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Calculate sum using unboxing
        int sum = calculateSum(numbers);
        System.out.println("Sum of numbers: " + sum);

        // Parsing string to Integer
        String numberString = "50";
        Integer parsedNumber = parseStringToInteger(numberString);
        System.out.println("Parsed Integer: " + parsedNumber);
    }

    // Method to calculate sum of integers using unboxing
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing: Integer -> int
        }
        return sum;
    }

    // Method to parse string into Integer
    public static Integer parseStringToInteger(String str) {
        return Integer.parseInt(str);
    }
}
