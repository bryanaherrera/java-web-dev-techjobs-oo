package org.launchcode.techjobs_oo;

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

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
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
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
//        return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    @Override
    public String toString() {
//        return  "ID: " + id + "\n" +
//                "Name: " + name + "\n" +
//                "Employer: " + employer + "\n" +
//                "Location: " + location + "\n" +
//                "Position Type: " + positionType + "\n" +
//                "Core Competency: " + coreCompetency + "\n"
//                ;
//        if(!name.equals("") && employer != null && location != null && positionType != null && coreCompetency!= null){
//            return "\n" +
//                    "ID: " + id + "\n" +
//                    "Name: " + name + "\n" +
//                    "Employer: " + employer + "\n" +
//                    "Location: " + location + "\n" +
//                    "Position Type: " + positionType + "\n" +
//                    "Core Competency: " + coreCompetency + "\n";
//        }
//        else if(name.equals("") && employer == null && location == null && positionType == null && coreCompetency== null){
//            return "OOPS! This job does not seem to exist.";
//        }
//        else
        if(name.equals("") && employer.getValue().equals("") && location.getValue().equals("") && positionType.getValue().equals("") && coreCompetency.getValue().equals("")) {
            return "OOPS! This job does not seem to exist.";
        } else {
            String output = "\n" + "ID: " + id + "\n";
            if(name.equals("")) {
                output = output + "Name: " + "Data not available" + "\n";
            } else {
                output = output + "Name: " + name + "\n";
            }
            if(employer.getValue().equals("")){
                output = output + "Employer: " + "Data not available" + "\n";
            } else{
                output = output + "Employer: " + employer + "\n";
            }
            if(location.getValue().equals("")){
                output = output + "Location: " + "Data not available" + "\n";
            } else{
                output = output + "Location: " + location + "\n";
            }
            if(positionType.getValue().equals("")){
                output = output + "Position Type: " + "Data not available" + "\n";
            } else{
                output = output + "Position Type: " + positionType + "\n";
            }
            if(coreCompetency.getValue().equals("")){
                output = output + "Core Competency: " + "Data not available" + "\n";
            } else{
                output = output + "Core Competency: " + coreCompetency + "\n";;
            }
            return output;
        }
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
}
