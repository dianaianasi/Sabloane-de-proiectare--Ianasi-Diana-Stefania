import GUI.Observer;

import java.util.ArrayList;

/**
 * Created by secul on 10-Jan-18.
 */
public interface Subject {

    public void attach(Observer a);

    public void detach(Observer b);

    public void notify2();

}
