package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = input.nextLine();
        String[] fullName = name.split(" ");
        String firstName = fullName[0];
        String lastName = fullName[1];


        System.out.println("What date will you be coming(MM/dd/yyyy)");
        String date = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate correctDate = LocalDate.parse(date, formatter);


        System.out.println("How many tickets would you like?");
        int tickets = input.nextInt();
        if (tickets == 1){
            System.out.println(tickets + " ticket reserved for " + correctDate + " under " + lastName + ", " + firstName );
        } else {
            System.out.println(tickets + " tickets reserved for " + correctDate + " under " + lastName + ", " + firstName );
        }

    }
}
