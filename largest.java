import java.util.Scanner;
class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a is largest");
        } else if (b > a) {
            System.out.println("b is largest");
        } else {
            System.out.println("both are equal");
        }
    }
}