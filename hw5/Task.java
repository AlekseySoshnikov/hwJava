// Реализуйте структуру телефонной книги с помощью HashMap. Программа также должна учитывать, 
// что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, 
// как одного человека с разными телефонами. 
// Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task {
    private Map<String, ArrayList<String>> dictMap = new HashMap<>();

    private boolean checkingForMissingKey(String k) {
        return dictMap.containsKey(k);
    }

    public void putNewElement(String k, String v) {
        if (checkingForMissingKey(k)) {            
            dictMap.get(k).add(v);                        
        } else {
            ArrayList<String> arraylist = new ArrayList<String>();
            arraylist.add(v);
            dictMap.put(k,arraylist);            
        } 
    }

    public void sort() {
        dictMap = dictMap
            .entrySet()
            .stream()
            .sorted(new MyComparator())
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (k, v) -> {
                    throw new RuntimeException();
                },
                LinkedHashMap:: new
            ));    
    }

    public void printMap() {
        System.out.println(dictMap);
    }
}
