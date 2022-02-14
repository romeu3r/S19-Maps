package application;

import java.util.Map;
import java.util.TreeMap;

public class ExampleOfMap {
    public static void main(String[] args) {
        Map<String, String> cook = new TreeMap<>();
        cook.put("username", "Maria");
        cook.put("email", "mariga@gmail.com");
        cook.put("phone", "99115231504");

        cook.remove("email");
        cook.put("phone", "11335");

        System.out.println("Contains 'phone' key: " + cook.containsKey("phone"));
        System.out.println("Phone Number: " + cook.get("phone"));
        System.out.println("Email: " + cook.get("email"));
        System.out.println("Size: " + cook.size());

        System.out.println("All cookies");
        for (String key : cook.keySet()) {
            System.out.println(key + " " + cook.get(key));
        }
    }
}
