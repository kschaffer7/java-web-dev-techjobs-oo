package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    //TODO: Create two Job objects using the empty constructor.
    // Instead of creating the Job objects inside the test method, you could declare and initialize them using @Before.

    // using @Before did not work with the auto incrementing ID. Job objects put inside the tests
//    Job test_job1;
//    Job test_job2;
//    Job test_job3;
//    Job test_job4;

//    @Before
//    public void createJobObjects() {
//        test_job1 = new Job();
//        test_job2 = new Job();
//        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//    }

    //TODO: define a test called testSettingJobId.
    // Use assertEquals, assertTrue, or assertFalse to test that the ID values for the two objects are NOT the same and differ by 1.
    @Test
    public void testSettingJobId() {
        Job test_job1 = new Job();
        Job test_job2 = new Job();
        assertTrue("Not the same, differs by 1", (test_job2.getId() - test_job1.getId()) == 1);
    }

    //TODO: Use assert statements to test that the constructor correctly assigns the class and value of each field.
    // The instanceof keyword can be used to check the class of an object. The result of the comparison is a boolean.
    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue("Check for job name", (test_job3.getName() == "Product tester"));
        assertTrue("Check for Employer", (test_job3.getEmployer().getValue() == "ACME"));
        assertTrue("Check for Location", (test_job3.getLocation().getValue() == "Desert"));
        assertTrue("Check for Position Type", (test_job3.getPositionType().getValue() == "Quality control"));
        assertTrue("Check for Core Competency", (test_job3.getCoreCompetency().getValue() == "Persistence"));
        assertEquals(3, test_job3.getId());
    }

    //TODO: Generate two Job objects that have identical field values EXCEPT for id. Test that equals returns false.
    @Test
    public void testJobsForEquality() {
        Job test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test_job4 == test_job5);
    }

}
