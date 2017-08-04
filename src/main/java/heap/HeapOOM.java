package heap;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Silence
 * @Date 2017/7/23
 * -Xms20M -Xmx20M -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=F:\JvmTemp\dump
 */
public class HeapOOM {

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
       while(true){
           list.add(new OOMObject());
       }
    }

    static class OOMObject{
    }
}
