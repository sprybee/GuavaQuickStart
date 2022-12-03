package com.fusang.collection;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;

import java.util.HashMap;
import java.util.List;

public class MultipleCollection {
    public static void main(String[] args) {
        // 这玩意就是一个map，key是一个integer ，value是一个List<Integer>
        HashMultimap<Integer,Integer> hashMultimap = HashMultimap.create();
        hashMultimap.put(1,1);
        hashMultimap.put(1,2);
        hashMultimap.put(2,3);
        System.out.println(hashMultimap);
        // 上述代码如下面所示
        HashMap<Integer, List<Integer>> multMap = new HashMap<>();
        int key = 0;
        int value = -1;
        if (multMap.containsKey(key)){
            multMap.get(key).add(value);
        }else{
            multMap.put(key, Lists.newArrayList(value));
        }
        // 移除key的值
        hashMultimap.remove(1, 2);
        hashMultimap.removeAll(1);

        // 其他和传统map差不多
        hashMultimap.keys();
        hashMultimap.keySet();

        hashMultimap.values();

        hashMultimap.asMap(); // 转成map

        /*
        *   ArrayListMultimap	    HashMap	        ArrayList
            HashMultimap	        HashMap	        HashSet
            LinkedListMultimap*	    LinkedHashMap*	LinkedList*
            LinkedHashMultimap**	LinkedHashMap	LinkedHashMap
            TreeMultimap	        TreeMap	        TreeSet
            ImmutableListMultimap	ImmutableMap	ImmutableList
            ImmutableSetMultimap	ImmutableMap	ImmutableSet
        *
        * */
    }
}
