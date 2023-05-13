package Books;

public class Books {

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

