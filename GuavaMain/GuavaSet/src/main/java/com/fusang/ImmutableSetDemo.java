package com.fusang;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.UnmodifiableListIterator;

import java.util.HashSet;

public class ImmutableSetDemo {
    public static void main(String[] args) {
        // 创建一个不可变的数组
        ImmutableSet<String> immutableSet = ImmutableSet.of("a", "b", "c");
        // 从一个可变的数组创建一个不可变的数组
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        //        hashSet.add(null); 出现了null会报错
        immutableSet = ImmutableSet.copyOf(hashSet);
        // immutableSet.add("d"); // 报错，不可变的集合不能添加元素
        System.out.println(immutableSet);
        // 遍历不可变数组
        for (String s : immutableSet) {
            System.out.println(s);
        }

        System.out.println(" ---- --- ---- ---- ----");
        // 创建一个不可变的list
        ImmutableList<Integer> immutableList = ImmutableList.of(1, 2, 3, 4, 5, 6);
        // 遍历和输出
        System.out.println(immutableList);
        for (Integer integer : immutableList) {
            System.out.println(integer);
        }
        immutableList.spliterator(); // 并行的迭代器




    }
}
