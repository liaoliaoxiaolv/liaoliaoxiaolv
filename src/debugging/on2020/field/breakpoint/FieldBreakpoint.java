package debugging.on2020.field.breakpoint;

/**
 * 字段断点
 *
 * 可以设置读取或修改或者兼而有之时触发
 *
 * @author moqi
 * On 12/22/20 18:43
 */

public class FieldBreakpoint {

    int count = 0;

    public FieldBreakpoint() {
        count = 10;
    }

    private void inc10() {
        count += 10;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        FieldBreakpoint fb = new FieldBreakpoint();
        fb.inc10();
        System.out.println(fb.getCount());
    }

}
