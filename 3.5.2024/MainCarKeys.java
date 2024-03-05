import  java.util.*;
public class MainCarKeys {
    public static void main(String[] args) {

        Map<String, Map<String, Map<String, Integer>>> myMap = new HashMap<>();
        myMap.put("123", new HashMap<>());
        myMap.get("123").put("key", new HashMap<>());
        myMap.get("123").get("key").put("Ivan" , 1000);
        System.out.println(myMap.get("123").get("key").get("Ivan"));





        Map<String, String> carPlates = new HashMap<>();


        carPlates.put("PB1313HS", "BMW");
        carPlates.put("PB1825CD", "Opel");
        carPlates.put("A7777AA", "Mercedes");
        carPlates.put("B1234AB", "Audi");


        carPlates.putIfAbsent("PB1213HS" , "Lada");

        System.out.println(carPlates.get("PB1313HS"));
        Set<String> keys = carPlates.keySet();
        for (String key: keys) {
            System.out.println(key + " - " + carPlates.get(key));
        }

        for (String value : carPlates.values()) {
            System.out.println(value);
        }


        for (Map.Entry<String, String> entry:carPlates.entrySet()) {
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }

    }
}
