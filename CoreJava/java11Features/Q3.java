package java11Features;
import java.util.ArrayList;

public class Q3 {
public static void main(String[] args) {
ArrayList<String>arrayList = new ArrayList<String>();
arrayList.add("A");
arrayList.add("quick");
arrayList.add("brown");
arrayList.add("fox");
arrayList.add("jumps");
arrayList.add("over");
arrayList.add("the");
arrayList.add("lazy");
arrayList.add("dog");

//converting array list to array
Object[] objects = arrayList.toArray();

for (Object obj: objects){
System.out.print(obj+" ");
        }
    }
}
