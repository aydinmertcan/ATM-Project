package com.bilgeadam.week5.homeworks.atmutils;

import java.util.Scanner;

public class BAUtils {
	private static Scanner scan = new Scanner(System.in);
	
	public static void footer() {
		System.out.println("\n\tProgramı kullandığınız için teşekkürler");
		System.out.println("\t\tTekrar görüşmek üzere");
		closeResources();
	}
	
	public static void header(String title) {
		// ===========
		// ** title **
		// ===========
		int length = title.trim().length();
		StringBuilder row = new StringBuilder();
		
		for (int i = 0; i < (length + 6); i++) {
			row.append("=");
		}
		
		System.out.println(
				"\t\t" + row + "\n" + "\t\t" + "** " + title.toUpperCase().trim() + " **" + "\n" + "\t\t" + row);
	}
	
	public static String readString(String query) {
		String retVal = null;
		showQuery(query);
		retVal = scan.nextLine();
		return retVal;
	}
	
	public static int readInt(String query) {
		int retVal = -1;
		showQuery(query);
		retVal = scan.nextInt();
		scan.close();
		return retVal;
	}
	
	// public static int[] readInt(String start, String query, int numElements) {
	// showQuery(start + " " + numElements + " " + query + "\n");
	// int[] = retVal = new int[numElements];
	// for (int i = 0; i < numElements; i++) {
	// System.out.println();
	// }
	// }
	
	public static double readDouble(String query) {
		double retVal = -1.0;
		showQuery(query);
		retVal = scan.nextDouble();
		scan.close();
		return retVal;
	}
	
	public static void showQuery(String query) {
		System.out.print("\t" + query + ": ");
	}
	
	public static void closeResources() {
		scan.close();
	}
	
	public static boolean proceeding(String question, String negativeAnswer) {
		boolean retVal = true;
		
		showQuery(question);
		String answerString = scan.next();
		retVal = answerString.equalsIgnoreCase(negativeAnswer);
		
		return retVal;
	}
	
}

