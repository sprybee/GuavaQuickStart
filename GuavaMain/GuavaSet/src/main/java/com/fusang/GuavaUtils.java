package com.fusang;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class GuavaUtils {
    public static void main(String[] args) {
        Lists.asList("a", new String[]{"b", "c"}); // 将数组转换成list
        Lists.newArrayList("a", "b", "c"); // 创建一个list
        Lists.newLinkedList(); // 创建一个链表
        Lists.newCopyOnWriteArrayList(); // 创建一个线程安全的list
        Lists.partition(Lists.newArrayList("a", "b", "c"), 2); // 将list分成多个list

        Maps.newHashMap(); // 创建一个map
//        Maps.asMap(); // 将一个数组转换成map


        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> list = Lists.newArrayList(arrayList);// 将一个list转换成另一个list

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        HashMap<Integer, Integer> map = Maps.newHashMap(hashMap);// 将一个map转换成另一个map

        Iterator<Integer> iterator = list.iterator();
        Iterable<Integer> concat = Iterables.concat(list, list);// 将多个list合并成一个list
        Iterables.getLast(concat); // 获取最后一个元素
        Iterables.getOnlyElement(concat); // 获取唯一的元素

    }
}
