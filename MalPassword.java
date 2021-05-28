import java.util.HashSet;
import java.util.Set;

public class MalPassword {
    private static Set<String> comb = new HashSet<String>();
    public static void main(String[] args){
        String input = "pavan";
        long totalCombinations =  1;
        for(int i =1; i<=input.length(); ++i){
            totalCombinations*=i;
        }
        for(int i=0; i<totalCombinations;++i){
            int letterOneIndex=i;
            int letterTwoIndex=i+1;
            if(letterOneIndex > input.length()-1){
                letterOneIndex=0;
            }
            if(letterTwoIndex > input.length()-1){
                letterTwoIndex=0;
            }
            if(letterOneIndex!= letterTwoIndex){
                comb.add(""+input.charAt(letterOneIndex)+input.charAt(letterTwoIndex));
            }
        }
        System.out.println(comb.size());
    }
}
