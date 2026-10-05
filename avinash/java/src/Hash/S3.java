package Hash;

import java.util.HashMap;

public class S3 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        String sr[]={"Riya","Divya","Seema","Riya"};
        for(int i=0;i< sr.length;i++) {
            String ch = sr[i];
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
            System.out.println(map);
            for(String key:map.keySet())
            {
                if(map.get(key)>1)
                {
                    System.out.println(key + ":" + map.get(key));
                }
        }
    }
}
