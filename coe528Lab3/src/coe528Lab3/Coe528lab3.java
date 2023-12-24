package coe528Lab3;

import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 

/**
 *
 * @author humzahashmi
 */
public class Coe528lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               QueueOfDistinctStrings myQueue = new QueueOfDistinctStrings();
        Scanner scanner = new Scanner(System.in);
        String input;
        
        //general formatting

        System.out.println("Welcome to the Queue of Distinct Strings!");

        while (true) {
            System.out.println("\nPlease Enter your choice:");
            System.out.println("1. Enqueue a string");
            System.out.println("2. Dequeue a string");
            System.out.println("3. Display the queue");
            System.out.println("4. Exit");
            //takes options from above
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the new line character from the buffer

            try {
                switch (choice) {
                    case 1:
                        System.out.println("Enter the string to enqueue:");
                        input = scanner.nextLine();
                        myQueue.enqueue(input);
                        System.out.println("String '" + input + "' enqueued successfully.");
                        break;
                    case 2:
                        String dequeuedString = myQueue.dequeue();
                        System.out.println("Dequeued String: " + dequeuedString);
                        break;
                    case 3:
                        System.out.println(myQueue.toString());
                        break;
                    case 4:
                        System.out.println("Exiting the program.");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    
}
