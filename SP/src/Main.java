import GUI.Observer;

import java.util.ArrayList;

/**
 * Created by secul on 10-Nov-17.
 */
public class Main {
    public static void main(String args[]){
        ArrayList<String> autori = new ArrayList<>();
        autori.add("Cristi Voievod");
        Carte carte = new Carte("Baba cloanta",autori);

        Sectiune sectiune = new Sectiune("Sectiunea 1");
        sectiune.Add(new Paragraf("Paragraful intai"));
        sectiune.Add(new Tabel("Tipuri de mancaruri"));
        ImageProxy image = new ImageProxy("Image1");
        ImageProxy image1 = new ImageProxy("Image2");
        Tabel tab = new Tabel("Tabel1");

        carte.AddContinut(sectiune);
        carte.AddContinut(image);
        carte.AddContinut(image1);
        carte.AddContinut(tab);

        DocumentStateVisitor dsv = new DocumentStateVisitor();
        carte.acceptVisitor(dsv);
        dsv.printStatistics();

        Observer o = new SimpleObserver();
        Paragraf p1 = new Paragraf("Paragraf");
        Paragraf p2 = new Paragraf("Paragraf2");
        Image img = new Image("Image2");
        Sectiune s = new Sectiune("Titlu");
        p1.attach(o);
        p2.attach(o);
        img.attach(o);
        s.attach(o);
        s.Add(p1);
        s.Add(p2);
        s.Add(img);
    }
}
