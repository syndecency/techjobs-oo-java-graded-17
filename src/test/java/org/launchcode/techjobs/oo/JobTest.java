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

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
    }

    //Job class tests each constructor
    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue() );
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String output = job.toString();
        assertTrue(output.contains("ID: " + job.getId()));
        assertTrue(output.contains("Name: Product tester"));
        assertTrue(output.contains("Employer: ACME"));
        assertTrue(output.contains("Location: Desert"));
        assertTrue(output.contains("Position Type: Quality control"));
        assertTrue(output.contains("Core Competency: Persistence"));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String output = job.toString();

        assertTrue(output.startsWith(System.lineSeparator()));
        assertTrue(output.endsWith((System.lineSeparator())));
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("Product tester", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String output = job.toString();

        assertTrue(output.contains("Location: Data not available"));
        assertTrue(output.contains("Employer: Data not available"));
        assertTrue(output.contains("Position Type: Data not available"));
        assertTrue(output.contains("Core Competency: Data not available"));



    }




}
