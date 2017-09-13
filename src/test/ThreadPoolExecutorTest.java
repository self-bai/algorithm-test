package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * JAVA的四种线程池
 */
public class ThreadPoolExecutorTest {

    public static void main(String[] args) {
//        fixedThreadPool();
        cachedThreadPool();
    }

    /**
     * FixedThreadPool线程池
     * 线程数量固定的线程池，当线程空闲时并不会被回收。
     * 没有额外线程，只存在核心线程
     */
    private static void fixedThreadPool() {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        runThread(fixedThreadPool);
    }

    private static void cachedThreadPool() {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        runThread(cachedThreadPool);
    }

    private static void runThread(ExecutorService threadPool) {
        for (int i = 0; i < 5; i++) {
            final int index = i;
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("这是第" + index + "个线程" + Thread.currentThread().getName());
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
