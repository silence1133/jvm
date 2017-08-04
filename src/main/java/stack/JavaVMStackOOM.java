package stack;

/**
 * @author Silence
 * @Date 2017/7/30
 * -Xss2M
 */
    public class JavaVMStackOOM {
        public void thread(){
            while(true){
                Thread t = new Thread(new Runnable() {
                    public void run() {
                        dontStop();
                    }
                });
                t.start();
            }
        }

        private void dontStop() {
            while (true){}
        }

        public static void main(String[] args) {
            JavaVMStackOOM javaVMStackOOM = new JavaVMStackOOM();
            javaVMStackOOM.thread();
        }
    }
