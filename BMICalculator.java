package day3;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter you weight in Pounds");
		double weightInPounds = scanner.nextDouble();
		System.out.println("Enter you height in meters");
		double height = scanner.nextDouble();
		
		//to convert punds to kgs
		double weightInKgs = weightInPounds*0.453592;
		
		//BMI=weight(kg)/(height(m)*height(m))
		double bmi = weightInKgs/(height*height);
		System.out.println("Your BMI is: "+ bmi);
		
		if (bmi<18.5) {
			System.out.println("you are underweight");
		}
		else if (bmi>=18.5 && bmi<24.9) {
			System.out.println("you are normal");
		}
		else if (bmi>=24.9 && bmi<29.9) {
			System.out.println("you are overweight");
		}
		else {
			System.out.println("you are obese");
		}
	}

}
