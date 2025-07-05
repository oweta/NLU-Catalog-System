import java.util.Scanner;

public class CountUgandaOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt librarian for description
        System.out.println("Enter a book description:");
        String description = scanner.nextLine();

        // Convert to lowercase for case-insensitive comparison
        String lowerDescription = description.toLowerCase();

        // Split the string into words using whitespace and punctuation
        String[] words = lowerDescription.split("[\\s.,;!?]+");

        int count = 0;

        for (String word : words) {
            if (word.equals("uganda")) {
                count++;
            }
        }

        System.out.println("\nThe word \"Uganda\" appears " + count + " time(s) in the description.");
        
        scanner.close();
    }
}
