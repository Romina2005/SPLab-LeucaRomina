package bookmodel.models;

import java.util.ArrayList;
import java.util.List;

public class Book implements Element {
    private String title;
    private List<Author> authors = new ArrayList<>();
    private List<Element> elements = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    @Override
    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
        System.out.println("Authors:");
        for (Author a : authors) {
            a.print();
        }
        System.out.println("\nContent:");
        for (Element e : elements) {
            e.print();
        }
    }
}