package Assignment_9;

// Class representing a Caller which implements the Runnable interface
public class Caller implements Runnable {
    Thread t;       // Thread instance associated with this Caller
    String msg;     // Message to be passed to the CallME object
    CallME target;  // Reference to the CallME object to be called

    // Constructor to initialize the Caller with a target CallME object and a message
    public Caller(CallME targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this); // Creating a new Thread for this Caller (Runnable)
    }

    // Run method implementation required by Runnable interface
    @Override
    public void run() {
        synchronized (target) { // Synchronizing on the target object to ensure thread safety
            target.call(msg);   // Calling the 'call' method of the target CallME object
        }
    }
}
