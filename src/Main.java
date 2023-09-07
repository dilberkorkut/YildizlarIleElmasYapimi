import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayisi giriniz(tek sayi) : ");
        int n = input.nextInt();

        int yariBasSay = n/2 +1;
        for( int i = 1; i<=yariBasSay; i++) {
            for( int k = 1; k <= (yariBasSay-i); k++) {
                System.out.print(" ");
            }
            for(int j =1; j <= (2*i-1); j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        for( int i = yariBasSay-1; i>=1; i--) {
            for( int k = 1; k <= (yariBasSay-i); k++) {
                System.out.print(" ");
            }
            for(int j =1; j <= (2*i-1); j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}