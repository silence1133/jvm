package heap;

/**
 * @author Silence 000996
 * @data 17/8/9
 */
public class AllocationTest3 {
    public static final int _1MB = 1024*1024;
    public static void main(String[] args) {
        byte[] a1,a2,a3,a4;
        a1=new byte[_1MB/4];
        a2=new byte[_1MB*3];
        a3=new byte[_1MB*4];
        a3=null;
        a4=new byte[_1MB*4];
    }
}
