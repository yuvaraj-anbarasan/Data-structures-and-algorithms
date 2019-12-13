package data_structures.java_collections;

import java.util.Map;

class Entry<K, V> {
    K key;
    V value;
    Entry<K, V> next;

    Entry(K key, V value, Entry<K, V> next){
        this.key = key;
        this.value = value;
        this.next = next;
    }
}

class HashMap<K, V> {
    Entry<K, V> buckets[] = new Entry[26];

    public int hashCode(String key){
        return (int) key.charAt(0) - 'a';
    }

    public int hashCode(int key){
        return key;
    }

    public int getKey(int key){
        return key % buckets.length;
    }

    public void put(String key, int value){
        int index = getKey(hashCode(key));

        Entry newEntry = new Entry(key, value, null);
        if( buckets[index] == null )
            buckets[index] = newEntry;
        else{
            Entry n = buckets[index];
            while(n.next != null){
                n = n.next;
            }
            n.next = newEntry;
        }
    }

    public void get(String key){
        int index = getKey(hashCode(key));
        Entry n = buckets[index];
        System.out.print("{" + n.key + ", " + n.value + "}");
        while(n.next != null){
            n = n.next;
            System.out.print("->" + "{" + n.key + ", " + n.value + "}");
        }

    }
}

class Main{
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();

        map.put("yuvaraj", 123);
        map.put("yuvaraj", 234);
        map.put("yuvaraj", 345);

        map.get("yuvaraj");
    }
}
