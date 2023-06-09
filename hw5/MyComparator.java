import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;

public class MyComparator implements Comparator<Map.Entry<String, ArrayList<String>>> {
    @Override
    public int compare(Map.Entry<String, ArrayList<String>> o1, Map.Entry<String, ArrayList<String>> o2) {
        if (o1.getValue().size() > o2.getValue().size()) return -1;
        if (o1.getValue().size() < o2.getValue().size()) return 1;
        else return 0;
    }
    
}