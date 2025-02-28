import java.util.LinkedList;
class linkedList {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> l = new LinkedList<String>();

        // Adding elements to the LinkedList using add() method
        l.add("One");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        l.add("Five");
        l.remove();
        
        // Printing the LinkedList
        System.out.println(l);
    }
}

