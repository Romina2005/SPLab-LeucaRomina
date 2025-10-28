package bookmodel.services;

import bookmodel.models.Element;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }

    public void setAlignStrategy(AlignStrategy strategy) {
        this.alignStrategy = strategy;
    }

    @Override
    public void print() {
        if (alignStrategy == null) {
            System.out.println("Paragraph: " + text);
        } else {
            alignStrategy.render(this, new Context());
        }
    }

    public String getText() {
        return text;
    }
}