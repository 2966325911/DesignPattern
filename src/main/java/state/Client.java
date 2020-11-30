package main.java.state;

/**
 * @author：vic
 * @date： 2020/11/30 10:49
 * @desc:
 */
public class Client {
    public static void main(String[] args) {
        HomeContext context = new HomeContext();
        context.setState(new FreeState());
        context.setState(new BookedState());
    }
}
