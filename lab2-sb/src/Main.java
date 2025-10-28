import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Alice");
        Author author2 = new Author("Bob");

        Paragraph p1 = new Paragraph("Introduction to Java.");
        Image img1 = new Image("java_diagram.png");
        Table t1 = new Table("Syntax Table");

        SubChapter sc1 = new SubChapter("Basics",
                Arrays.asList(p1),
                Arrays.asList(img1),
                Arrays.asList(t1));

        Chapter ch1 = new Chapter("Getting Started", Arrays.asList(sc1));

        TableOfContents toc = new TableOfContents();

        Book book = new Book("Java Programming",
                Arrays.asList(author1, author2),
                toc,
                Arrays.asList(ch1));

        book.print();
    }
}
