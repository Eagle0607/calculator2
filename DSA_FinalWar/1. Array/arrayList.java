import java.util.*;
class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();//for creating a array list
        ArrayList<Integer> list1=new ArrayList<>();
        list.add(1);//for adding element
        list.add(2);
        list.add(3);
        System.out.println(list);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list.addAll(list1); //will add all element from list1 to list
        System.out.println(list);
        list.add(1,50);//to add a element at a specific location
        System.out.println(list);
        System.out.println(list.get(4)); //to get a elemetn with index
        list.remove(1);//remove as per index
        list.remove(Integer.valueOf(6));//delete with the value
        System.out.println(list);
        list1.clear();//will delete all element
        System.out.println(list1);
        list.set(2,100); //will update the value
        System.out.println(list);
        System.out.println(list.contains(5));//contain the value or not will return true or false
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (Integer element : list) {
            System.out.println(element);
        }
        
    }
}
