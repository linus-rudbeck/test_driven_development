package se.distansakademin;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NameManager {

    private ArrayList<String> names = new ArrayList<>();

    public int numberOfNames; // TODO: Pass tests


    public void addName(String name) {
        names.add(name);
        numberOfNames++;
    }

    public String getName(int index) {
        return names.get(index);
    }

    public void removeName(String name) {
        names.remove(name);
        numberOfNames--;
    }

    public void removeAllNames() {
        names = new ArrayList<>();
        numberOfNames = 0;
    }
}
