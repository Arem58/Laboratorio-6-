import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashFactory<k,v> {

    public Map<k,v> getMap(String type){
        if(type.equals("1")){
            return new HashMap<>();
        }else if(type.equals(("2"))) {
            return new TreeMap<>();
        }else if(type.equals(("3"))){
            return new LinkedHashMap<>();
        }
        return null;
    }
}
