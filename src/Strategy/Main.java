package Strategy;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.setTextFormattingStrategy(new ItalicFormattingStrategy());
        System.out.println(textEditor.formatText("try Italic"));
    }
}