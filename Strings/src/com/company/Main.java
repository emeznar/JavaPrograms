package com.company;

public class Main {

    public static void main(String[] args) {
    String myString = "This is a string";
        System.out.println(myString);

        myString = myString + ", and this is more";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";//no numberic calc without conversion
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;//no calc without both converted
        System.out.println(lastString);
    }
}
