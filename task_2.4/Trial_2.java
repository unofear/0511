import java.util.Scanner;
public class Trial_2 {
    public static void main (String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        double contribution = ent.nextDouble();
        System.out.print("Введите процент по вкладу: ");
        double percent = ent.nextDouble();
        for (int j=0; j<=5; j++);
            System.out.println("Ваш доход :"+(contribution+(contribution*percent)/100));
    }
}
