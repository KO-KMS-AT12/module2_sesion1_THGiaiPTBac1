import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ax+b=0
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap a = ");
        float a = scanner.nextFloat();
        scanner.nextLine();
        System.out.printf("Nhap b = ");
        float b = scanner.nextFloat();

        if (a <= 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            System.out.println("Phuong trinh co nghiem x = " + (-b / a));
        }
    }
}
