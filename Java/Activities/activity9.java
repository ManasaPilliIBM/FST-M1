package Activities;

import java.util.ArrayList;

public class activity9 {
    public static void main(String[] args) {
        //declaring Arraylist of String objects
        ArrayList<String> arrList = new ArrayList<String>();
        //Adding objects to Array List at default index
        arrList.add("Apple");
        arrList.add("Mango");
        arrList.add("Orange");
        //Adding object at specific index
        arrList.add(3, "Grapes");
        arrList.add(1, "Papaya");

        System.out.println("Print All the Objects:");
        for(String s:arrList){
            System.out.println(s);
        }

        System.out.println("3rd element in the list is: " + arrList.get(2));
        System.out.println("Is Chikku is in list: " + arrList.contains("Chikku"));
        System.out.println("Size of ArrayList: " + arrList.size());

        arrList.remove("Papaya");

        System.out.println("New Size of ArrayList: " + arrList.size());
    }
}