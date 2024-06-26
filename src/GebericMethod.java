public class GebericMethod {
    // A generic method with two type parameters
//    public static: This indicates that the method is accessible from outside the class (public) and belongs to the class itself rather than any particular instance of the class (static).
//
//<T, U>: This is the type parameter section. It specifies that this method uses two generic types, T and U. These are placeholders for actual types that will be provided when the method is called. They can be any type, such as Integer, String, Double, etc.
    public static <T, U> void printPair(T first, U second) {
        System.out.println("First: " + first + ", Second: " + second);
    }

    public static void main(String[] args) {
        // Calling the generic method with different types
        printPair("Age", 25); // Output: First: Age, Second: 25
        printPair(3.14, "Pi"); // Output: First: 3.14, Second: Pi
        printPair('A', true); // Output: First: A, Second: true
    }
}
