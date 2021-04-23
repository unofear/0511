import java.util.Scanner;
public class Trial_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите температуру в цельсиях: ");
        double TC = scan.nextDouble();
        double TF = (9./5)*TC+32;
        System.out.print("Температура в фаренгейтах: ");
        System.out.println(TF);
    }
}
