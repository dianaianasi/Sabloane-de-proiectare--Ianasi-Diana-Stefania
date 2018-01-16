/**
 * Created by secul on 03-Nov-17.
 */
public class Paragraf extends SubjectElement {
    private String text;
    private AlignStrategy x = null;
    private TextSpecial teext = null;

    public Paragraf(String Filename){
        this.text = Filename;
    }

    public void Print(){
        x.printAlign(text);
    }

    public void setAlign(String txt){
        if(txt.equals("center"))
            x = new AlignCenter(txt);
        else if (txt.equals("left"))
                x = new AlignLeft(txt);
            else
                x = new AlignRight(txt);
    }

    public void setText(String txt){
        teext.PrintSpecial(txt);
    }

    public void acceptVisitor(Visitor v){
        v.visitParagraf(this);
    }
}
