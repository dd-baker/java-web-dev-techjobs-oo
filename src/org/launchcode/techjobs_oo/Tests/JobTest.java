package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void emptyTest(){
        assertEquals(true, true);
    }

    String testNameA;
    Employer testEmployerA;
    Location testLocationA;
    PositionType testPositionA;
    CoreCompetency testCoreCompetencyA;
    Job testJobA;

    String testNameB;
    Employer testEmployerB;
    Location testLocationB;
    PositionType testPositionB;
    CoreCompetency testCoreCompetencyB;
    Job testJobB;
    Job testJobC;

    String[] testArr;
    String[] testArrB;

    String testNameD;
    Employer testEmployerD;
    Location testLocationD;
    PositionType testPositionD;
    CoreCompetency testCoreCompetencyD;

    @Before
    public void createJobObject(){
        testNameA = "Bob";
        testEmployerA = new Employer("Boeing");
        testLocationA = new Location("Saint Louis");
        testPositionA = new PositionType("Full Stack");
        testCoreCompetencyA = new CoreCompetency("Java");

        testNameB = "Bob";
        testEmployerB = new Employer("Boeing");
        testLocationB = new Location("Saint Louis");
        testPositionB = new PositionType("Full Stack");
        testCoreCompetencyB = new CoreCompetency("Java");

        testNameD = "";
        testEmployerD = new Employer();
        testLocationD = new Location();
        testPositionD = new PositionType();
        testCoreCompetencyD = new CoreCompetency();

        testJobA = new Job(testNameA, testEmployerA, testLocationA, testPositionA, testCoreCompetencyA);
        testJobB = new Job(testNameB, testEmployerB, testLocationB, testPositionB, testCoreCompetencyB);

        testJobC = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        
        testArr = Job.toString(testJobA).split("\n");
        testArrB = Job.toString(new Job(testNameD,testEmployerD, testLocationD,testPositionD,testCoreCompetencyD)).split("\n");
    }

    @Test
    public void testSettingJobId(){

        assertTrue(testJobA.getId() + 1 == testJobB.getId());
    }
    
    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester", testJobC.getName());
        assertEquals("ACME", testJobC.getEmployer().toString());
        assertEquals("Desert", testJobC.getLocation().toString());
        assertEquals("Quality control", testJobC.getPositionType().toString());
        assertEquals("Persistence", testJobC.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(testJobA.equals(testJobB));
    }

    @Test
    public void testToString_shouldReturnBeforeAfterBlanks(){
        assertTrue(testArr[0].isBlank());
        assertTrue(testArr[testArr.length-1].isBlank());
    }
    @Test
    public void testToString_shouldReturnCorrectFieldData(){
        assertEquals("ID: 1",testArr[1]);
        assertEquals("Name: Bob",testArr[2]);
        assertEquals("Employer: Boeing",testArr[3]);
        assertEquals("Location: Saint Louis",testArr[4]);
        assertEquals("Position Type: Full Stack",testArr[5]);
        assertEquals("Core Competency: Java",testArr[6]);

        System.out.print(testJobA.getId());
        System.out.print(testJobB.getId());
        System.out.print(testJobC.getId());
    }

    @Test
    public void testToString_shouldPrintDataNotAvailableIfEmpty(){
        assertEquals("Employer: Data not available", testArrB[3]);
    }



}