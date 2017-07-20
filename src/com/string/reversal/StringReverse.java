package com.string.reversal;

public class StringReverse {
    
    public String stringReverse(String str) {
        char [] strArray =str.toCharArray();
        String revString="";
        
        for(int i=str.length()-1;i>=0;i--) {
            revString+=strArray[i];
        }        
        return revString;
        
    }
}
