package com.company;

public class Main {

    public static void main(String[] args) {

//        char[] s = new char[] {'h', 'e', 'l', 'l', 'o'};
        char[] s = new char[] {'H', 'a', 'n', 'n', 'a', 'h'};

        char[] chars = ReverseString.reverseString(s);

        for( char i: chars){
            System.out.print(" " + i);
        }

    }
}
