import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the amount you have!\n");
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
        Scanner scanner = new Scanner(System.in);
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
    }
}

