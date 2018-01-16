import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONObject;
import org.json.JSONArray;
import java.io.FileReader;

/**
 * Created by secul on 15-Nov-17.
 */
public class JSONBuilder implements Builder {
    private String fileName;
    private Element doc;

    public JSONBuilder(String file){
        this.fileName = file;
    }

    public Element getResult(){
        return doc;
    }

    public void build(){
        JSONParser parser = new JSONParser();
        try{
            Object object = parser.parse(new FileReader("C:\\Users\\secul\\OneDrive\\Documents\\book.json"));
            JSONObject jsonObject = (JSONObject) object;
            String name = (String) jsonObject.get("class");
            switch (name){
                case "Paragraph":String title = (String) jsonObject.get("title");
            }
            String title = (String) jsonObject.get("title");
            JSONArray children = (JSONArray) jsonObject.get("children");
            for(int i=0; i<children.length();i++){
                JSONObject x = children.getJSONObject(i);
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
