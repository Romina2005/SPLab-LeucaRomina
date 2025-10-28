package bookmodel;

import bookmodel.models.Element;

public class TableOfContents implements Element {
    private String content;

    public TableOfContents(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Table of Contents: " + content);
    }
}