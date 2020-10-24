package _java._LEETCODE.Strings;

// Q: https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/

public class _5Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
public:
    string freqAlphabets(string s) {
        string x="";                                // ans string 
        int n=s.size();
        for(int i=0;i<n;)
        {
            
            if(i+2 < n and s[i+2]=='#')             // checking for #
            {
                x+=(char)('a'+ (int)(stoi(s.substr(i,2))-1));
                i+=3;
            }
            else if(s[i] <= '9')
                x+=(char)('a'+(int)((s[i++]-'0')-1));         // checking for 1-9
        }
        return x;
    }
};
*/