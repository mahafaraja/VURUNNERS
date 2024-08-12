import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Arrays containing runner names and their times
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

        // Initialize variables to store indices of the fastest and second fastest runners
        int fastestIndex = 0;
        int secondFastestIndex = -1;

        // Iterate through the times array to find the fastest runner
        for (int i = 1; i < times.length; i++) {
            if (times[i] < times[fastestIndex]) {
                // Update second fastest index before updating the fastest index
                secondFastestIndex = fastestIndex;
                fastestIndex = i;
            } else if (secondFastestIndex == -1 || times[i] < times[secondFastestIndex]) {
                // Update the second fastest index if current time is better
                secondFastestIndex = i;
            }
        }

        // Print results
        System.out.println("Fastest runner:");
        System.out.println("Name: " + names[fastestIndex] + ", Time: " + times[fastestIndex] + " minutes\n");

        System.out.println("Second fastest runner:");
        System.out.println("Name: " + names[secondFastestIndex] + ", Time: " + times[secondFastestIndex] + " minutes");
        }
    }
