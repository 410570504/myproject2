package com.kcy.ticket;

public class Ticket<start> {
    public static final int TAIPEI_STATION = 100;
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHSIUNG_STATION = 300;

    Station start;
    Station destination;
    int price;

    public Ticket(Station start, Station destination) {
        this.start = start;
        this.destination = destination;
        if (start == Station.TAIPEI_STATION) {
            price = 600;
        } else {
            price = 1500;
        }
        if (start == Station.TAICHUNG_STATION) {
            price = 600;
        } else {
            price = 900;
        }
        if (start == Station.KAOHSIUNG_STATION) {
            price = 900;
        } else {
            price = 1500;
        }
        public void print(){
            System.out.print(start.name + "/t" + destination.name + "/t" + price);
        }
    }
}
