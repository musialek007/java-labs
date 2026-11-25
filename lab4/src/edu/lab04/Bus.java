package edu.lab04;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    private static String company;
    static{
        company = "MPK Krakow";
    }
    private int number;
    private List<BusStop> route;
    {
        route = new ArrayList<>();
    }

    public Bus(int number) {
        this.number = number;
    }

    public void addBusStop(String name){
        route.add(new BusStop(name));
    }

    public void addBusStop(String name, String... changes){
        route.add(new BusStop(name, changes));
    }

    public void addBusStop(String name, int nextDist, float nextTime){
        route.add(new BusStopNext(name, nextDist, nextTime));
    }

    public void addBusStop(String name, int nextDist, float nextTime, String... changes){
        route.add(new BusStopNext(name, nextDist, nextTime, changes));
    }

    @Override
    public String toString() {
        String myString = "POJAZD NR. " + number +". Przewoznik: " + company + ". Trasa:\n";
        for(BusStop bs : route){
            myString += bs + "\n";
        }
        return myString;
    }


}
