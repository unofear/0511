import java.util.Scanner;
public class Trial_2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Введите первую переменную : ");
        int a = ent.nextInt();
        System.out.print("Введите вторую переменную : ");
        int b = ent.nextInt();
        int result = a % b;
        if (result != 0) {
            System.out.println("Делится с остатком = " + result);
        } else {
            System.out.println("Делится, результат деления = " + (a / b));
        }
    }
}
