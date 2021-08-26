import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        System.out.println("Cinema:");
        System.out.println("  1 2 3 4 5 6 7 8\n1 S S S S S S S S\n2 S S S S S S S S\n3 S S S S S S S S" +
                            "\n4 S S S S S S S S\n5 S S S S S S S S\n6 S S S S S S S S\n7 S S S S S S S S");

        String firstDayofWeek = "Monday", secondDayofWeek = "Tuesday";
        int one = 1;
        int num = one;
        System.out.println("\n\n" + firstDayofWeek + "\n" + secondDayofWeek);
        System.out.println(num);
        var test = "How are you?";
        var test2 = 1982;
        System.out.println(test);
        System.out.println(test2);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String text = scanner.next();
            System.out.println(text);
        }

    }
}
