  
import java.util.Scanner;
public class Trial {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Введите температуру в цельсиях: ");
    int TC = scan.nextInt();
    double TF = (9./5)*TC+32;
    System.out.println("Температура в фаренгейтах: ");
    System.out.println(TF);

    System.out.print("Введите температуру в фаренгейтах: ");
    int secTF = scan.nextInt();
    double secTC = 5./9*(secTF-32);
    System.out.println("Температура в цельсиях: ");
    System.out.println(secTC);
  }
}
