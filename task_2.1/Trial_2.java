public class Trial_2 {
    public static void main(String[] args){
        String words[] = {"мама","мыла","раму"};

        for (int i=0;i<words.length; i++)
            for (int j=0;j<words.length; j++)
                if (i!=j)
                    System.out.println(words[i]+" "+words[j]+" "+words[words.length-i-j]);
    }
}
