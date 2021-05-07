public class Trial_2 {
    public static void main(String[] args) {
        int[] mass = {1,2,3,4,4,5,6,7,7,8,9,10};//i=0...10
        for (int i = 0; mass.length > i; i++) {
            if (mass[i + 1] != mass[i])
                System.out.println("Нет");
            else
                System.out.println("Да");
        }
    }
}
"C:\Program Files\Java\jdk-11.0.10\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.1\lib\idea_rt.jar=54036:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Лёлик\IdeaProjects\Trials\out\production\Trials Trial_2
        Нет
        Нет
        Нет
        Да
        Нет
        Нет
        Нет
        Да
        Нет
        Нет
        Нет
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
        at Trial_2.main(Trial_2.java:5)
