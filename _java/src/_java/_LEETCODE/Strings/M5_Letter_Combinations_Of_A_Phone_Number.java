package _java._LEETCODE.Strings;

import java.util.*;


public class M5_Letter_Combinations_Of_A_Phone_Number {

	static String a[] = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};  
	
	public static void main(String[] args) {
		
		List<String> words = letterCombinations("79");
		
		System.out.print("[ ");
		
		for(String word: words)
			System.out.print(word +", ");
		
		System.out.print("]");
	}
	
    
    public static List<String> letterCombinations(String digits) {
        if(digits.length() == 0)
            return new ArrayList<>();
     
        List<String> combi = new ArrayList<>();
        
        String word = "";
        
        int next = 0;
        int in = Character.getNumericValue(digits.charAt(next)) - 2;
        
        for(int i=0; i<a[in].length(); i++)
            dfs(combi, digits, word, i, next, in);
        
        return combi;
    }
    
    public static void dfs(List<String> combi, String digits, String word, int count, int next, int in){
        
        char val = a[in].charAt(count);
        word += val;
                
        if(word.length() == digits.length()){
            combi.add(word);
            return;
        }

        next++;
        in = Character.getNumericValue(digits.charAt(next)) -  2;
        
        for(int i=0; i<a[in].length(); i++)
            dfs(combi, digits, word, i, next, in); 
        
    }

}