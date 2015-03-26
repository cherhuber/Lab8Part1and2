/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cheryl
 */
public class ElevatorTest {
    Building b2 = new Building();
    public ElevatorTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        Building b = new Building();
        Elevator e = new Elevator(b);
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("TEARDOWN CLASS RUNNING -- Nothing to do");
    }

    /**
     * Test of getCurFloor method, of class Elevator.
     */
    @Test
    public void testGetCurFloor() {
        System.out.println("getCurFloor");
        Elevator instance = new Elevator(b2);
        int expResult = 0;
        int result = instance.getCurFloor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDirection method, of class Elevator.
     */
    @Test
    public void testGetDirection() {
        System.out.println("getDirection");
        Elevator instance = new Elevator(b2);
        boolean expResult = true;
        boolean result = instance.getDirection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumPassengers method, of class Elevator.
     */
    @Test
    public void testGetNumPassengers() {
        System.out.println("getNumPassengers");
        Elevator instance = new Elevator(b2);
        int expResult = 0;
        int result = instance.getNumPassengers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Elevator.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Elevator instance = new Elevator(b2);
        int expResult = 0;
        int result = instance.move();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class Elevator.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        Elevator instance = new Elevator(b2);
        instance.stop();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of boardPassenger method, of class Elevator.
     */
    @Test
    public void testBoardPassenger() throws Exception {
        System.out.println("boardPassenger");
        int destNum = 3;
        Elevator instance = new Elevator(b2);
        instance.boardPassenger(destNum);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Elevator.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Elevator instance = new Elevator(b2);
        String expResult = "Current Passengers: 0"+"\tCurrent Floor: 1"+"\tDirection: Up";
        System.out.println(instance.toString());
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
