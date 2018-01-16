/**
 * Created by secul on 01-Nov-17.
 */
public class AlignLeft extends AlignStrategy {

    public AlignLeft(String text){
        super(text);
    }

    public void printAlign(String text){
        System.out.println("****"+text);
    }
}
