import java.util.*; // so we can use array methods and ArrayLists

public class Difference_Arrays_ArrayLists {
    public static void main(String[] args) {
        /*
         * ARRAYS
         * - size cannot be dynamically changed after declaration/initializing
         * - holds one type of data
         * - can hold primitive data
         * - this is useful for sets of data that do not change
         * - not useful for expanding upon a set of data
         * - libraries for common functionality
         */

        final int ARRSIZE = 10; // Good Practice for Arrays
        int[] primeArray = new int[ARRSIZE]; // Let's Make the Array Store the First Ten Primes!

        int iteration = 0;
        int num = 2; // Case: First Prime Number

        while (iteration < ARRSIZE) {
            if (prime(num)) { // Only Increment Count if Current Num Is a Prime
                primeArray[iteration] = num;
                iteration++;
            }
            num++;
        }

        // Print the Primes in the Array
        for (int primes : primeArray) {
            System.out.println(primes);
        }

        /*
         * ARRAYLISTS
         * - holds many types of objects
         * - class type
         * - can expand or shrink when appropriate
         * - cannot be used with primitive data types
         * - plenty of methods for common tasks
         */

        ArrayList<String> dogBreeds = new ArrayList<String>(); // syntax for creating ArrayList

        {
            // let's add some data
            dogBreeds.add("Dobermann"); // add method will append array list with data
            dogBreeds.add("Grey Hound");
            dogBreeds.add("Labrador");
            // let's print out the size of the arraylist
            System.out.println("List Size 1: " + dogBreeds.size());
        }

        // let's print the list so we know it actually contains the desired data
        for (String breeds : dogBreeds) {
            System.out.println(breeds);
        }

        {
            // for some arbitrary reason, Grey Hounds are no longer needed in the list
            dogBreeds.remove(1);
            // let's print the size again with the new changes
            System.out.println("List Size 2: " + dogBreeds.size());
        }
        // let's print out the names again to ensure our list has implemented the
        // correct changes
        for (String breeds : dogBreeds) {
            System.out.println(breeds);
        }

    }

    // Method for Determining Primes
    public static boolean prime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}