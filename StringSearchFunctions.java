public class StringSearchFunctions {
    public static void main(String[] args) {
        String userQuery = "animal farm";
        String bookTitle = "Animal Farm";

        // Using equalsIgnoreCase
        if (userQuery.equalsIgnoreCase(bookTitle)) {
            System.out.println("Match found using equalsIgnoreCase");
        }

        // Using toLowerCase
        if (userQuery.toLowerCase().equals(bookTitle.toLowerCase())) {
            System.out.println("Match found using toLowerCase");
        }
    }
}
