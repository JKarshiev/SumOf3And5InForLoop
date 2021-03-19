//Create a for statement using a range of numbers from 1 to 1000 inclusive
//Sum all the numbers that can be divided with both 3 and also 5
//For those numbers that met the above conditions, print out the number
//break out the for loop once you find 5 numbers that met the above conditions
//After breaking out of the loop print the sum of the numbers that met above conditions
// All typed in main method
package com.karshiev;

public class Main {

    public static void main(String[] args) {
	int counter = 0;
	int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                counter++;
                System.out.println("This can be divided by both 3 and 5: " + i);
                sum += i;
                if (counter == 5){
                    break;
                }
            }
        }
        System.out.println("This is the sum of numbers that can be divided by 3 and 5: " + sum);
    }
}
