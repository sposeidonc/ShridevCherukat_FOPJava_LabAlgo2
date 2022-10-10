package com.GreatLearning.FOPJava.LabAlgo2.CurrencyDenominationQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyDenominationImplementation {
	public static void main(String[] args) {
		// Initializing Scanner element input to get inputs from user.
		Scanner input = new Scanner(System.in);
		// Getting the size of Currency Denomination Array from user.
		System.out.println("Enter the size of currency denominations: ");
		int size = input.nextInt();
		// Initializing the array of size as provided by user.
		int[] arr = new int[size];
		// Getting the elements of array from user.
		System.out.println("Enter the currency denominations value: ");
		for (int i = 0; i < size; i++) {
			arr[i] = input.nextInt();
		}
		// Sorting the array elements for easier traversal through it.
		Arrays.sort(arr);
		// Getting the amount needed to pay from user.
		System.out.println("Enter the amount you want to pay: ");
		int amount = input.nextInt();
		// Initializing a counter array to record the no. of times each denomination is
		// used.
		int[] counter = new int[size];
		// Iterating over the array elements in the decreasing order.
		for (int i = size - 1; i >= 0; i--) {
			// If the array element <= amount, then incrementing the counter array
			// element for that denomination.
			while (arr[i] <= amount) {
				counter[i] += 1;
				// Decrementing the amount according to the array element.
				amount -= arr[i];
			}
		}
		// Printing the total no. of denominations to be used.
		System.out.println("Your payment approach in order to give min no of notes will be: ");
		for (int i = size - 1; i >= 0; i--) {
			// Printing only for the denominations which have been used.
			if (counter[i] > 0) {
				System.out.println(arr[i] + " : " + counter[i]);
			}
		}
		// To display if any balance amount is left for which no denominations are
		// available
		if (amount > 0) {
			System.out.println("The Remaining balance to be paid: " + amount);
		}

		// Closing the Scanner element.
		input.close();
	}
}
