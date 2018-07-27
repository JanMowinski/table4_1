package main;

import java.util.ArrayList;
import java.util.List;

public class CargoShip {
    private String name;
    private final int MAX_STAFF_AMOUNT;
    private List<CrewMember> crewMembers;

    public CargoShip(String name, int MAX_STAFF_AMOUNT, List<CrewMember> crewMembers) {
        if(name == null || name.isEmpty()) throw new IllegalArgumentException("Empty or null name.");
        this.name = name;
        if(MAX_STAFF_AMOUNT <= 0) throw new IllegalArgumentException("Non-positive max staff amount.");
        this.MAX_STAFF_AMOUNT = MAX_STAFF_AMOUNT;
        this.crewMembers = new ArrayList<>(MAX_STAFF_AMOUNT);
        if(crewMembers != null) {
            if(crewMembers.size() > MAX_STAFF_AMOUNT) throw  new IllegalArgumentException("Initial amount of crew members greater than maximum.");
            crewMembers.forEach(c -> AddCrewMember(c));
        }
    }

    public CargoShip(String name, int MAX_STAFF_AMOUNT) {
        this(name, MAX_STAFF_AMOUNT, null);
    }

    public boolean AddCrewMember(CrewMember crewMember){
        if(crewMember == null) return false;
        if(crewMembers.size() >= MAX_STAFF_AMOUNT) return false;
        if(crewMembers.contains(crewMember)) return false;
        return crewMembers.add(crewMember);
    }

    public boolean RemoveCrewMember(CrewMember crewMember){
        if(crewMember == null) return false;
        return crewMembers.remove(crewMember);
    }

    public int availableSpaces(){
        return MAX_STAFF_AMOUNT - crewMembers.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMAX_STAFF_AMOUNT() {
        return MAX_STAFF_AMOUNT;
    }

    public List<CrewMember> getCrewMembers() {
        return crewMembers;
    }

    public void setCrewMembers(List<CrewMember> crewMembers) {
        this.crewMembers = crewMembers;
    }
}
