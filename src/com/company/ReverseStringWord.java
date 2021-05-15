package com.company;

public class ReverseStringWord {

    public static String reverseStringWords(String word){
        //Hello World
        //=> World Hello
        //convert to array
        //loop array and append each element to StringBuilder
        //after each loop append additional " " to Stringbuilder to separate the words
        //use toString to return String.

        String[] array = word.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i = array.length-1; i>=0; i--){
            result.append(array[i]);
            result.append(" ");
        }
        return result.toString();
    }

}
