package jconsole;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Silence
 * @Date 2017/7/23
 * -Xms 100m -Xmx100m -XX:+UseSerialGC
 */
public class OOMObject {
    public static void main(String[] args) throws InterruptedException {
        List<Obj> list = new ArrayList<Obj>();
        for(int i = 0; i < 1000 ; i++){
            Thread.sleep(50);
            list.add(new Obj());
        }
        System.gc();

        System.out.println("end");
        Thread.sleep(Integer.MAX_VALUE);
    }

    static class Obj{
        public byte[] placeholder = new byte[64*1024];
    }
}
