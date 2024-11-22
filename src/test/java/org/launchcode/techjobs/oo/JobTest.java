package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    //Job class tests each constructor
    @Test
    public void testJobConstructor() {
        Job job = new Job("Web Designer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Manager"), new CoreCompetency("Curiosity"));
        assertEquals("Web Designer", job.getName());
        assertEquals("LaunchCode", job.getEmployer().getValue());
        assertEquals("St. Louis", job.getLocation().getValue());
        assertEquals("Manager", job.getPositionType().getValue());
        assertEquals("Curiosity", job.getCoreCompetency().getValue() );
    }

    @Test
    public void testEqualityJobClass() {
        Job job1 = new Job("Web Designer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Manager"), new CoreCompetency("Curiosity"));
        Job job2 = new Job("Web Designer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Manager"), new CoreCompetency("Curiosity"));

        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringIncludesAllClasses() {
        Job job = new Job("Web Designer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Manager"), new CoreCompetency("Curiosity"));
        String output = job.toString();
        assertTrue(output.contains("ID: " + job.getId()));
        assertTrue(output.contains("Name: Web Designer"));
        assertTrue(output.contains("Employer: LaunchCode"));
        assertTrue(output.contains("Location: St. Louis"));
        assertTrue(output.contains("Position: Manager"));
        assertTrue(output.contains("Core Competency: Curiosity"));






    }


}
