import java.util.Scanner;
public class Trial_2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Введите переменную : ");
        int a = ent.nextInt();
            for (int i = 2; i < a; i++)
                if ( a%i==0) {
                    System.out.println(false);
                }
                else{
                    System.out.println(true);
            }
    }
}

import java.util.Scanner;
class Trial_2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Введите переменную : ");
        int a = ent.nextInt();
            for (int i = 2; i < a; i++)
                if ( a%i!=1) {
                    System.out.println(false);
                }
                else{
                    System.out.println(true);
            }
    }
}
