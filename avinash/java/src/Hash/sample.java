package Hash;

import java.util.HashMap;

public class sample {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,10};
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(10,1);
        map.put(14,5);
        map.put(76,6);
        map.put(24,7);
        map.put(44,9);
        map.put(13,2);
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get(10));
        System.out.println(map.containsValue(10));
        System.out.println(map.isEmpty());
        System.out.println(map.getOrDefault(100,0));
    }
}
