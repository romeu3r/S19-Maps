package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        String pathFile = "C:\\temp\\in.txt";
        Map<String, Integer> votes = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                if (votes.containsKey(name)) {
                    int point = votes.get(name);
                    votes.put(name, point + Integer.parseInt(fields[1]));
                } else
                    votes.put(name, Integer.parseInt(fields[1]));
                line = br.readLine();
            }
            for (String people : votes.keySet()) {
                System.out.println(people + ": " + votes.get(people));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
