import java.util.Scanner;

public class IntegerDataType {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt(); // number of test cases

        for (int i = 0; i < t; i++) {
            try {
                long n = scan.nextLong(); // input number

                // Check if n can fit in byte
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println(n + " can be fitted in:\n* byte\n* short\n* int\n* long");
                }
                // Check if n can fit in short
                else if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println(n + " can be fitted in:\n* short\n* int\n* long");
                }
                // Check if n can fit in int
                else if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println(n + " can be fitted in:\n* int\n* long");
                }
                // Check if n can fit in long
                else {
                    System.out.println(n + " can be fitted in:\n* long");
                }
            } catch (Exception e) {
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }
        }

        scan.close();
    }
}
