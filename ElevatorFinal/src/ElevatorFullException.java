/**
 *
 * @author cheryl Huber Comp350
 * Lab3 Part 3
 */
public class ElevatorFullException extends Exception {
    public ElevatorFullException (String message){
        super(message);
    }
    public ElevatorFullException (){
        super("The elevator is full.  Please wait.");
    }
}
