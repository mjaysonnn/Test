

import java.io.*;
import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import java.util.*;

public class Foo
{ 
    public static void main( String[] args ) throws IOException
    {

        HashMap<String, String> map = new HashMap<String, String>();

        String line;
        BufferedReader reader = new BufferedReader(new FileReader("/Users/mj/Downloads/voca.txt"));
        while ((line = reader.readLine()) != null)
        {
            String[] parts = line.split("-");

            String key = parts[0];
            String value = parts[1];
            map.put(key, value);

        }
 /*       TreeMap<String, String> treeMap = new TreeMap<String, String>( map );
        Iterator<String> treeMapIter = treeMap.keySet().iterator();

        while( treeMapIter.hasNext()) {

            String key = treeMapIter.next();
            String value = treeMap.get( key );
            for (String key1 :treeMap.keySet())
            {
                double a=Integer.parseInt(treeMap.get(key1));
                System.out.println(a/470); //470(Training) 1619(Test)
            }
        }
        */ 
        List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(map.entrySet());
 
    
        Collections.shuffle(list);
        /*for (String key1 :map.keySet())
        {
            System.out.println(key1);
            System.out.println(map.get(key1)); //470(Training) 1619(Test)
        }*/
        int count=0;
        for (Map.Entry<String, String> entry : list) {
            System.out.println(entry.getKey() /*+ " :: " + entry.getValue()*/);
            count++;
            if(count==40) break;
        }
    }

    }
