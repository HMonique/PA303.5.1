import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int GreatestCommonDivisor = 1; //variable to store
        for (int i = 1; i <= n1;  i++) {
            if (n1 % i == 0 && n2 % i == 0){
                GreatestCommonDivisor = i;//changed the variable
            }
        }
        System.out.println(GreatestCommonDivisor);
    }
}

