/**
 * Created by secul on 22-Nov-17.
 */
public class TextSpecial extends AbstractElement{
    private String text;

    public TextSpecial(String a){
        text = a;
    }

    public void Print(){
        System.out.println("teext special"+text);
    }
     public void PrintSpecial(String txt){
         System.out.println("teeext special"+ txt);
     }

    public void acceptVisitor(Visitor v) {
        v.visitTextSpecial(this);
    }
}
