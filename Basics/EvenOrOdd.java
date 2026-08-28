import java.util.Scanner;

class EvenOrOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 2 != 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }
}