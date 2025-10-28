package bookmodel.services;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println("<< " + paragraph.getText() + " >>");
    }
}