/**
 * Created by secul on 10-Nov-17.
 */
public class DocumentStateVisitor implements Visitor {

    private static int imageCount = 0;
    private static int paragrafCount = 0;
    private static int tabelCount = 0;
    private static int sectiuneCount = 0;
    private static int textSpecial = 0;

    public void printStatistics(){
        System.out.println("Exista:");
        System.out.println(sectiuneCount + " sectiuni");
        System.out.println(imageCount + " imagini");
        System.out.println(paragrafCount + " paragrafe");
        System.out.println(tabelCount + " tabele");
        System.out.println(textSpecial + "texte speciale");
    }

    public void visitImageProxy(ImageProxy image){
        imageCount++;
    }

    public void visitImage(Image image){
        imageCount++;
    }

    public void visitParagraf(Paragraf paragraf){
        paragrafCount++;
    }

    public void visitTabel(Tabel tabel){
        tabelCount++;
    }

    public void visitTextSpecial(TextSpecial text){
        textSpecial++;
    }

    public void visitSectiune(Sectiune sectiune){
        sectiuneCount++;

        for(Element e : sectiune.getElements())
            e.acceptVisitor(this);
    }
}
