/**
 * Created by secul on 25-Oct-17.
 */
public abstract class AbstractElement implements Element {
    public void Add(Element x ){
        try {
            throw new Exception("AbstractElement");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Remove(Element x){
        try {
            throw new Exception("AbstractElement");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Element getElement(int index){
        try {
            throw new Exception("AbstractElement");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public abstract void Print();
    public abstract void acceptVisitor(Visitor v);
}
