package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// Assignment 1:
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your user name");
        String userName;
        userName = userInput.next();

        Scanner userInput2 = new Scanner(System.in);
        System.out.println("Please enter your e-mail");
        String email;
        email= userInput2.next();

        System.out.println("Your user name is "+ userName +" and your e-mail is " +email );


// Assignment 2:
        //function 1:
        long x = 2, y = 4, z = 6;
        long result = x * y * z;

        //function 2:
        long finalResult = result + 14;
          System.out.println(finalResult);


// Assignment 3:
        //A:
        Scanner userInput3 = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = userInput3.nextInt();

        if (age > 21){
            System.out.println("okay");
        }
        else if (age <= 12){
            System.out.println("no");
        }

        //B:
        Scanner userInput4 = new Scanner(System.in);
        System.out.println("Please enter your preferred day");
        String preferredDay = userInput4.next();

        switch (preferredDay){
            case "Monday", "Thursday":
                System.out.println("we're opened");
                break;
            case "Friday", "Wednesday":
                System.out.println("Not today");
        }

// Assignment 4:
        int l = 1;
        while (l<15){
        System.out.println("I love my parents");
        l++;
        }


// Assignment 5:
        inputEvenNumbers();
        inputEvenNumbers();
    }

    public static void inputEvenNumbers(){
       Scanner userInput5 = new Scanner(System.in);
       System.out.println("Please enter the first even number" );
       int n = userInput5.nextInt();
       if (n % 2 == 0) {
         System.out.println();
       }
       else {
          System.out.println("oops! Please enter event numbers");
       }
    }
}




