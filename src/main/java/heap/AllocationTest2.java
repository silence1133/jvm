package heap;

/**
 * @author Silence 000996
 * @data 17/8/9
 * -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:+PrintGCDetails -XX:PretenureSizeThreshold=3145728 -XX:+UseSerialGC
 */
public class AllocationTest2 {
    public static final int _1MB = 1024*1024;
    public static void main(String[] args) {
        byte[] a1,a2,a3;
        a1=new byte[4*_1MB];
    }
}
