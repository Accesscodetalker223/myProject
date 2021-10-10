package pack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        //datatype name
        int a;
        String name;
        int[] myArray = new int[5];

        ArrayList<Integer> myList = new ArrayList<Integer>();

        List<String> citiesOfEngland = new ArrayList<>();
        citiesOfEngland.add("london");
        citiesOfEngland.add("manchester");
        citiesOfEngland.add("leeds");

        Map<String, List<String>> map = new HashMap<>();
        map.put("England", citiesOfEngland);

        System.out.println(map.get("USA"));
        for(Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        Blueprint bp = new Blueprint();

         ArrayList al = new ArrayList();
         List al2 = new ArrayList();

        //datatype vs type

    }
}
