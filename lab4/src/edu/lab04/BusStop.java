package edu.lab04;

import java.util.Arrays;

public class BusStop {
    protected String name;
    protected String[] changes;

    public BusStop(String name) {
        this.name = name;
    }

    public BusStop(String name, String... changes) {
        this.name = name;
        setChanges(changes);
    }

    public String toString(){
        return "  przystanek: " + name + ", przesiadki: " + (changes!= null ? Arrays.toString(changes) : "-brak-");
    }

    // Getery i settery
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getChanges() {
        return changes;
    }

    public void setChanges(String... changes){
        if(changes == null || changes.length == 0){
            this.changes = null;
        }else{
            this.changes = changes;
        }
    }


}
