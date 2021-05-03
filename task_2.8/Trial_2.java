public class Trial_2{
    public static void main(String[] args) {
        int[] mass ={2,3,4,5};
        int mult = mass[0];
        for (int i = 1; i < mass.length; i++)
        System.out.println(mult *= mass[i]);
    }
}
