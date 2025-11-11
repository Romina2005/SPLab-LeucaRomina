package bookmodel.models;

import jakarta.persistence.Entity;

@Entity
public class Section extends BaseElement {

    private String text;

    public Section() {}

    public Section(String text) {
        this.text = text;
    }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
}
