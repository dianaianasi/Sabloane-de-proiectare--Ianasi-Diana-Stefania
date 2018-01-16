/**
 * Created by secul on 10-Nov-17.
 */
public interface Visitor {
    public void visitImageProxy(ImageProxy img);
    public void visitImage(Image image);
    public void visitParagraf(Paragraf par);
    public void visitTabel(Tabel tab);
    public void visitSectiune(Sectiune sec);
    public void visitTextSpecial(TextSpecial txt);
}
