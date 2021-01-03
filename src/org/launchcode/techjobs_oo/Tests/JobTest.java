package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;

public class JobTest {

    //TODO: Define a test called testSettingJobId.
    // Create two Job objects using the empty constructor.
    // Use assertEquals, assertTrue, or assertFalse to test that the ID values for the two objects are NOT the same and differ by 1.
    @Test
    public void testSettingJobId() {
        Job test_job1 = new Job();
        Job test_job2 = new Job();
        assertEquals("Not the same, differs by 1", 1, (test_job2.getId() - test_job1.getId()));
    }

    //TODO: Use assert statements to test that the constructor correctly assigns the class and value of each field.
    // The instanceof keyword can be used to check the class of an object. The result of the comparison is a boolean.
    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Check for job name", "Product tester", test_job1.getName());
        assertEquals("Check for Employer", "ACME", test_job1.getEmployer().getValue());
        assertEquals("Check for Location", "Desert", test_job1.getLocation().getValue());
        assertEquals("Check for Position Type", "Quality control", test_job1.getPositionType().getValue());
        assertEquals("Check for Core Competency", "Persistence", test_job1.getCoreCompetency().getValue());
        assertTrue("Check for id", test_job1.getId() > 0);
    }

    //TODO: Generate two Job objects that have identical field values EXCEPT for id. Test that equals returns false.
    @Test
    public void testJobsForEquality() {
        Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test_job1.equals(test_job2));
    }

    //TODO: Use TDD to Build The toString Method
    // When passed a Job object, it should return a string that contains a blank line before and after the job information.
    @Test
    public void toStringHasBlanks() {
        Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job1.toString().contains(" "));
    }

    // TODO: The string should contain a label for each field
    @Test
    public void toStringHasLabels() {
        Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job1.toString().contains("ID"));
    }

    // TODO: THe string should contain the data stored in each field. Each field should be on its own line.
    @Test
    public void toStringHasLabelsDataAndNewLine() {
        Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job1.toString().contains("ID"));
        assertTrue(test_job1.toString().contains("ACME"));
        assertTrue(test_job1.toString().contains("\n "));
    }

    // TODO: If a field is empty, the method should add, “Data not available” after the label.
    @Test
    public void toStringHasEmptyFieldDataWarning() {
        Job test_job1 = new Job("Product tester", new Employer("Potato Company"), new Location(""), new PositionType(""), new CoreCompetency(""));
//        System.out.println(test_job1.toString());
        assertTrue("Testing for unavailable data", test_job1.toString().contains("Data not available"));
    }

    //TODO: (Bonus) If a Job object ONLY contains data for the id field, the method should return, “OOPS! This job does not seem to exist.”
}
