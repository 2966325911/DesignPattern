package main.java.state;

/**
 * @author：vic
 * @date： 2020/11/30 10:39
 * @desc: 已入住状态
 */
public class CheckedInState implements State {
    @Override
    public void handle() {
        System.out.println(StateEnum.CHECKED.getMsg());
    }

    @Override
    public Integer getState() {
        return StateEnum.CHECKED.getState();
    }
}
