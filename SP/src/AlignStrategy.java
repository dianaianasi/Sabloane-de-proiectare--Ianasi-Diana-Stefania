/**
 * Created by secul on 01-Nov-17.
 */
public abstract class AlignStrategy  {

    protected String text;

    public AlignStrategy(String txt){
        this.text = txt;
    }

    public abstract void printAlign(String text);
}
