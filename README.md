# DelphiBIC_Coding - Solving the FizzBuzz Problem
A java program that prints the numbers from 1 to 100. 
But for multiples of three print "Fizz" instead of the number and for the multiples of five print 
"Buzz". For numbers which are multiples of both three and five print "FizzBuzz".

# Programming Language
  JAVA

# Project structure
  Standalone java project
  1. src/com/delphiBIC- contains the FizzBuzz java class 
  2. .classpath- contains the src folder entry to locate the src path
  3. .project and .settings file- contains the java configuration to build and run the java code.
  
# Logic for FizzBuzz problem:
1. To create a class called FizzBuzz.java 
2. To write a Main method under the FizzBuzz class
3. To Get dynamic input from the User (start and end Range) by using java Scanner class
4. To invoke the  fizzBuzz function by passing a input argument
5. To loop over the numbers between start and end range and check 
        # if the number is divisible by 15 then prints "FizzBuzz" 
        # else if the number is divisible by 3 then print "Fizz"
        # else if the number is divisible by 5 then print "Buzz" 
        # else print the number.
6. To handle the InputMismatch exceptions by using try, catch, finally around the Method inside the java class.

# How to Setup and Run java code from ecllipse IDE tool
1. Install Java and Git on Machine.
2. Go to github Repository-https://github.com/LakshmiRamasubramanian/DelphiBIC_Coding.git and copy the link.
3. Open Ecllipse IDE, go to File->import->Git->projects from git->clone Url->paste the github URI->click Next->select Master branch->click Next and Finish
4. Go to imported project, under that Src folder select the java class, go to run-> select java applications which executes the code and generate results in the console.

# How to Setup and Run Java Code from terminal
1. Install Java and Git on Machine
2. Go to github Repository-https://github.com/LakshmiRamasubramanian/DelphiBIC_Coding.git and copy the link.
3. Open CMD, Create a folder for the project by using the command "mkdir folder_name". 
4. Go to new folder by using the command "cd folder_name"
5. To use the git command to clone the project "git clone https://github.com/LakshmiRamasubramanian/DelphiBIC_Coding.git"
6. Now go to project folder and locate the file name FizzBuzz.java under the src\com\delphibic path.
7. Open CMD, locate the FizzBuzz.java file path and compile the code using javac FizzBuzz.java
8. To run the code use "java FizzBuzz.java" 

