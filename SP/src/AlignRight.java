/**
 * Created by secul on 01-Nov-17.
 */
public class AlignRight extends AlignStrategy {

    public AlignRight(String text){
        super(text);
    }

    public void printAlign(String text){
        System.out.println(text+"***");
    }
}
