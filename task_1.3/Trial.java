public class Trial {
    public static void main(String[] args) {
        int a,b;
        a = 15;
        b = 15;
        int sum = a+b;
        int sub = a-b;
        int mult = a*b;
        int div = a/b;
        int sqr = (mult * mult);
        String s = "Результат вычисления";
        System.out.println(s+" "+"суммы: " +sum);
        System.out.println(s+" "+"разности: " +sub);
        System.out.println(s+" "+"произведения: " +mult);
        System.out.println(s+" "+"частного: " +div);
        System.out.println(s+" "+"возведения в квадрат: " +sqr);
    }
}
