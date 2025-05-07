package lab3.declare;
import java.util.HashMap;

public class Symbol {
    private HashMap<Object, Object> symTab = new HashMap<>();

    public Symbol() {}
    
    public void put(Object key, Object value) {
        symTab.put(key, value);
    }
    
    public Object get(Object key) {
        return symTab.get(key);
    }
    
    public int getSize() {
        return symTab.size();
    }

    public void show() {
        System.out.println("Symbol Table Contents:");
        for (Object key : symTab.keySet()) {
            System.out.println("Key: " + key + ", Value: " + symTab.get(key));
        }
    }
}
