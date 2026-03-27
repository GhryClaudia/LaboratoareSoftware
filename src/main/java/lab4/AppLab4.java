package lab4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AppLab4 {
    public static void main(String[] args)
    {
        HashMap<String, Integer> varste = new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);
        Map<String, String> adrese = Map.of("Ioan", "Sibiu", "Maria", "Bucuresti", "Victor",
                "Cluj","Simina", "Alba-Iulia","Marius", "Medias", "Mihai", "Cisnadie","Daniela", "Sibiu");
        for(Object entryObj : varste.entrySet()) {
            Map.Entry entry = (Map.Entry) entryObj;
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println();
        varste.put("Vlad", 19);
        varste.put("Iulia", 19);
        for(Object entryObj : varste.entrySet()) {
            Map.Entry entry = (Map.Entry) entryObj;
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println();
        HashMap<String, Tanar> tineri=new HashMap<>();
        for(String nume: varste.keySet()){
            int ani=varste.get(nume);
            String addr=adrese.get(nume);
            Tanar t=new Tanar(nume,ani,addr);
            tineri.put(nume,t);
        }
        for(Object entry : tineri.values()) {
            System.out.println(entry.toString());
        }
    }
}
