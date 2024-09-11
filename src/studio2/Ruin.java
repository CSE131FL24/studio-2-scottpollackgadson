package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
		System.out.println("How much money did you start with?");
		double startAmount = in.nextDouble();
		double original = startAmount;
		System.out.println("What is your chance of winning?");
		double winChance = in.nextDouble();
		System.out.println("What is the max amount of money you can win?");
		double winLimit = in.nextDouble();
		System.out.println("How many days will you play?");
		for (int totalSimulations = in.nextInt();(totalSimulations > 0);totalSimulations--){	
			int round = 0;
			int dayNum = 1;
			startAmount = original;
			while (startAmount > 0 && startAmount < winLimit) {
				round++;
				if (Math.random() <= winChance) {
					startAmount++;}
				else {
					startAmount--;}
			
			}
			System.out.println("Simulation Day: " + dayNum);
			System.out.println("Plays Today: " + round);
			if (startAmount > 0) {
				System.out.println("Success");}
			if (startAmount == 0) {
				System.out.println("Ruin");}
			dayNum++;
			}
			
			}
		}
		
	
