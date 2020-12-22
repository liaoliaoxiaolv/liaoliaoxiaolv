package debugging.on2020.method.breakpoint;

/**
 * Move 接口
 *
 * 可以设置方法进入或者退出或者兼而有之时触发
 *
 * @author moqi
 * On 12/22/20 18:31
 */
public interface Move {

    void moveTo(int x, int y);

    boolean canMove();

}
