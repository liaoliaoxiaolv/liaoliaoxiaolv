package debugging.on2020.breakpoint.method;

/**
 * Parcel 使用反射调用 Move 的 canMove
 *
 * @author moqi
 * On 12/22/20 18:35
 */

public class Parcel {

    public static void callMethod(Object obj) throws Exception {
        obj.getClass()
                .getMethod("canMove")
                .invoke(obj);
    }

    public static void main(String[] args) throws Exception {
        Device mobile = new Device();
        mobile.moveTo(10, 20);
        callMethod(mobile);
    }

}
