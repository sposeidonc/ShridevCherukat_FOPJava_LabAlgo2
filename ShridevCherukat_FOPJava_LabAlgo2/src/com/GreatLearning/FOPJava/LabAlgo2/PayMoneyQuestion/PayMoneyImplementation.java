package com.GreatLearning.FOPJava.LabAlgo2.PayMoneyQuestion;

import java.util.Scanner;

public class PayMoneyImplementation {
	public static void main(String[] args) {
		// Initializing Scanner element input to get inputs from user.
		Scanner input = new Scanner(System.in);
		// Getting the size of Transaction Array from user.
		System.out.println("Enter the size of transaction array: ");
		int size = input.nextInt();
		// Initializing the array of size as provided by user.
		int[] arr = new int[size];
		// Getting the elements of array from user
		System.out.println("Enter the values of array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = input.nextInt();
		}
		// Getting the Total no. of targets from user.
		System.out.println("Enter the total no of targets " + "that needs to be achieved: ");
		int noOfTargets = input.nextInt();

		// Checking for each target.
		while (noOfTargets-- != 0) {
			// Setting a flag variable to make sure if target achieved or not.
			int flag = 0;
			System.out.println("------------------------------------------");
			// Getting the target from user.
			System.out.println("Enter the value of target: ");
			long target = input.nextInt();
			long arraySum = 0;
			// Adding the elements of array by looping and getting the sum.
			for (int i = 0; i < size; i++) {
				arraySum += arr[i];
				// Checking if the sum is >= to the target and incrementing the flag if it is.
				if (arraySum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions ");
					flag = 1;
					break;
				}
			}
			// If the flag is still 0, then output that the target is not achieved.
			if (flag == 0) {
				System.out.println("Given target is not achieved!");
			}
		}
		// Closing the Scanner element
		input.close();
	}

}
