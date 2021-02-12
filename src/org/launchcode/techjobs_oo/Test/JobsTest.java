package org.launchcode.techjobs_oo.Test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobsTest {
    Job testJob1;
    Job testJob2;
    Job testJob3;

    @Before
    public void createJobObject1(){
        testJob1 = new Job("Junior Web Developer", new Employer("Cozy"), new Location("Portland"), new PositionType("Web - Back End"), new CoreCompetency("Ruby"));
        testJob2 = new Job("Junior Data Analyst", new Employer("Intel"), new Location("St. Louis"), new PositionType("Web - Back End"), new CoreCompetency("Python"));
        testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
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
}
