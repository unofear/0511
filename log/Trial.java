import java.util.Scanner;
public class Trial {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = ent.next();// Ожидаем ввод пользователя
        System.out.print("Введите пароль: ");
        String pass = ent.next();// Ожидаем ввод пользователя

        if(login.equals("admin")){
            if (pass.equals("1234")) {
                System.out.println("Доступ разрешён");
            }else{
                System.out.println("Доступ запрещён");
            }
        }else{
            System.out.println("Доступ разрешён");
        }
    }
}

ИЛИ
import java.util.Scanner;
public class Trial {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = ent.next();// Ожидаем ввод пользователя
        System.out.print("Введите пароль: ");
        String pass = ent.next();// Ожидаем ввод пользователя

        if (login.equals("admin") && pass.equals("1234")) {
            // Если логин "admin" и пароль "1234", то выполняем инструкции в скобках.
            System.out.println("Доступ разрешён");
        }else if(login.equals("user") && pass.equals("4321")){
            System.out.println("Доступ разрешён");
        }else{
            System.out.println("Доступ запрещён");
        }
    }
}
