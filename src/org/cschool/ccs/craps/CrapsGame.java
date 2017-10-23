package org.cschool.ccs.craps;

import java.util.Scanner;
import java.util.Random;

public class CrapsGame {

	/**
	 * 
	 */
	private int points;
	private int sumOfRolls;
	public CrapsGame() {
		super();
	}

	/**
	 * TODO 
	 * 
	 * 
	 * 
	 * @param numDice
	 * @return
	 */
	private int rollDice(int numDice) {
		Scanner input = new Scanner(System.in);
		numDice = input.nextInt();
		int i;
		Random rand = new Random();
		for (i = 0; i < numDice; i++) {
			int roll = rand.nextInt(6) + 1;
			sumOfRolls += roll;
		}
		
		/* TODO */
		
		
		
		return sumOfRolls;
		
	}
	
	/**
	 * 
	 */
	public void play() {
		
		/* first roll */
		
		/* if 7 or 11, win */
		
		/* if 2, 3, or 12, lose */
		
		/* otherwise roll is the "point" to make */
		
	
		
		/* keep rolling until win or lose */
		while( true /* TODO fix this */ ) {
			
			/* if 7 or 11, lose */
			
			
			/* if matches pont, win */
			
			
			/* otherwise, keep rolling */
			
			
			
		}
		
		
		/* END */
		
	}
	
	
	
	
	public static void main(String[] args) {
		new CrapsGame().play();
	}
}
