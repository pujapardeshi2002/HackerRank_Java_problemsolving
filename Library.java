public class Library {
    private static int totalBooks = 0;

    public static void addBook() {
        totalBooks++;
    }

    public static void removeBook() {
        if (totalBooks > 0) {
            totalBooks--;
        }
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public static void main(String[] args) {
        Library.addBook();
        Library.addBook();

        System.out.println("Total books in the library: " + Library.getTotalBooks());

        Library.removeBook();

        System.out.println("Total books in the library: " + Library.getTotalBooks());
    }
}
