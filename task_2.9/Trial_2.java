public class Trial_2{
    public static void main(String[] args) {
        int[] mass = {1,2,3,4,5,6,7,8,9,10};
        int i=0;
        for (i =0; i< mass.length; i++)
            if (mass[i] == 5) {
                System.out.println("Да.");
            }else{
                System.out.println("Нет.");
            }
    }
}
