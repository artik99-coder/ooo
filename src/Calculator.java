import java.util.HashMap;
import java.util.Map;

public class Calculator {
    int result;
    HashMap<String,Integer> values =new HashMap<String, Integer> (Map.ofEntries(Map.entry("I", 1),Map.entry("II", 2), Map.entry("III", 3),
            Map.entry("IV", 4), Map.entry("V", 5), Map.entry("VI", 6), Map.entry("VII", 7), Map.entry("VIII", 8), Map.entry("IX", 9),
            Map.entry("X", 10),Map.entry("XI", 11),Map.entry("XII", 12),Map.entry("XIII", 13),Map.entry("XIV", 14),Map.entry("XV", 15),
            Map.entry("XVI", 16),Map.entry("XVII", 17),Map.entry("XVIII", 18),Map.entry("XIX", 19),Map.entry("XX", 20),Map.entry("XXI", 21),
            Map.entry("XXII", 22),Map.entry("XXIII", 23),Map.entry("XXIV", 24),Map.entry("XXV", 25),Map.entry("XXVI", 26),Map.entry("XXVII", 27),
            Map.entry("XXVIII", 28),Map.entry("XXIX", 29),Map.entry("XXX", 30),Map.entry("XXXI", 31),Map.entry("XXXII", 32),Map.entry("XXXIII", 33),
            Map.entry("XXXIV", 34),Map.entry("XXXV", 35),Map.entry("XXXVI", 36),Map.entry("XXXVII", 37),Map.entry("XXXVIII", 38),Map.entry("XXXIX", 39),
            Map.entry("XL", 40),Map.entry("XLI", 41),Map.entry("XLII", 42),Map.entry("XLIII", 43),Map.entry("XLIV", 44),Map.entry("XLV", 45),Map.entry("XLVI", 46),
            Map.entry("XLVII", 47),Map.entry("XLVIII", 48),Map.entry("XLIX", 49),Map.entry("L", 50),Map.entry("LI", 51),Map.entry("LII", 52),Map.entry("LIII", 53),
            Map.entry("LIV", 54),Map.entry("LV", 55),Map.entry("LVI", 56),Map.entry("LVII", 57),Map.entry("LVIII", 58),Map.entry("LIX", 59),Map.entry("LX", 60),
            Map.entry("LXI", 61),Map.entry("LXII", 62),Map.entry("LXIII", 63),Map.entry("LXIV", 64),Map.entry("LXV", 65),Map.entry("LXVI", 66),Map.entry("LXVII", 67),
            Map.entry("LXVIII", 68),Map.entry("LXIX", 69),Map.entry("LXX", 70),Map.entry("LXXI", 71),Map.entry("LXXII", 72),Map.entry("LXXIII", 73),Map.entry("LXXIV", 74),
            Map.entry("LXXV", 75),Map.entry("LXXVI", 76),Map.entry("LXXVII", 77),Map.entry("LXXVIII", 78),Map.entry("LXXIX", 79),Map.entry("LXXX", 80),Map.entry("LXXXI", 81),
            Map.entry("LXXXII", 82),Map.entry("LXXXIII", 83),Map.entry("LXXXIV", 84),Map.entry("LXXXV", 85),Map.entry("LXXXVI", 86),Map.entry("LXXXVII", 87),Map.entry("LXXXVIII", 88),
            Map.entry("LXXXIX", 89),Map.entry("XC", 90),Map.entry("XCI", 91),Map.entry("XCII", 92),Map.entry("XCIII", 93),Map.entry("XCIV", 94),Map.entry("XCV", 95),Map.entry("XCVI", 96),
            Map.entry("XCVII", 97),Map.entry("XCVIII", 98),Map.entry("XCIX", 99),Map.entry("C", 100)));
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
