package Strategy;

public class TextEditor {
    private TextFormattingStrategy textFormattingStrategy;



    public void setTextFormattingStrategy(TextFormattingStrategy strategy) {
        this.textFormattingStrategy = strategy;
    }

    public String formatText(String text) {
        return textFormattingStrategy.formatText(text);
    }
}
