package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    public int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
//        System.out.println(nextId);
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        // this(); calls the first constructor
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
    @Override
    public String toString(){
        // TODO: WASH RINSE REPAT FOR EACH FIELD
        String name;
        String employer;
        String location;
        String positionType;
        String coreCompetency;
        if(this.name != "" && this.name != null){
            name = this.name;
        } else {
            name = "Data not available";
        }
        if(this.employer.getValue() != "" && this.employer.getValue() != null){
            employer = this.employer.getValue();
        } else {
            employer = "Data not available";
        }
        if(!this.location.getValue().isEmpty() && this.location.getValue() != null){
            location = this.location.getValue();
        } else {
            location = "Data not available";
        }
        if(this.positionType.getValue() != "" && this.positionType.getValue() != null){
            positionType = this.positionType.getValue();
        } else {
            positionType = "Data not available";
        }
        if(this.coreCompetency.getValue() != "" && this.coreCompetency.getValue() != null){
            coreCompetency = this.coreCompetency.getValue();
        } else {
            coreCompetency = "Data not available";
        }

        String job =
                "\n " + "ID:" + " " + this.getId() +
                "\n " + "Name:" + " " + name +
                "\n " + "Employer:" + " " + employer +
                "\n " + "Location:" + " " + location +
                "\n " + "Position Type:" + " " + positionType +
                "\n " + "Core Competency:" + " " + coreCompetency + "\n";

        return job;
    }
}
