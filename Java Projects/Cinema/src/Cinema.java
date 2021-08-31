import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        System.out.println("Cinema:");
        System.out.println("  1 2 3 4 5 6 7 8\n1 S S S S S S S S\n2 S S S S S S S S\n3 S S S S S S S S" +
                            "\n4 S S S S S S S S\n5 S S S S S S S S\n6 S S S S S S S S\n7 S S S S S S S S");
        System.out.println("Enter the number of rows:>");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:>");
        int seat = scanner.nextInt();
        int totalseats1 = row * seat;
        int income;
        if (totalseats1 > 60) {
            int firsthalfrows = row / 2;
            int secondhalfrows = row - firsthalfrows;
            int firstseats = firsthalfrows * seat;
            int secondseats = secondhalfrows * seat;
            income = (firstseats * 10) + (secondseats * 8);
            System.out.println("Total income: $" + income);
        } else {
            income = totalseats1 * 10;
            System.out.println("Total income: $" + income);
        }
    }
}
