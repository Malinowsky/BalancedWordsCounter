package functions;

public class BalancedWordsCounterTest {
    public static void main(String args[]) {

        System.out.println("1.input = \"aabbabcccba\"  result = "+ new BalancedWordsCounter().count("aabbabcccba"));
        System.out.println("2.input=\"\"   result = "+ new BalancedWordsCounter().count(""));

        try{
            System.out.println("3.input = abababa1   result = "+ new BalancedWordsCounter().count("abababa1"));
        }catch (Exception e){
            System.out.println("3.input = abababa1   result = "+ e.getMessage());
        }

        try{
            System.out.println("4.input = null   result = " + (new BalancedWordsCounter().count(null)));
        }catch (Exception e){
            System.out.println("4.input = null   result = "+e.getMessage());
        }
    }

}