import java.util.List;

public class SubChapter {
    private String name;
    private List<Paragraph> paragraphs;
    private List<Image> images;
    private List<Table> tables;

    public SubChapter(String name, List<Paragraph> paragraphs, List<Image> images, List<Table> tables) {
        this.name = name;
        this.paragraphs = paragraphs;
        this.images = images;
        this.tables = tables;
    }

    public void print() {
        System.out.println("  SubChapter: " + name);
        for (Paragraph p : paragraphs) {
            p.print();
        }
        for (Image i : images) {
            i.print();
        }
        for (Table t : tables) {
            t.print();
        }
    }
}
