import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("========================================\n");

        // Create a LinkedHashSet to maintain insertion order with uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies in sequence
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt duplicate insertion - will be ignored automatically
        trainFormation.add("Sleeper"); // Duplicate entry

        System.out.println("Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        System.out.println("\nNote:");
        System.out.println("Duplicate 'Sleeper' was ignored by LinkedHashSet.");
        System.out.println("Insertion order is maintained unlike HashSet.");

        System.out.println("\nUC5 ordered uniqueness validation completed...");
    }
}