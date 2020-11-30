package main.java.state;

/**
 * @author：vic
 * @date： 2020/11/30 10:47
 * @desc:
 */
public class FreeState implements State{
    @Override
    public void handle() {
        System.out.println(StateEnum.FREE.getMsg());
    }

    @Override
    public Integer getState() {
        return StateEnum.FREE.getState();
    }
}
