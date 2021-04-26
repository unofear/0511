import java.util.Scanner;
public class Trial_2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
            System.out.print("Введите сумму вклада: ");
        double contribution = ent.nextDouble();
            System.out.print("Введите процент по вкладу: ");
        double percent = ent.nextDouble();
            for (int i=1; i<=5; i++) {
                contribution += (contribution*percent)/100;
        System.out.println("Ваш доход: "+contribution);}
    }
}
