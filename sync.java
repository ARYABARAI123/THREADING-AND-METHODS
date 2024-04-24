package Assignment_9;

// Main class to demonstrate synchronization
public class Sync {
    public static void main(String[] args) {
        // Creating a shared object of CallME
        CallME target = new CallME();
        
        // Creating three instances of Caller, each targeting the same CallME object
        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "Synchronised");
        Caller ob3 = new Caller(target, "World");
        
        // Starting the threads for each Caller
        ob1.t.start();
        ob2.t.start();
        ob3.t.start();
        
        try {
            // Waiting for all threads to complete execution
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (Exception e) {
            // Handling any exceptions that might occur during thread execution
            e.printStackTrace();
        }
    }
}
