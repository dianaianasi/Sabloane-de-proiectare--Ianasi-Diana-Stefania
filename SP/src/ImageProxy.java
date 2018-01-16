/**
 * Created by secul on 25-Oct-17.
 */
public class ImageProxy extends AbstractElement {
    private String filename;
    private Image realImage = null;

    public ImageProxy(String FileName){
        this.filename = FileName;
    }

    public void Print(){
        realImage = new Image(filename);
        realImage.Print();
    }

    public void acceptVisitor(Visitor v){
        v.visitImageProxy(this);
    }
}
