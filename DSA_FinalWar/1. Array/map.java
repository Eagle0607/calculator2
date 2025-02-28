import java.util.*;
class map {
    public static void main(String[] args) {
        Map<String, Integer> n=new HashMap<>();//have a key and value like a dict.
        n.put("one", 1);//put is used to add
        n.put("two", 2);//keys are unique
        n.put("three", 3); 
        System.out.println(n);
        n.putIfAbsent("two", 5); //if not exist the only add
        System.out.println(n.containsKey("four")); //boolean return
    }
}
