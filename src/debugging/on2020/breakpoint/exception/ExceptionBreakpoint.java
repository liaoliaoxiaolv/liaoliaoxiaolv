package debugging.on2020.breakpoint.exception;

/**
 * https://www.youtube.com/watch?v=AOrnx-9zNBQ
 *
 * 异常断点
 *
 * 在引发异常之前暂停应用程序
 *
 * @author moqi
 * On 12/22/20 18:50
 */

public class ExceptionBreakpoint {

    public static void main(String[] args) {
        Somewhere.doSomething();

        for (int i = 0; i < 10; i++) {
            try {
                Somewhere.doSomethingWithException();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // 一个除零异常
        int a = 1 / 0;
    }

}
