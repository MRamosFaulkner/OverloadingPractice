import java.util.Scanner;
import java.util.ArrayList;

public class BooksMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        Books books1 = new Books("The Hunt for Red October");
        Books books2 = new Books(2003);
        Books books3 = new Books("The Hummingbird", 300, 2003);
        Books books4 = new Books("Toy Story", 5230);


        System.out.print("Books\n");
        System.out.print("Entering nothing will stop the loop\n");

        while (true) {
            System.out.print("Enter the name of the book: ");
            String bookTitle = scanner.nextLine();

            if (bookTitle.equals("")) {
                break;
            }

            System.out.print("Enter the number of pages: ");
            int numOfPages = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the publication year: ");
            int pubYear = scanner.nextInt();
            scanner.nextLine();

            Books book = new Books(bookTitle, numOfPages,pubYear);
            books.add(book);
        }

        System.out.print("What information will be printed? \nEnter 'name' for book titles or 'everything' to print all details: ");
        String option = scanner.nextLine();

        if (option.equals("name")) {
            for (Books book : books) {
                System.out.println(book.getBookTitle());
            }
        } else if (option.equals("everything")) {
            for (Books book : books) {
                System.out.println(book.getBookTitle() + ", " + book.getNumOfPages() +" pages " + book.getPubYear());
            }
//                System.out.println(books.toString());
        }
    }

    public static class Books {

        private String bookTitle;
        private int numOfPages;
        private int pubYear;

        public Books() {}

        public Books(String bookTitle) {
            this.bookTitle = bookTitle;
        }

        public Books(int pubYear) {
            this.pubYear = pubYear;
        }

        public Books(String bookTitle, int numOfPages, int pubYear) {
            this.bookTitle = bookTitle;
            this.numOfPages = numOfPages;
            this.pubYear = pubYear;
        }

        public Books(String bookTitle, int numOfPages) {
            this.bookTitle = bookTitle;
            this.numOfPages = numOfPages;
        }

        public String getBookTitle() {
            return bookTitle;
        }

        public int getNumOfPages() {
            return numOfPages;
        }

        public int getPubYear() {
            return pubYear;
        }

        public void setTitle(String bookTitle) {
            bookTitle = bookTitle;
        }

        public void setNumOfPages(int numOfPages) {
            this.numOfPages = numOfPages;
        }

        public void setPublicationYear(int publicationYear) {
            this.pubYear = publicationYear;
        }

        @Override
        public String toString() {
            return getBookTitle() + ", " + getNumOfPages() + " pages, " + getPubYear();
        }

    }
}
