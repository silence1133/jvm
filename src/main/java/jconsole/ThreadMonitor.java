package jconsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Silence
 * @Date 2017/7/23
 */
public class ThreadMonitor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        createBusyThread();
        br.readLine();
        Object obj = new Object();
        createLockThread(obj);
    }

    private static void createLockThread(final Object obj) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
               synchronized (obj){
                   try {
                       obj.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
            }
        },"testLockThread");
        thread.start();
    }

    private static void createBusyThread() {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                while(true);
            }
        },"testBusyThread");
        thread.start();
    }
}
