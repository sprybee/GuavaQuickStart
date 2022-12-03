package com.fusang;

import java.util.Optional;

public class OptionalDemo {
    // 测试Optional
    public static void main(String[] args) {
        Optional.ofNullable(1).ifPresent(System.out::println);

        Optional<Integer> optional = Optional.of(10); // 创建一个Optional对象
        Integer integer = optional.get(); // 获取值
        Integer integer1 = optional.orElse(-1); // 获取一个默认值
        boolean present = optional.isPresent();


    }
}
