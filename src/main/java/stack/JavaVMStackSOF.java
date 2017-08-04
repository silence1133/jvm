package stack;

/**
 * @author Silence
 * @Date 2017/7/23
 * -Xss128k
 */
public class JavaVMStackSOF {
    private int length = 1;
    public void stackLeak(){
        length ++ ;
        stackLeak();
    }
    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF javaVMStackSOF = new JavaVMStackSOF();
        try{
            javaVMStackSOF.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length:"+javaVMStackSOF.length);
            throw e;
        }
    }
}
