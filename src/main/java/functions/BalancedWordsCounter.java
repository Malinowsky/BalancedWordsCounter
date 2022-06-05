package functions;

import java.util.*;

public class BalancedWordsCounter {
    public int count(String input){

        int sum=0;

        //if input is null throw exception
        if(input != null){
            for(int i=1; i<=input.length(); i++){

                for(int j=0; j<=input.length(); j++){

                    if(input.length() >= j + i){
                        sum += check(input.substring(j, j+i));
                    }else{
                        break;
                    }
                }
            }
        }else{
            throw new RuntimeException("RuntimeException");
        }
        return sum;
    }
    private int check(String subword) {

        int scount=-1;

        for (int i = 0; i < subword.length(); i++){

            char charAt = subword.charAt(i);
            int count=0;

            for (int j = 0; j < subword.length(); j++){

                if(Character.isLetter(subword.charAt(j))==false)
                {
                    throw new RuntimeException("RuntimeException");
                }

                if (subword.charAt(j) == charAt){
                    count++;
                }
            }

            if(scount==-1){
                scount = count;
            }else if (scount != count){
                return 0;
            }

        }

        return 1;
    }
}
