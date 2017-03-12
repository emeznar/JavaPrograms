package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println("1 + 2 = "+ result);

        int previousResult = result;

        result = result -1;
        System.out.println(result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        result = result /5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = "+ result);

        result++;
        System.out.println(result);

        result += 2;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien");

        int topScore = 80;
        if (topScore >= 80)
            System.out.println("You got the high score!");

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than second top score and less than 100");

        if ((topScore > 90) || (secondTopScore <=90))
            System.out.println("One of these tests is true");

        boolean isCar = false;
        if(isCar == true) //make sure you use ==
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

        double myFirstValue = 20;
        double mySecondValue = 80;
        double myTotal =  (myFirstValue + mySecondValue) * 25;
        double theRemainder = myTotal % 40;
        if(theRemainder < 20)
            System.out.println("Total was over the limit");



    }
}
