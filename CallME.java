package Assignment_9;

// Class representing a method to be called by multiple threads
public class CallME {
    
    // Method that prints a message enclosed in square brackets with a delay
    synchronized public void call(String msg) {
        System.out.print("[ " + msg); // Print the beginning of the message in brackets
        try {
            Thread.sleep(1000); // Introduce a delay to simulate processing
        } catch (Exception e) {
            // Handle any exceptions that might occur during sleep (unlikely here)
        }
        System.out.println(" ]"); // Print the closing bracket and newline
    }
}
