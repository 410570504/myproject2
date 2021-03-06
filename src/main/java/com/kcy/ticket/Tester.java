package com.kcy.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        //Constructor, constant value
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station?(1: Taipei, 2: Taichung, 3: Kaohsiung)");
        int choice = Integer.parseInt(scanner.next());
        Station start = null;
        Station destination = null;
        switch (choice){
            case 1:
                start=Station.TAIPEI_STATION;
                break;
            case 2:
                start=Station.TAICHUNG_STATION;
                break;
            case 3:
                start=Station.KAOHSIUNG_STATION;
                break;
        }
        System.out.println("Your destination?(1.Taipei,2.Taichung,3.Kaohsiung)");
        switch (choice) {
            case 1:
                destination = Station.TAIPEI_STATION;
                break;
            case 2:
                destination = Station.TAICHUNG_STATION;
                break;
            case 3:
                destination = Station.KAOHSIUNG_STATION;
                break;
        }
        //
        System.out.println("Which kinds of tickets? 1)Normal Ticket 2)Student Ticket 3)");
        choice = Integer.parseInt(scanner.next());
        Ticket ticket =null;
        switch(choice) {
            case 1:
                ticket = new Ticket(start, destination);
                break;
            case 2:
                ticket = new Ticket(start, destination);
                break;
        }
    }
}
