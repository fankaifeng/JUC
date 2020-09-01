package com.fkf.juc.c_031;

import java.util.Arrays;

/**
 * @author fankaifeng
 * @date 2020/5/20-14:39
 */
public class Test_unsafePublish {

    public static void main(String[] args) {
         Holder holder = new Holder(50);

        Thread[] threads = new Thread[100000];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread() {
                @Override
                public void run() {
                    holder.assertSanity();
                }
            };
        }
        Arrays.asList(threads).forEach(o -> o.start());
    }
}
