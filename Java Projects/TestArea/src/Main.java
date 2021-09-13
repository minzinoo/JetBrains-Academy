import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int s=0;
        while ((n = scanner.nextInt()) != 0) {
            s += 1;
        }
        System.out.println(s);
        /*Scanner scanner = new Scanner(System.in);
        int n;
        int max = Integer.MIN_VALUE;
        while((n = scanner.nextInt()) != 0){
            max = n>max?n:max;
            System.out.println(max);
        }*/

    }
    /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }*/

        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int sum = 0;
        for (int x = 0; x <= 100; x++) {
            sum = a*x*x*x + b*x*x + c*x + d;
            if (sum == 0) {
                System.out.println(x);
            }
        }*/

        /*int n = 9;
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }

        int startIncl = 1, endExcl = 11, sum=0;
        for (int i = startIncl; i < endExcl; i++) {
            sum += i;
        }
        System.out.println(sum);

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number A:>");
        int a = scanner.nextInt();
        System.out.println("Enter number B:>");
        int b = scanner.nextInt();
        System.out.println("Enter number C:>");
        int c = scanner.nextInt();
        String compare = a == b && a == c ? "All numbers are equal.":
                        a > b ? (a > c ? "A is the biggest.": "C is the biggest.") :
                        (b > c ? "B is the biggest." : "C is the biggest.");
        System.out.println(compare); */

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number A:>");
        int a = scanner.nextInt();
        System.out.println("Enter number B:>");
        int b = scanner.nextInt();
        String compare = a == b ? "A and B are equal.":
                        a > b ? "A is bigger than B." : "B is bigger than A.";
        System.out.println(compare);*/

        //System.out.println("Enter the amount you have!\n");
        /*Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input < 0) {
            System.out.println("You don't have sufficient money to buy anything!");
        } else if (input < 100){
            System.out.println("You can buy some food!");
        } else if (input < 1000){
            System.out.println("You can buy a cheap phone!");
        } else if (input < 10000){
            System.out.println("You can buy an iPhone or Macbook!");
        }else if (input < 100000){
            System.out.println("You can buy a good car!");
        }else {
            System.out.println("You can buy a house then!");
        }*/
        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 1) {
            System.out.println("no army");
        } else if (a < 19) {
            System.out.println("pack");
        } else if (a < 249) {
            System.out.println("throng");
        } else if (a < 999) {
            System.out.println("zounds");
        }
        else {
            System.out.println("legion");
        }

        long lo = Integer.MAX_VALUE; // (1)
        int i = (int) lo; // (2)
        char ch = (char) i; // (3)
        double d = ch; // (4)
        float f = (float) d; // (5)
        */

        /*Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 4 ; i++) {
            int num = scanner.nextInt();
            System.out.println(--num + " ");
        } */
}

