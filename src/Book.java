public class Book {

    private final String title;

    private int publishDate;

    private final Author author;
    public Book (String title, int publishDate, Author author) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public Author getAuthor() {
        return author;
    }


}
