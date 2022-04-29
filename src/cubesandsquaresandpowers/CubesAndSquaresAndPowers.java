/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubesandsquaresandpowers;

/**
 *
 * @author hazub9940
 */
public class CubesAndSquaresAndPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        int userChoice = 0;
        double base = 0;
        double answer;
        double power;
        //loops
        while (userChoice != 4)
        {
            System.out.println("Please enter a choice.");
            System.out.println("");
            System.out.println("1  will find the value of a number squared.");
            System.out.println("2  will find the value of a number cubed.");
            System.out.println("3  will find the value of a number, to any power.");
            System.out.println("4 exits the program.");
            System.out.println("Please enter your choice.");
        
            userChoice = scan.nextInt();
            
            if (userChoice == 1) 
            {
                System.out.println("Please enter your base.");
                base = scan.nextInt();
                answer = base * base;
                System.out.println(" ");
                System.out.println("Answer is "+ answer);
            }
            
            
            if (userChoice == 2)
            {
                System.out.println("Please enter your base.");
                base = scan.nextInt();
                answer = base * base * base;
                System.out.println(" ");
                System.out.println("Answer is "+ answer); 
            }
            
            
            if (userChoice == 3)
            {
                System.out.println("Please enter your base.");
                base = scan.nextInt();
                System.out.println("Please enter your power.");
                power = scan.nextInt();
                double Num1 = 0;
                double Num2 = 1; 
                while (Num1 < power) 
                {
                    Num2 = Num2 * base;
                    Num1 = Num1 + 1;
                }
                System.out.println("");
                System.out.println("Answer is "+ Num2);
            }
        }    
        
            if (userChoice == 4)
            {
                System.out.println("You have exited the program.");
            }
