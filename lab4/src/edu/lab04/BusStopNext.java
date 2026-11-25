package edu.lab04;

public class BusStopNext extends BusStop{
    protected int nextDist = 0;
    protected float nextTime = 0.0f;


    public BusStopNext(String name, int nextDist, float nextTime, String... changes) {
        super(name, changes);
        this.nextDist = nextDist;
        this.nextTime = nextTime;
    }

    public BusStopNext(String name, int nextDist, float nextTime) {
        super(name);
        this.nextDist = nextDist;
        this.nextTime = nextTime;
    }

    @Override
    public String toString() {
        return super.toString() + ", nastepny przystanek: " + nextDist + " m, " + nextTime + " minut";
    }

    //Gettery i Settery
    public int getNextDist() {
        return nextDist;
    }

    public void setNextDist(int nextDist) {
        this.nextDist = nextDist;
    }

    public float getNextTime() {
        return nextTime;
    }

    public void setNextTime(float nextTime) {
        this.nextTime = nextTime;
    }
}
