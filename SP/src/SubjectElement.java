import GUI.Observer;

import java.util.ArrayList;

/**
 * Created by secul on 10-Jan-18.
 */
public class SubjectElement implements Subject, Element{

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer obs){
        observers.add(obs);
    }

    public void detach(Observer obs){
        observers.remove(obs);
    }

    public void notify2(){
        observers.forEach(Observer::update);
    }

    public void Add(Element x){

    }
    public void Remove(Element x){

    }
    public Element getElement(int index){
        return null;
    }
    public void Print(){

    }
    public void acceptVisitor(Visitor v){

    }
}
