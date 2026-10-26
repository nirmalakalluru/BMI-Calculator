
BMI Calculator
📌 Project Description
The BMI Calculator is a simple Java console application that calculates a user's Body Mass Index (BMI) based on their weight and height. It converts weight from pounds to kilograms, calculates BMI, and displays the corresponding weight category.

This project demonstrates basic Java programming concepts, including user input, mathematical calculations, conditional statements, and console output.

🚀 Features
Accepts user weight in pounds.
Accepts user height in meters.
Converts weight from pounds to kilograms.
Calculates BMI using the standard formula.
Displays the calculated BMI.
Categorizes BMI as underweight, normal, overweight, or obese.
🛠️ Technologies Used
Programming Language: Java
Input Handling: Scanner class
IDE: Any Java-compatible IDE, such as Eclipse, IntelliJ IDEA, or Visual Studio Code.
📐 BMI Formula
The application uses the following formula:

BMI = Weight (kg) / Height (m)²

Since the program accepts weight in pounds, it first converts the weight to kilograms using the following conversion:

Weight (kg) = Weight (pounds) × 0.453592

📊 BMI Categories
The program classifies BMI using these ranges:


BMI Range	Category
Below 18.5	Underweight
18.5 to below 24.9	Normal
24.9 to below 29.9	Overweight
29.9 and above	Obese
▶️ How to Run the Program
Prerequisites
Install the Java Development Kit (JDK).
Use a Java IDE or a terminal with Java commands available.
Steps
Clone or download this repository.
Open the project in your preferred Java IDE.
Locate the BMICalculator.java file in the day3 package.
Run the BMICalculator class.
Enter your weight in pounds when prompted.
Enter your height in meters when prompted.
View your BMI result and weight category in the console.
Run from the Terminal
From the directory containing the day3 folder, compile and run the program:


bash
javac day3/BMICalculator.java
java day3.BMICalculator
💻 Example Output

text
Enter you weight in Pounds
150
Enter you height in meters
1.75
Your BMI is: 22.230...
you are normal
Note: The displayed BMI may contain additional decimal places because the program does not round the result.

📚 Concepts Practiced
Java classes and the main() method
Variables and the double data type
User input using Scanner
Type conversion and mathematical calculations
if, else if, and else conditional statements
Console output using System.out.println()
