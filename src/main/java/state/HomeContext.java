package main.java.state;

/**
 * @author：vic
 * @date： 2020/11/30 10:48
 * @desc:
 */
public class HomeContext {
    private State state;

    public void setState(State state) {
        this.state = state;
        state.handle();
    }
}
