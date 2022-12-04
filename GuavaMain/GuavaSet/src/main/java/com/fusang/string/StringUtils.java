package com.fusang.string;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;

public class StringUtils {
    public static void main(String[] args) {
        Joiner joiner = Joiner.on(",");
        System.out.println(joiner.join("a", "b", "c","1","赵"));
        String as = CharMatcher.digit().retainFrom("1234567890赵");
        System.out.println(CharMatcher.anyOf("78").retainFrom("1234567890赵"));
        System.out.println(as);
    }
}
