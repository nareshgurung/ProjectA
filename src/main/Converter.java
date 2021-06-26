package main;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        // perform invoice calculations until choice isn't equal to "y" or "Y"
	        String choice ="quit";
	        boolean value =true;
	        String converter = "1. Cups to Teaspoons \n" +
	        					"2. Miles to Kilometers \n"+
	        					"3. US Gallons to Imperial Gallons";
	        System.out.println(converter);
	       
	        while (value) {	
		        System.out.println("Please choose the number of the list that you like to convert: ");
		        int listNumber = sc.nextInt();
	        	if (listNumber ==1) {
	        		System.out.println("Please enter the total cups: ");
	        		double cup = sc.nextDouble();
	        		Converter spoon = new Converter();
	        		spoon.cupConverter(cup);
	        	}
	        else if(listNumber ==2) {
	        	System.out.println("please Enter the total miles: ");
	        	double miles =sc.nextDouble();
	        	Converter kilom = new Converter();
        		kilom.mileConverter(miles);
		       
	        	}
	        else if(listNumber ==3) {
	        	System.out.println("please enter the total us Gallon: ");
	        	double imgallon = sc.nextDouble();
	        	Converter gallon = new Converter();
	        	gallon.gallonConverter(imgallon);
	        	
	        	
	        }
	        	System.out.println("would you like continue: y/quit ");
	        	choice =sc.next();
	        	if(choice.equalsIgnoreCase("quit")) {
	        		value = false;
	        	}
	        	else {
	        		continue;
	        	}
	        }
	}
	public void cupConverter(double cup) {
		double teaSpoon = cup*48;
		System.out.println(cup +"cup = " + teaSpoon+ "teaspoon");
	}
	public void mileConverter(double miles) {
     	double km =miles*1.6;
     	System.out.println(miles+" miles " +" = " + km+"km");
		
	}
	public void gallonConverter(double gallon) {
		double iGallon= gallon*0.83;
		System.out.println(gallon+ " gallon == " +iGallon + " imperrel gallon");
	}
}
