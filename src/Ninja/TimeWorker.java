package Ninja;

import java.util.Scanner;

public class TimeWorker {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please, enter the Time taken by Worker : ");
		int timeWorker = scanner.nextInt();
		
		//Conditions 
		if ((timeWorker >= 2) && (timeWorker < 3)) {
			System.out.println("Worker need be highly efficient");
		} else if ((timeWorker >= 3) && (timeWorker < 4)) {
			System.out.println("Worker need to improve speed");
		} else if ((timeWorker >= 4) && (timeWorker < 5)) {
			System.out.println("Worker need to receive a training to improve his speed.");
		} else if ((timeWorker >= 5)) {
			System.out.println("Worker need to leave the compagny");
		}

	}

}
