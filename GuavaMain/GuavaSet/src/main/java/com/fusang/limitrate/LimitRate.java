package com.fusang.limitrate;

import com.google.common.util.concurrent.RateLimiter;

public class LimitRate {
    private static RateLimiter bucketLimitRate = RateLimiter.create(10);

    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                if (bucketLimitRate.tryAcquire()) {
                    System.out.println("执行业务逻辑");
                } else {
                    System.out.println("限流");
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }
}
