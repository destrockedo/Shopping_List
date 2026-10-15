package com.pluralsight;

import java.util.Scanner;

public class shoppinglist {

    static boolean newVariable;

    public static void main(String[] args) {
        System.out.println("Eggs");
        System.out.println("Noodles");
        System.out.println("Milk");
        System.out.println("Ceral");
        System.out.println("Burgers");
        System.out.println("WAffles");
        System.out.println("Bacon");
        System.out.println("French fries");
        System.out.println("Pancakes");
        System.out.println("Corn on the COBBB");

        String[] shoppingList = {
                "Eggs", "Noodles", "Milk", "Cereal", "Burgers", "Waffles", "Bacon", "French fries", "Pancakes", "Corn on the COBB"

        };
        int number = 11+12+13;
        //Dont use float interesting
        //float nned F in it to work? Odd
        float bingerbong = 1.12F;
        double bingbong = 12.78;
        //char One letter
        char grade = 'a';
        boolean isStudent = true;
        System.out.println(java.util.Arrays.toString(shoppingList));
        System.out.println(number);
        //upercase letter makes them officail better
        // long is just in for larger number us L at end
        //under _ can be use to seprate them aswell 8_000
        long mybraincapacity = 100000000000L;
        //local variable are these can work inside ther own boxes static work everywhere
        System.out.println(newVariable);
        //final makes varible uncchageable also need all caps READ ONLY VARIBLE
        final int BIG_MACS =  20;
        //use () to actaull add them
        System.out.println("Sum: " + 1 + 2);
        System.out.println(1+2+ "bang");
        //ADDing / subtracting
        double firstNumber = 14;
        double secondNumber = 13;
        double result;
        result = firstNumber + secondNumber;
        System.out.println(result);
        result = firstNumber - secondNumber;
        System.out.println(result);
        result = firstNumber / secondNumber;
        System.out.println(result);
        result = firstNumber * secondNumber;
        System.out.println(result);
        //Forgot what this one does
        result = firstNumber % secondNumber;
        System.out.println(result);
        // Pre and post increment
        int x = 6;
        x = x + 1;
        //same thing
        x++;
        ++x;
        int a = 5;
        int b = a++;
        //A give the 5 value to B before it adds the ++, if ++ is first b will tak value of a after ++
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        //Widening
        int inte = 10;
        long rer = inte;
        // narrowing casting
        double bignumber = 123.45678901236876786;
        //Forceing double var to be a float but loses data
        float bumber = (float)bignumber;
        System.out.println(bignumber);
        // Doesnt work because your placing big number itno smaller varible hold
        double value = 12.867908098;
        long wholeNumber = Math.round(value);
        System.out.println(wholeNumber);
        int answer = 0;
        answer = answer + 10; // answer += 10;
        System.out.print("Hello ");
        System.out.println("World!");


// Formatting output

        float subtotal = 22.87f;
        float tax = subtotal * 0.0825f;
        float totalDue = subtotal + tax;
        System.out.println(totalDue);
        String formattedTotalDue = String.format("%.2f", totalDue);
        System.out.println(formattedTotalDue);

        System.out.printf("Total due is: %.2f", totalDue);

        // Format specifiers
        System.out.println("========== Format specifiers ==========");
        int id = 10135;
        String name = "Brandon Plyers";
        float pay = 5239.77f;

        System.out.printf("%s (id: %d) $%.2f%n", name, id, pay);
        //Should normally have this at the top
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your age");
        String agecheck = myScanner.nextLine();

        System.out.println(agecheck + " is lowkey crazy");
        //Reading Numbers
        System.out.println("Enter First Number: ");
        int firssNumber = myScanner.nextInt();
        System.out.println("Enter Second Number: ");
        int secondsNumber = myScanner.nextInt();

        int sums = firssNumber + secondsNumber;
        System.out.println("the sum is: " + sums);

        // The leftover Enter
        System.out.println("========== The leftover Enter ==========");

        System.out.println("How old are you?");
        int age = myScanner.nextInt();

        System.out.println("How many pets do you have? ");
        int pets = myScanner.nextInt();
        myScanner.nextLine();

        System.out.println("What is your name? ");
        String fullName = myScanner.nextLine();

        System.out.println("Hello " + fullName + ", " + age + " years old, " + pets + " pets.");






    }
}

