public class Trial_2 {
    public static void main(String[] args) {
        int[] mass = {1,2,3,4,4,5,6,7,7,8,9,1};//i=0...9
        for (int i = 0; (i <= mass.length); i++) {
            if (mass[i] == mass[i + 1]) {
                System.out.println("Да");
            } else {
                System.out.println("Нет");
            }
        }
    }
}
