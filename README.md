📟 Calculator App (Java Console Application)
This is a simple command-line Calculator App built in Java that supports basic arithmetic operations such as addition, subtraction, multiplication, division, and power calculation. It continuously prompts the user for inputs until the user decides to exit.

💡 Features
✅ Addition (+)

✅ Subtraction (-)

✅ Multiplication (*)

✅ Division (/)

✅ Power (p) — calculates a^b

✅ User-friendly prompts and loop for repeated use

🛠️ How to Run
Requirements:
Java JDK 8 or higher

A terminal or command prompt

Steps:
Save the file as CalculatorMain.java

Compile the Java program:

bash
Copy
Edit
javac CalculatorMain.java
Run the program:

bash
Copy
Edit
java CalculatorMain
🧪 Sample Usage
pgsql
Copy
Edit
Starting Calculator------
Welcome to Calculator App
Please enter your 2 values separated with a space
5 3
Please select operation u want to perform +  -  *  / or p if want calculate powers
*
15
do you want to do more calcs? YES NO
yes
🧾 Method Descriptions
Method	Description
Add(a, b)	Returns the sum of a and b
sub(a, b)	Returns the difference a - b
mult(a,b)	Returns the product a * b
div(a,b)	Returns the division a / b
myPow(x,t)	Calculates x^t using fast exponentiation

⚠️ Notes
Power calculation works for negative exponents too.


Input is case-sensitive (YES or NO expected in lowercase for repeat prompt).

👤 Author
Akarsh Tiwari
Feel free to fork, improve, and use this for learning purposes!
