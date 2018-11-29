package org.quartz;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class DemoExecutor {
    public static void main(String[] args){
        Executor executor = Executors.newScheduledThreadPool(5);
    }
}
