package org.launchcode.techjobs_oo.Test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobsTest {
    Job testJob1;
    Job testJob2;
    Job testJob3;
    Job testJobSemiFilled;
    Job testJobOnlyID;

    @Before
    public void createJobObject1(){
        testJob1 = new Job("Junior Web Developer", new Employer("Cozy"), new Location("Portland"), new PositionType("Web - Back End"), new CoreCompetency("Ruby"));
        testJob2 = new Job("Junior Data Analyst", new Employer("Intel"), new Location("St. Louis"), new PositionType("Web - Back End"), new CoreCompetency("Python"));
        testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJobSemiFilled = new Job("Software Engineer", new Employer("JavaLamps"), new Location(""), new PositionType(""), new CoreCompetency(""));
        testJobOnlyID = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    }

    @Test
    public void testSettingJobId(){
        assertEquals(1, testJob2.getId()-testJob1.getId(), 0.001);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(testJob3 instanceof Job);
        assertNotNull(testJob3);
    }

    @Test
    public void testJobsForEquality(){
        Job testJobEqual1 = new Job("Front-end developer", new Employer("Cookie"), new Location("Memphis"), new PositionType("Web - Front End"), new CoreCompetency("JavaScript"));
        Job testJobEqual2 = new Job("Front-end developer", new Employer("Cookie"), new Location("Memphis"), new PositionType("Web - Front End"), new CoreCompetency("JavaScript"));
        assertNotEquals(testJobEqual1, testJobEqual2);
    }

    @Test
    public void testFilledtoString(){
        String expected = "\n" +
                "ID: " + testJob1.getId() + "\n" +
                "Name: " + testJob1.getName() + "\n" +
                "Employer: " + testJob1.getEmployer() + "\n" +
                "Location: " + testJob1.getLocation() + "\n" +
                "Position Type: " + testJob1.getPositionType() + "\n" +
                "Core Competency: " + testJob1.getCoreCompetency() + "\n";
        assertEquals(expected, testJob1.toString());
    }

    @Test
    public void testSemiFilledtoString(){
        String expected = "\n" +
                "ID: " + testJobSemiFilled.getId() + "\n" +
                "Name: " + testJobSemiFilled.getName() + "\n" +
                "Employer: " + testJobSemiFilled.getEmployer() + "\n" +
                "Location: " + "Data not available" + "\n" +
                "Position Type: " + "Data not available" + "\n" +
                "Core Competency: " + "Data not available" + "\n";
        assertEquals(expected, testJobSemiFilled.toString());
    }

    @Test
    public void testOnlyIDtoString(){
        String expected = "OOPS! This job does not seem to exist.";
        assertEquals(expected, testJobOnlyID.toString());
    }
}
