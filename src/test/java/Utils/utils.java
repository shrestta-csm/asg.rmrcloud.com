package Utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class utils {
    public void saveInfo() throws IOException, ParseException {
        String filepath = "./src/test/java/resources/customerinfo.json";
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(filepath));

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Primary First name","");
        jsonObject.put("Primary Middle name","");
        jsonObject.put("Primary Last name","");
        jsonObject.put("Primary Address","");

        jsonArray.add(jsonObject);




    }
}
