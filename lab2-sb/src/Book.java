import java.util.List;

public class Book {
    private String title;
    private List<Author> authors;
    private TableOfContents toc;
    private List<Chapter> chapters;

    public Book(String title, List<Author> authors, TableOfContents toc, List<Chapter> chapters) {
        this.title = title;
        this.authors = authors;
        this.toc = toc;
        this.chapters = chapters;
    }

    public void print() {
        System.out.println("Book: " + title);
        for (Author author : authors) {
            author.print();
        }
        toc.print();
        for (Chapter chapter : chapters) {
            chapter.print();
        }
    }
}
