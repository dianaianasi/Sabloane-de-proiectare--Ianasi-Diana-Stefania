import com.sun.scenario.effect.ImageData;

/**
 * Created by secul on 25-Oct-17.
 */
public class Image extends SubjectElement {
    private String fileName;
    private ImageData data;

    public Image(String Filename){
        this.fileName = Filename;
        //data = //loadfromfile(filename);
    }


    public void Print(){
        System.out.println("File"+fileName);
    }

    public void acceptVisitor(Visitor v){
        v.visitImage(this);
    }
}
