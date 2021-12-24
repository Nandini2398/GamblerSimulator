package com.bridgelabz.gambler;
import java.util.Scanner;

public class GamblerSimulator {
	static int AMOUNT_OF_STAKE=100;
	static int BET_AMOUNT=1;
	static int WON=1;
	static int LOST=0;
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Starting amount of stake is "+AMOUNT_OF_STAKE);
		 System.out.println("Amount to bet after every play "+BET_AMOUNT);
		 int play = (int) Math.floor(Math.random() * 10) % 2;
		 System.out.println("Gamblers play:"+play);
		 int cashInHand = AMOUNT_OF_STAKE;
		 switch(play) {
		 	case 1:
		 		 cashInHand = cashInHand + BET_AMOUNT;
		 		 System.out.println("Total current cash gambler has "+cashInHand);
		 		 break;
		 	case 2:
		 		 cashInHand = cashInHand - BET_AMOUNT;
		 		 System.out.println("Total current cash gambler has "+cashInHand);
		 		 break;
		 	default:
		 		 System.out.println("default");
		 }
		 if(play == 1) {
			 System.out.println("Player won the first play");
		 }
		 else {
			 System.out.println("Player lost the first play");
		 }
	}
}
	