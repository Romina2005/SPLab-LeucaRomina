package bookmodel.models;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private String title;
    private List<Element> children = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void add(Element element) {
        children.add(element);
    }

    @Override
    public void print() {
        System.out.println("Section: " + title);
        for (Element e : children) {
            e.print();
        }
    }
}