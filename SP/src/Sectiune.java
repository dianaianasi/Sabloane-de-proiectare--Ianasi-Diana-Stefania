import java.util.ArrayList;

/**
 * Created by secul on 18-Oct-17.
 */
public class Sectiune extends SubjectElement {

    private String titlu;
    private ArrayList<Element> continutSectiune = new ArrayList<Element>();

    public Sectiune(String tit){
        titlu = tit;
    }

    public void Add(Element e) {
        continutSectiune.add(e);
    }
    public void Remove(Element x){
        continutSectiune.remove(x);
    }

    public Element getElement(int index){

        return continutSectiune.get(index);
    }

    public ArrayList<Element> getElements(){
        return continutSectiune;
    }

    public void Print(){
        for(Element e : continutSectiune){
            e.Print();
        }
    }

    public void acceptVisitor(Visitor v){
        v.visitSectiune(this);
    }

}
