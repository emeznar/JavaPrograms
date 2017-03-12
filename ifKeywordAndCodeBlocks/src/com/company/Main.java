package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 1200;
	    int levelCompleted = 5;
	    int bonus = 100;

//	    if(score < 5000 && score > 1000) {
//			System.out.println("Your score was less than 5000");
//		} else if(score < 1000){
//			System.out.println("Your score was less than 1000");
//		} else {
//			System.out.println("Got Here");
//
//        }
		if(gameOver == true){ // can also be if(gameOver)- same as
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}
    }
}
//can not access variable finalScore from outside code block
//but can access variable within a code block that were created outside