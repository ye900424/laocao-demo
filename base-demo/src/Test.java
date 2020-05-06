/**
 * @author C.A.O
 * @date 2020/5/6
 */
public class Test {
    private Test() {
    }

    private static volatile Test instance;

    public static Test getInstance() {
        if (null == instance) {
            synchronized (Test.class) {
                if (null == instance) {
                    instance = new Test();
                }
            }
        }
        return instance;
    }




    public static void main(String[] args) {
        Test instance = getInstance();
    }


}
