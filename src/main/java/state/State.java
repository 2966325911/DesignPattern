package main.java.state;

/**
 * @author：vic
 * @date： 2020/11/30 10:37
 * @desc: 状态模式
 */
public interface State {
    void handle();
    Integer getState();
}
