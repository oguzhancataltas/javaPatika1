import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int k, i=1,j=1;

        System.out.print("Bir sayı giriniz : ");
        k = scanner.nextInt();

        System.out.println("******** 4'ün katları *********");
        for(;i<=k;i*=4){
            System.out.println(i);
        }

        System.out.println("******** 5'in katları *********");
        for(;j<=k;j*=5){
            System.out.println(j);
        }

    }
}
