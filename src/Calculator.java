import java.util.HashMap;
import java.util.Map;

public class Calculator {
    int result;
    HashMap<String,Integer> values =new HashMap<String, Integer> (Map.ofEntries(Map.entry("I", 1),Map.entry("II", 2), Map.entry("III", 3),
            Map.entry("IV", 4), Map.entry("V", 5), Map.entry("VI", 6), Map.entry("VII", 7), Map.entry("VIII", 8), Map.entry("IX", 9),
            Map.entry("X", 10),Map.entry("XI", 11),Map.entry("XII", 12),Map.entry("XIII", 13),Map.entry("XIV", 14),Map.entry("XV", 15),
            Map.entry("XVI", 16),Map.entry("XVII", 17),Map.entry("XVIII", 18),Map.entry("XIX", 19),Map.entry("XX", 20)));
    public String operation(String[] array) throws Exception {
        if (check(array[0])&&check(array[2])) {
            int a=Integer.parseInt(array[0]);
            if(a>10)return null;
            int b=Integer.parseInt(array[2]);
            if(b>10)return null;
            if (array[1].equals("*")) {
                result = a * b;
            }
            if (array[1].equals("/")) {
                result = a / b;
            }
            if (array[1].equals("+")) {
                result = a + b;
            }
            if (array[1].equals("-")) {
                result = a - b;
            }
            return result+"";
        }
        else if (!check(array[0])&&!check(array[2])) {
            int a=values.get(array[0]);
            if(a>10)return null;
            int b=values.get(array[2]);
            if(b>10)return null;
            if (array[1].equals("*")) {
                result = a * b;
            }
            if (array[1].equals("/")) {
                result = a / b;
            }
            if (array[1].equals("+")) {
                result = a + b;
            }
            if (array[1].equals("-")) {
                result = a - b;
            }
            if (result>=0) return ValueToKey(values,result);
        }
        return null;
    }
    public boolean check(String s){
        try {
            Integer.parseInt(s);
            return true;}
        catch (Exception e){
            return false;
        }
    }
    public String ValueToKey(HashMap<String,Integer> map, int a){
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            if(entry.getValue()==a){
                return entry.getKey();
            }
        }
        return null;
    }

}
