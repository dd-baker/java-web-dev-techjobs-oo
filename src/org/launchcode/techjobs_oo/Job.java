package org.launchcode.techjobs_oo;

import org.junit.Test;

import java.util.Objects;

public class Job {

    private int id;
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
        id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency){
        this();
        name = aName;
        employer = aEmployer;
        location = aLocation;
        positionType = aPositionType;
        coreCompetency = aCoreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static String toString(Job aJob) {
        int aID = aJob.getId();
        String aName = aJob.getName();
        String aEmployer = aJob.getEmployer().toString();
        String aLocation = aJob.getLocation().toString();
        String aPositionType = aJob.getPositionType().toString();
        String aCoreCompetency = aJob.getCoreCompetency().toString();

        return " \n" + "ID: " + aID + "\nName: " + aName + "\nEmployer: " + aEmployer +"\nLocation: " + aLocation + "\nPosition Type: " + aPositionType + "\nCore Competency: " + aCoreCompetency +"\n ";
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
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
    public int getId() {

        return id;
    }
}
