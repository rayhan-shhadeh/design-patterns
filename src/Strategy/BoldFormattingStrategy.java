package Strategy;

public class BoldFormattingStrategy implements TextFormattingStrategy{
    @Override
    public String formatText(String text) {
        return "<b>" + text + "</b>";
    }
}
