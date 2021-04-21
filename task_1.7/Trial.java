import java.util.Scanner;
public class Trial {
  public static void main(String[] args) {
  Scanner ent = new Scanner(System.in);
    System.out.print("Длинна: ");
  int a = ent.nextInt();
    System.out.print("Ширина: ");
  int b = ent.nextInt();
    System.out.print("Глубина: ");
  int c = ent.nextInt();
  System.out.print("Ваш объём бассейна сосатвляет ");
  System.out.println(a*b*c);
  }
}
