package main.java.state;

/**
 * @author：vic
 * @date： 2020/11/30 10:38
 * @desc: 预订状态
 */
public class BookedState implements State {
    @Override
    public void handle() {
        System.out.println(StateEnum.BOOKED.getMsg());
    }

    @Override
    public Integer getState() {
        return StateEnum.BOOKED.getState();
    }
}
