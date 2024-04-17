package Strategy;

public class ItalicFormattingStrategy implements TextFormattingStrategy{
    @Override
    public String formatText( String text) {
        return "<i>" + text + "</i>";
    }
}
