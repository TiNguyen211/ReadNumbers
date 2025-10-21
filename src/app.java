import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number (0 - 999): ");
            number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Chương trình đã thoát.");
                break;
            }

            if (number < 0 || number > 999) {
                System.out.println("out of ability");
            } else {
                System.out.println(numberToWords(number));
            }

            System.out.println("Bấm 0 để thoát chương trình.");
            System.out.println();

        } while (true);
    }

    public static String numberToWords(int number) {
        String[] ones = {"zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"};

        if (number < 10) {
            return ones[number];
        } else if (number < 20) {
            return teens[number - 10];
        } else if (number < 100) {
            int ten = number / 10;
            int one = number % 10;
            if (one == 0) return tens[ten];
            else return tens[ten] + " " + ones[one];
        } else { // 100 - 999
            int hundred = number / 100;
            int remainder = number % 100;
            String result = ones[hundred] + " hundred";
            if (remainder == 0) return result;
            else return result + " and " + numberToWords(remainder);
        }
    }
}
