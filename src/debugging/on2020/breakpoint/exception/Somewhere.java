package debugging.on2020.breakpoint.exception;

import java.util.Random;

/**
 * @author moqi
 * On 12/22/20 18:53
 */

public class Somewhere {

    public static void doSomething() {
        System.out.println("Somewhere.doSomething");
    }

    public static int doSomethingWithException() {
        Object a = null;
        Object b = new Object();
        int x = 1, y = 0, z = Integer.MAX_VALUE;

        //noinspection EnhancedSwitchMigration
        switch (new Random().nextInt(5)) {
            case 0:
                return Math.floorDiv(x, y);
            case 1:
                return a.hashCode();
            case 2:
                return Math.incrementExact(z);
            case 3:
                return Integer.parseInt("xxx");
            case 4:
                return String.valueOf(b).length();
            default:
                return 0;
        }

    }

}
